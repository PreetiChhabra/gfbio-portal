


<%@ taglib uri="http://java.sun.com/portlet_2_0" 	prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" 	prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" 	prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/security" 	prefix="liferay-security" %>
<%@ taglib uri="http://liferay.com/tld/theme" 		prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" 			prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/util" 		prefix="liferay-util" %>

<%@ page import="com.liferay.portal.NoSuchModelException" %><%@
page import="com.liferay.portal.kernel.exception.SystemException" %><%@
page import="com.liferay.portal.util.PortalUtil" %>

<%@ page import="java.util.*" %>

<%@ page import="javax.portlet.*" %>
<%@ page import="javax.portlet.PortletPreferences" %>
<%@ page import="javax.portlet.RenderResponse" %>

<%@ page import="org.gfbio.model.Head" %>
<%@ page import="org.gfbio.model.Project" %>
<%@ page import="org.gfbio.model.Position" %>
<%@ page import="org.gfbio.model.ResearchObject" %>
<%@ page import="org.gfbio.service.HeadLocalServiceUtil" %>
<%@ page import="org.gfbio.service.PositionLocalServiceUtil" %>
<%@ page import="org.gfbio.service.ProjectLocalServiceUtil" %>

<%@ page import="org.json.simple.JSONObject" %>
<%@ page import="org.json.simple.parser.JSONParser" %>
<%@ page import="org.json.simple.parser.ParseException" %>
