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

package org.gfbio.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the tab_ResearchObject service. Represents a row in the &quot;gfbio_tab_ResearchObject&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.gfbio.model.impl.tab_ResearchObjectModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.gfbio.model.impl.tab_ResearchObjectImpl}.
 * </p>
 *
 * @author Felicitas Loeffler
 * @see tab_ResearchObject
 * @see org.gfbio.model.impl.tab_ResearchObjectImpl
 * @see org.gfbio.model.impl.tab_ResearchObjectModelImpl
 * @generated
 */
public interface tab_ResearchObjectModel extends BaseModel<tab_ResearchObject> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tab_ research object model instance should use the {@link tab_ResearchObject} interface instead.
	 */

	/**
	 * Returns the primary key of this tab_ research object.
	 *
	 * @return the primary key of this tab_ research object
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tab_ research object.
	 *
	 * @param primaryKey the primary key of this tab_ research object
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ro_ i d of this tab_ research object.
	 *
	 * @return the ro_ i d of this tab_ research object
	 */
	public long getRo_ID();

	/**
	 * Sets the ro_ i d of this tab_ research object.
	 *
	 * @param ro_ID the ro_ i d of this tab_ research object
	 */
	public void setRo_ID(long ro_ID);

	/**
	 * Returns the ro_name of this tab_ research object.
	 *
	 * @return the ro_name of this tab_ research object
	 */
	@AutoEscape
	public String getRo_name();

	/**
	 * Sets the ro_name of this tab_ research object.
	 *
	 * @param ro_name the ro_name of this tab_ research object
	 */
	public void setRo_name(String ro_name);

	/**
	 * Returns the ro_meta of this tab_ research object.
	 *
	 * @return the ro_meta of this tab_ research object
	 */
	@AutoEscape
	public String getRo_meta();

	/**
	 * Sets the ro_meta of this tab_ research object.
	 *
	 * @param ro_meta the ro_meta of this tab_ research object
	 */
	public void setRo_meta(String ro_meta);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(tab_ResearchObject tab_ResearchObject);

	@Override
	public int hashCode();

	@Override
	public CacheModel<tab_ResearchObject> toCacheModel();

	@Override
	public tab_ResearchObject toEscapedModel();

	@Override
	public tab_ResearchObject toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}