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

package org.gfbio.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import org.gfbio.model.Project_ResearchObject;

import org.gfbio.service.Project_ResearchObjectService;
import org.gfbio.service.persistence.ProjectPersistence;
import org.gfbio.service.persistence.Project_ResearchObjectPersistence;
import org.gfbio.service.persistence.Project_UserPersistence;
import org.gfbio.service.persistence.Project_User_PIPersistence;
import org.gfbio.service.persistence.ResearchObjectPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the project_ research object remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.gfbio.service.impl.Project_ResearchObjectServiceImpl}.
 * </p>
 *
 * @author Felicitas Loeffler
 * @see org.gfbio.service.impl.Project_ResearchObjectServiceImpl
 * @see org.gfbio.service.Project_ResearchObjectServiceUtil
 * @generated
 */
public abstract class Project_ResearchObjectServiceBaseImpl
	extends BaseServiceImpl implements Project_ResearchObjectService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.gfbio.service.Project_ResearchObjectServiceUtil} to access the project_ research object remote service.
	 */

	/**
	 * Returns the project local service.
	 *
	 * @return the project local service
	 */
	public org.gfbio.service.ProjectLocalService getProjectLocalService() {
		return projectLocalService;
	}

	/**
	 * Sets the project local service.
	 *
	 * @param projectLocalService the project local service
	 */
	public void setProjectLocalService(
		org.gfbio.service.ProjectLocalService projectLocalService) {
		this.projectLocalService = projectLocalService;
	}

	/**
	 * Returns the project remote service.
	 *
	 * @return the project remote service
	 */
	public org.gfbio.service.ProjectService getProjectService() {
		return projectService;
	}

	/**
	 * Sets the project remote service.
	 *
	 * @param projectService the project remote service
	 */
	public void setProjectService(
		org.gfbio.service.ProjectService projectService) {
		this.projectService = projectService;
	}

	/**
	 * Returns the project persistence.
	 *
	 * @return the project persistence
	 */
	public ProjectPersistence getProjectPersistence() {
		return projectPersistence;
	}

	/**
	 * Sets the project persistence.
	 *
	 * @param projectPersistence the project persistence
	 */
	public void setProjectPersistence(ProjectPersistence projectPersistence) {
		this.projectPersistence = projectPersistence;
	}

	/**
	 * Returns the project_ research object local service.
	 *
	 * @return the project_ research object local service
	 */
	public org.gfbio.service.Project_ResearchObjectLocalService getProject_ResearchObjectLocalService() {
		return project_ResearchObjectLocalService;
	}

	/**
	 * Sets the project_ research object local service.
	 *
	 * @param project_ResearchObjectLocalService the project_ research object local service
	 */
	public void setProject_ResearchObjectLocalService(
		org.gfbio.service.Project_ResearchObjectLocalService project_ResearchObjectLocalService) {
		this.project_ResearchObjectLocalService = project_ResearchObjectLocalService;
	}

	/**
	 * Returns the project_ research object remote service.
	 *
	 * @return the project_ research object remote service
	 */
	public org.gfbio.service.Project_ResearchObjectService getProject_ResearchObjectService() {
		return project_ResearchObjectService;
	}

	/**
	 * Sets the project_ research object remote service.
	 *
	 * @param project_ResearchObjectService the project_ research object remote service
	 */
	public void setProject_ResearchObjectService(
		org.gfbio.service.Project_ResearchObjectService project_ResearchObjectService) {
		this.project_ResearchObjectService = project_ResearchObjectService;
	}

	/**
	 * Returns the project_ research object persistence.
	 *
	 * @return the project_ research object persistence
	 */
	public Project_ResearchObjectPersistence getProject_ResearchObjectPersistence() {
		return project_ResearchObjectPersistence;
	}

	/**
	 * Sets the project_ research object persistence.
	 *
	 * @param project_ResearchObjectPersistence the project_ research object persistence
	 */
	public void setProject_ResearchObjectPersistence(
		Project_ResearchObjectPersistence project_ResearchObjectPersistence) {
		this.project_ResearchObjectPersistence = project_ResearchObjectPersistence;
	}

	/**
	 * Returns the project_ user local service.
	 *
	 * @return the project_ user local service
	 */
	public org.gfbio.service.Project_UserLocalService getProject_UserLocalService() {
		return project_UserLocalService;
	}

	/**
	 * Sets the project_ user local service.
	 *
	 * @param project_UserLocalService the project_ user local service
	 */
	public void setProject_UserLocalService(
		org.gfbio.service.Project_UserLocalService project_UserLocalService) {
		this.project_UserLocalService = project_UserLocalService;
	}

	/**
	 * Returns the project_ user remote service.
	 *
	 * @return the project_ user remote service
	 */
	public org.gfbio.service.Project_UserService getProject_UserService() {
		return project_UserService;
	}

	/**
	 * Sets the project_ user remote service.
	 *
	 * @param project_UserService the project_ user remote service
	 */
	public void setProject_UserService(
		org.gfbio.service.Project_UserService project_UserService) {
		this.project_UserService = project_UserService;
	}

	/**
	 * Returns the project_ user persistence.
	 *
	 * @return the project_ user persistence
	 */
	public Project_UserPersistence getProject_UserPersistence() {
		return project_UserPersistence;
	}

	/**
	 * Sets the project_ user persistence.
	 *
	 * @param project_UserPersistence the project_ user persistence
	 */
	public void setProject_UserPersistence(
		Project_UserPersistence project_UserPersistence) {
		this.project_UserPersistence = project_UserPersistence;
	}

	/**
	 * Returns the project_ user_ p i local service.
	 *
	 * @return the project_ user_ p i local service
	 */
	public org.gfbio.service.Project_User_PILocalService getProject_User_PILocalService() {
		return project_User_PILocalService;
	}

	/**
	 * Sets the project_ user_ p i local service.
	 *
	 * @param project_User_PILocalService the project_ user_ p i local service
	 */
	public void setProject_User_PILocalService(
		org.gfbio.service.Project_User_PILocalService project_User_PILocalService) {
		this.project_User_PILocalService = project_User_PILocalService;
	}

	/**
	 * Returns the project_ user_ p i remote service.
	 *
	 * @return the project_ user_ p i remote service
	 */
	public org.gfbio.service.Project_User_PIService getProject_User_PIService() {
		return project_User_PIService;
	}

	/**
	 * Sets the project_ user_ p i remote service.
	 *
	 * @param project_User_PIService the project_ user_ p i remote service
	 */
	public void setProject_User_PIService(
		org.gfbio.service.Project_User_PIService project_User_PIService) {
		this.project_User_PIService = project_User_PIService;
	}

	/**
	 * Returns the project_ user_ p i persistence.
	 *
	 * @return the project_ user_ p i persistence
	 */
	public Project_User_PIPersistence getProject_User_PIPersistence() {
		return project_User_PIPersistence;
	}

	/**
	 * Sets the project_ user_ p i persistence.
	 *
	 * @param project_User_PIPersistence the project_ user_ p i persistence
	 */
	public void setProject_User_PIPersistence(
		Project_User_PIPersistence project_User_PIPersistence) {
		this.project_User_PIPersistence = project_User_PIPersistence;
	}

	/**
	 * Returns the research object local service.
	 *
	 * @return the research object local service
	 */
	public org.gfbio.service.ResearchObjectLocalService getResearchObjectLocalService() {
		return researchObjectLocalService;
	}

	/**
	 * Sets the research object local service.
	 *
	 * @param researchObjectLocalService the research object local service
	 */
	public void setResearchObjectLocalService(
		org.gfbio.service.ResearchObjectLocalService researchObjectLocalService) {
		this.researchObjectLocalService = researchObjectLocalService;
	}

	/**
	 * Returns the research object remote service.
	 *
	 * @return the research object remote service
	 */
	public org.gfbio.service.ResearchObjectService getResearchObjectService() {
		return researchObjectService;
	}

	/**
	 * Sets the research object remote service.
	 *
	 * @param researchObjectService the research object remote service
	 */
	public void setResearchObjectService(
		org.gfbio.service.ResearchObjectService researchObjectService) {
		this.researchObjectService = researchObjectService;
	}

	/**
	 * Returns the research object persistence.
	 *
	 * @return the research object persistence
	 */
	public ResearchObjectPersistence getResearchObjectPersistence() {
		return researchObjectPersistence;
	}

	/**
	 * Sets the research object persistence.
	 *
	 * @param researchObjectPersistence the research object persistence
	 */
	public void setResearchObjectPersistence(
		ResearchObjectPersistence researchObjectPersistence) {
		this.researchObjectPersistence = researchObjectPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return Project_ResearchObject.class;
	}

	protected String getModelClassName() {
		return Project_ResearchObject.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = project_ResearchObjectPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = org.gfbio.service.ProjectLocalService.class)
	protected org.gfbio.service.ProjectLocalService projectLocalService;
	@BeanReference(type = org.gfbio.service.ProjectService.class)
	protected org.gfbio.service.ProjectService projectService;
	@BeanReference(type = ProjectPersistence.class)
	protected ProjectPersistence projectPersistence;
	@BeanReference(type = org.gfbio.service.Project_ResearchObjectLocalService.class)
	protected org.gfbio.service.Project_ResearchObjectLocalService project_ResearchObjectLocalService;
	@BeanReference(type = org.gfbio.service.Project_ResearchObjectService.class)
	protected org.gfbio.service.Project_ResearchObjectService project_ResearchObjectService;
	@BeanReference(type = Project_ResearchObjectPersistence.class)
	protected Project_ResearchObjectPersistence project_ResearchObjectPersistence;
	@BeanReference(type = org.gfbio.service.Project_UserLocalService.class)
	protected org.gfbio.service.Project_UserLocalService project_UserLocalService;
	@BeanReference(type = org.gfbio.service.Project_UserService.class)
	protected org.gfbio.service.Project_UserService project_UserService;
	@BeanReference(type = Project_UserPersistence.class)
	protected Project_UserPersistence project_UserPersistence;
	@BeanReference(type = org.gfbio.service.Project_User_PILocalService.class)
	protected org.gfbio.service.Project_User_PILocalService project_User_PILocalService;
	@BeanReference(type = org.gfbio.service.Project_User_PIService.class)
	protected org.gfbio.service.Project_User_PIService project_User_PIService;
	@BeanReference(type = Project_User_PIPersistence.class)
	protected Project_User_PIPersistence project_User_PIPersistence;
	@BeanReference(type = org.gfbio.service.ResearchObjectLocalService.class)
	protected org.gfbio.service.ResearchObjectLocalService researchObjectLocalService;
	@BeanReference(type = org.gfbio.service.ResearchObjectService.class)
	protected org.gfbio.service.ResearchObjectService researchObjectService;
	@BeanReference(type = ResearchObjectPersistence.class)
	protected ResearchObjectPersistence researchObjectPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private Project_ResearchObjectServiceClpInvoker _clpInvoker = new Project_ResearchObjectServiceClpInvoker();
}