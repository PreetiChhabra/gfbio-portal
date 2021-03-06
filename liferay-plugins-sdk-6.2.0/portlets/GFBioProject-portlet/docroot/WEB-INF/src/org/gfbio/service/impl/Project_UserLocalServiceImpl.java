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

package org.gfbio.service.impl;

import com.liferay.portal.kernel.exception.SystemException;

import java.util.Date;
import java.util.List;

import org.gfbio.NoSuchProject_UserException;
import org.gfbio.model.Project_User;
import org.gfbio.service.base.Project_UserLocalServiceBaseImpl;
import org.gfbio.service.persistence.Project_UserPK;

/**
 * The implementation of the project_ user local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.gfbio.service.Project_UserLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Felicitas Loeffler
 * @see org.gfbio.service.base.Project_UserLocalServiceBaseImpl
 * @see org.gfbio.service.Project_UserLocalServiceUtil
 */
public class Project_UserLocalServiceImpl extends Project_UserLocalServiceBaseImpl {

	//get a ID-List (Project_User-Object) of all project of a specific user
	public List<Project_User> getProjectIDList(long userID) {
		List<Project_User> idList = null;
		try {
			idList = project_UserPersistence.findByUserID(userID);
		} catch (SystemException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();
		}

		return idList;
	}
	//update or create a Project and set the relationship to User
	public long updateProjectUser(long projectID, long userID, Date startDate, Date endDate) throws NoSuchProject_UserException, SystemException {

		Project_User relation = null;
		Project_UserPK pk = new Project_UserPK(projectID, userID);

		try {
			relation = project_UserPersistence.findByPrimaryKey(pk);
		} catch (NoSuchProject_UserException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();
		}

		//create new relationship between project and user

		if (relation == null) {
			relation = project_UserPersistence.create(pk);
			relation.setStartDate(startDate);
			relation.setEndDate(endDate);
		}
		//update the relationship between project and user
		else {
			relation.setStartDate(startDate);
			relation.setEndDate(endDate);
		}

		super.updateProject_User(relation);
		return relation.getUserID() + relation.getProjectID();
	}

}