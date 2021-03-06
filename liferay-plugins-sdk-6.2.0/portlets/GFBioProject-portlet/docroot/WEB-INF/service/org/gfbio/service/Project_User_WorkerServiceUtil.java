/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.gfbio.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Project_User_Worker. This utility wraps
 * {@link org.gfbio.service.impl.Project_User_WorkerServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author froemm
 * @see Project_User_WorkerService
 * @see org.gfbio.service.base.Project_User_WorkerServiceBaseImpl
 * @see org.gfbio.service.impl.Project_User_WorkerServiceImpl
 * @generated
 */
public class Project_User_WorkerServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.gfbio.service.impl.Project_User_WorkerServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static Project_User_WorkerService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					Project_User_WorkerService.class.getName());

			if (invokableService instanceof Project_User_WorkerService) {
				_service = (Project_User_WorkerService)invokableService;
			}
			else {
				_service = new Project_User_WorkerServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(Project_User_WorkerServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(Project_User_WorkerService service) {
	}

	private static Project_User_WorkerService _service;
}