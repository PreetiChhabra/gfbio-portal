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

package org.gfbio.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import org.gfbio.model.Project_User;
import org.gfbio.model.Project_UserModel;
import org.gfbio.model.Project_UserSoap;

import org.gfbio.service.persistence.Project_UserPK;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Project_User service. Represents a row in the &quot;gfbio_Project_User&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.gfbio.model.Project_UserModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Project_UserImpl}.
 * </p>
 *
 * @author Felicitas Loeffler
 * @see Project_UserImpl
 * @see org.gfbio.model.Project_User
 * @see org.gfbio.model.Project_UserModel
 * @generated
 */
@JSON(strict = true)
public class Project_UserModelImpl extends BaseModelImpl<Project_User>
	implements Project_UserModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a project_ user model instance should use the {@link org.gfbio.model.Project_User} interface instead.
	 */
	public static final String TABLE_NAME = "gfbio_Project_User";
	public static final Object[][] TABLE_COLUMNS = {
			{ "projectID", Types.BIGINT },
			{ "userID", Types.BIGINT },
			{ "startDate", Types.TIMESTAMP },
			{ "endDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table gfbio_Project_User (projectID LONG not null,userID LONG not null,startDate DATE null,endDate DATE null,primary key (projectID, userID))";
	public static final String TABLE_SQL_DROP = "drop table gfbio_Project_User";
	public static final String ORDER_BY_JPQL = " ORDER BY project_User.id.projectID ASC, project_User.id.userID ASC";
	public static final String ORDER_BY_SQL = " ORDER BY gfbio_Project_User.projectID ASC, gfbio_Project_User.userID ASC";
	public static final String DATA_SOURCE = "gfbioDataSource";
	public static final String SESSION_FACTORY = "gfbioSessionFactory";
	public static final String TX_MANAGER = "gfbioTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.gfbio.model.Project_User"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.gfbio.model.Project_User"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.gfbio.model.Project_User"),
			true);
	public static long PROJECTID_COLUMN_BITMASK = 1L;
	public static long USERID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Project_User toModel(Project_UserSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Project_User model = new Project_UserImpl();

		model.setProjectID(soapModel.getProjectID());
		model.setUserID(soapModel.getUserID());
		model.setStartDate(soapModel.getStartDate());
		model.setEndDate(soapModel.getEndDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Project_User> toModels(Project_UserSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Project_User> models = new ArrayList<Project_User>(soapModels.length);

		for (Project_UserSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.gfbio.model.Project_User"));

	public Project_UserModelImpl() {
	}

	@Override
	public Project_UserPK getPrimaryKey() {
		return new Project_UserPK(_projectID, _userID);
	}

	@Override
	public void setPrimaryKey(Project_UserPK primaryKey) {
		setProjectID(primaryKey.projectID);
		setUserID(primaryKey.userID);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new Project_UserPK(_projectID, _userID);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((Project_UserPK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return Project_User.class;
	}

	@Override
	public String getModelClassName() {
		return Project_User.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("projectID", getProjectID());
		attributes.put("userID", getUserID());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long projectID = (Long)attributes.get("projectID");

		if (projectID != null) {
			setProjectID(projectID);
		}

		Long userID = (Long)attributes.get("userID");

		if (userID != null) {
			setUserID(userID);
		}

		Date startDate = (Date)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		Date endDate = (Date)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}
	}

	@JSON
	@Override
	public long getProjectID() {
		return _projectID;
	}

	@Override
	public void setProjectID(long projectID) {
		_columnBitmask |= PROJECTID_COLUMN_BITMASK;

		if (!_setOriginalProjectID) {
			_setOriginalProjectID = true;

			_originalProjectID = _projectID;
		}

		_projectID = projectID;
	}

	public long getOriginalProjectID() {
		return _originalProjectID;
	}

	@JSON
	@Override
	public long getUserID() {
		return _userID;
	}

	@Override
	public void setUserID(long userID) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserID) {
			_setOriginalUserID = true;

			_originalUserID = _userID;
		}

		_userID = userID;
	}

	public long getOriginalUserID() {
		return _originalUserID;
	}

	@JSON
	@Override
	public Date getStartDate() {
		return _startDate;
	}

	@Override
	public void setStartDate(Date startDate) {
		_startDate = startDate;
	}

	@JSON
	@Override
	public Date getEndDate() {
		return _endDate;
	}

	@Override
	public void setEndDate(Date endDate) {
		_endDate = endDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public Project_User toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Project_User)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		Project_UserImpl project_UserImpl = new Project_UserImpl();

		project_UserImpl.setProjectID(getProjectID());
		project_UserImpl.setUserID(getUserID());
		project_UserImpl.setStartDate(getStartDate());
		project_UserImpl.setEndDate(getEndDate());

		project_UserImpl.resetOriginalValues();

		return project_UserImpl;
	}

	@Override
	public int compareTo(Project_User project_User) {
		Project_UserPK primaryKey = project_User.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Project_User)) {
			return false;
		}

		Project_User project_User = (Project_User)obj;

		Project_UserPK primaryKey = project_User.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public void resetOriginalValues() {
		Project_UserModelImpl project_UserModelImpl = this;

		project_UserModelImpl._originalProjectID = project_UserModelImpl._projectID;

		project_UserModelImpl._setOriginalProjectID = false;

		project_UserModelImpl._originalUserID = project_UserModelImpl._userID;

		project_UserModelImpl._setOriginalUserID = false;

		project_UserModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Project_User> toCacheModel() {
		Project_UserCacheModel project_UserCacheModel = new Project_UserCacheModel();

		project_UserCacheModel.projectID = getProjectID();

		project_UserCacheModel.userID = getUserID();

		Date startDate = getStartDate();

		if (startDate != null) {
			project_UserCacheModel.startDate = startDate.getTime();
		}
		else {
			project_UserCacheModel.startDate = Long.MIN_VALUE;
		}

		Date endDate = getEndDate();

		if (endDate != null) {
			project_UserCacheModel.endDate = endDate.getTime();
		}
		else {
			project_UserCacheModel.endDate = Long.MIN_VALUE;
		}

		return project_UserCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{projectID=");
		sb.append(getProjectID());
		sb.append(", userID=");
		sb.append(getUserID());
		sb.append(", startDate=");
		sb.append(getStartDate());
		sb.append(", endDate=");
		sb.append(getEndDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("org.gfbio.model.Project_User");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>projectID</column-name><column-value><![CDATA[");
		sb.append(getProjectID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userID</column-name><column-value><![CDATA[");
		sb.append(getUserID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startDate</column-name><column-value><![CDATA[");
		sb.append(getStartDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>endDate</column-name><column-value><![CDATA[");
		sb.append(getEndDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Project_User.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Project_User.class
		};
	private long _projectID;
	private long _originalProjectID;
	private boolean _setOriginalProjectID;
	private long _userID;
	private long _originalUserID;
	private boolean _setOriginalUserID;
	private Date _startDate;
	private Date _endDate;
	private long _columnBitmask;
	private Project_User _escapedModel;
}