package org.gfbio.archiving;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.cache.MultiVMPoolUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.webcache.WebCachePoolUtil;

import java.io.IOException;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.gfbio.service.ResearchObjectLocalServiceUtil;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Portlet implementation class ArchivingPortlet
 */
public class ArchivingPortlet extends GenericPortlet {
	
	protected void include(String path, RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

		PortletRequestDispatcher portletRequestDispatcher = getPortletContext().getRequestDispatcher(path);

		if (portletRequestDispatcher == null) 
			_log.error(path + " is not a valid include");
		else 
			portletRequestDispatcher.include(renderRequest, renderResponse);
	}

	protected String viewTemplate;

	private static Log _log = LogFactoryUtil.getLog(ArchivingPortlet.class);

	


	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

		CacheRegistryUtil.clear();
		MultiVMPoolUtil.clear();
		WebCachePoolUtil.clear();
		include(viewTemplate, renderRequest, renderResponse);
	}

	public void init() {
		viewTemplate = getInitParameter("view-template");
	}
	
	public void serveResource(ResourceRequest request, ResourceResponse response) throws IOException, PortletException {

		response.setContentType("text/html");

		if (request.getParameter("responseTarget") != null) {

			//choose a project
			if ("choosePro".toString().equals(request.getParameter("responseTarget").toString()))
				chooseProject(request, response);

			//new ResearchObject / sequence meta data over GCDJ Widget
			if ("GCDJWidget".toString().equals(request.getParameter("responseTarget").toString()))
				newResearchObject(request, response);
		}
	}
	
	// choose Dataset
	public void chooseProject(ResourceRequest request, ResourceResponse response) throws IOException, PortletException {

		String projectID = request.getParameter("data").substring(1, request.getParameter("data").length()-1);
		PortletPreferences prefs = request.getPreferences();

		if (projectID != null) {
		prefs.setValue("choPro", projectID);
		prefs.store();
		}
	}


	public void newResearchObject(ResourceRequest request, ResourceResponse response) {
		try {
			long researchObjectID = 0;
			long projectID = Long.valueOf(request.getParameter("projId")).longValue();

			JSONParser parser = new JSONParser();
			JSONObject json = new JSONObject();
			try {
				json = (JSONObject) parser.parse(request.getParameter("data"));
			} catch (ParseException e1) {e1.printStackTrace();}

			String name = (String) json.get("project_name");
			String label = (String) json.get("project_name");
			String data = json.toString();
			String formatdata = unpackJSON(data);

			researchObjectID = ResearchObjectLocalServiceUtil.updateResearchObject(projectID, researchObjectID, name, label, data, formatdata);
		} catch (SystemException e1) {e1.printStackTrace();	}
	}



	public static String unpackJSON(String json) {
		JSONUnpackString jsonUnpack = new JSONUnpackString (json, "", 1);
		jsonUnpack = unpackJSONrek(jsonUnpack);
		json = "{".concat(jsonUnpack.getText()).concat("}");
		return json;
	}

	
	public static JSONUnpackString unpackJSONrek(JSONUnpackString jsonUnpack) {
		String origntext = jsonUnpack.getOrigntext();
		int k = jsonUnpack.getIndex();
		char open = '{';
		char close = '}';
		char comma = ',';

		//prueft Zeichen fuer Zeichen den Text
		for (int i = k; i<origntext.length(); i++) {
			//wenn neues JSON gefunden wird
			if (origntext.charAt(i)== open) {
				int j = i;
				//key des neuen JSON ausschliessen
				while (origntext.charAt(j)!= comma && j>= k) 
					j--;
				
				if (k!= j) 
					jsonUnpack.addText(origntext.substring(k, j+1));
				
				jsonUnpack.setIndex(i+1);
				//und neue rekurssion starten
				jsonUnpack = unpackJSONrek(jsonUnpack);
				k = jsonUnpack.getIndex();
				i = jsonUnpack.getIndex();
			}
			//JSON abschliessen
			if (origntext.charAt(i)== close) {
				jsonUnpack.addText(origntext.substring(k, i));
				jsonUnpack.setIndex(i+1);
				return jsonUnpack;
			}
		}

		jsonUnpack.addText(origntext.substring(k, origntext.length()));
		return jsonUnpack;
	}




}