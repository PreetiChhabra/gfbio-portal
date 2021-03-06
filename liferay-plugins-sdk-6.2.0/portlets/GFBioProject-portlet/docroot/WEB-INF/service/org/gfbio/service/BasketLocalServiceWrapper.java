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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BasketLocalService}.
 *
 * @author Felicitas Loeffler
 * @see BasketLocalService
 * @generated
 */
public class BasketLocalServiceWrapper implements BasketLocalService,
	ServiceWrapper<BasketLocalService> {
	public BasketLocalServiceWrapper(BasketLocalService basketLocalService) {
		_basketLocalService = basketLocalService;
	}

	/**
	* Adds the basket to the database. Also notifies the appropriate model listeners.
	*
	* @param basket the basket
	* @return the basket that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.gfbio.model.Basket addBasket(org.gfbio.model.Basket basket)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basketLocalService.addBasket(basket);
	}

	/**
	* Creates a new basket with the primary key. Does not add the basket to the database.
	*
	* @param basketID the primary key for the new basket
	* @return the new basket
	*/
	@Override
	public org.gfbio.model.Basket createBasket(long basketID) {
		return _basketLocalService.createBasket(basketID);
	}

	/**
	* Deletes the basket with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param basketID the primary key of the basket
	* @return the basket that was removed
	* @throws PortalException if a basket with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.gfbio.model.Basket deleteBasket(long basketID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _basketLocalService.deleteBasket(basketID);
	}

	/**
	* Deletes the basket from the database. Also notifies the appropriate model listeners.
	*
	* @param basket the basket
	* @return the basket that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.gfbio.model.Basket deleteBasket(org.gfbio.model.Basket basket)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basketLocalService.deleteBasket(basket);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _basketLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basketLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.gfbio.model.impl.BasketModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _basketLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.gfbio.model.impl.BasketModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basketLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basketLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basketLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public org.gfbio.model.Basket fetchBasket(long basketID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basketLocalService.fetchBasket(basketID);
	}

	/**
	* Returns the basket with the primary key.
	*
	* @param basketID the primary key of the basket
	* @return the basket
	* @throws PortalException if a basket with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.gfbio.model.Basket getBasket(long basketID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _basketLocalService.getBasket(basketID);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _basketLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the baskets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.gfbio.model.impl.BasketModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of baskets
	* @param end the upper bound of the range of baskets (not inclusive)
	* @return the range of baskets
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<org.gfbio.model.Basket> getBaskets(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basketLocalService.getBaskets(start, end);
	}

	/**
	* Returns the number of baskets.
	*
	* @return the number of baskets
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getBasketsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basketLocalService.getBasketsCount();
	}

	/**
	* Updates the basket in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param basket the basket
	* @return the basket that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.gfbio.model.Basket updateBasket(org.gfbio.model.Basket basket)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basketLocalService.updateBasket(basket);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _basketLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_basketLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _basketLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public org.gfbio.model.Basket getBasketById(long basketId)
		throws com.liferay.portal.NoSuchModelException,
			com.liferay.portal.kernel.exception.SystemException {
		return _basketLocalService.getBasketById(basketId);
	}

	@Override
	public java.util.List<org.gfbio.model.Basket> getBasketsByIds(
		long[] basketIds)
		throws com.liferay.portal.NoSuchModelException,
			com.liferay.portal.kernel.exception.SystemException {
		return _basketLocalService.getBasketsByIds(basketIds);
	}

	@Override
	public java.util.List<org.gfbio.model.Basket> getBasketsByUserAndPeriod(
		long userId, int period)
		throws com.liferay.portal.NoSuchModelException,
			com.liferay.portal.kernel.exception.SystemException {
		return _basketLocalService.getBasketsByUserAndPeriod(userId, period);
	}

	@Override
	public java.util.List<org.gfbio.model.Basket> getBasketsByUserId(
		long userId)
		throws com.liferay.portal.NoSuchModelException,
			com.liferay.portal.kernel.exception.SystemException {
		return _basketLocalService.getBasketsByUserId(userId);
	}

	@Override
	public java.util.List<java.lang.Long> getBasketsIdByUserAndPeriod(
		long userId, int period)
		throws com.liferay.portal.NoSuchModelException,
			com.liferay.portal.kernel.exception.SystemException {
		return _basketLocalService.getBasketsIdByUserAndPeriod(userId, period);
	}

	@Override
	public java.util.List<java.lang.Long> getBasketsIdByUserId(long userId)
		throws com.liferay.portal.NoSuchModelException,
			com.liferay.portal.kernel.exception.SystemException {
		return _basketLocalService.getBasketsIdByUserId(userId);
	}

	@Override
	public long updateBasket(long basketId, long userId, java.lang.String name,
		java.lang.String basketJSON, java.lang.String queryJSON)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _basketLocalService.updateBasket(basketId, userId, name,
			basketJSON, queryJSON);
	}

	@Override
	public org.gfbio.model.Basket removeBasket(long basketId, long userId)
		throws com.liferay.portal.NoSuchModelException,
			com.liferay.portal.kernel.exception.SystemException {
		return _basketLocalService.removeBasket(basketId, userId);
	}

	@Override
	public java.util.Date getStartDateFromPeriod(int period) {
		return _basketLocalService.getStartDateFromPeriod(period);
	}

	@Override
	public java.util.Map<java.lang.Long, java.lang.String> getBasketUsersIds(
		long userId) throws java.lang.Exception {
		return _basketLocalService.getBasketUsersIds(userId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public BasketLocalService getWrappedBasketLocalService() {
		return _basketLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedBasketLocalService(
		BasketLocalService basketLocalService) {
		_basketLocalService = basketLocalService;
	}

	@Override
	public BasketLocalService getWrappedService() {
		return _basketLocalService;
	}

	@Override
	public void setWrappedService(BasketLocalService basketLocalService) {
		_basketLocalService = basketLocalService;
	}

	private BasketLocalService _basketLocalService;
}