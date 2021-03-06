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

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.List;
import java.util.Map;

import org.gfbio.model.Basket;
import org.gfbio.service.BasketLocalServiceUtil;
import org.gfbio.service.base.BasketServiceBaseImpl;

/**
 * The implementation of the basket remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.gfbio.service.BasketService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Felicitas Loeffler
 * @see org.gfbio.service.base.BasketServiceBaseImpl
 * @see org.gfbio.service.BasketServiceUtil
 */
public class BasketServiceImpl extends BasketServiceBaseImpl {
	public Basket getBasketById(long basketId) throws SystemException {
		try {
			return BasketLocalServiceUtil.getBasketById(basketId);
		} catch (NoSuchModelException e) {
			e.printStackTrace();
		}

		return null;
	}

	public List<Basket> getBasketsByIds(long[] basketIds) throws SystemException {
		try {
			return BasketLocalServiceUtil.getBasketsByIds(basketIds);
		} catch (NoSuchModelException e) {
			e.printStackTrace();
		}

		return null;
	}

	public List<Basket> getBasketsByUserAndPeriod(long userId, int period) throws SystemException {
		try {
			return BasketLocalServiceUtil.getBasketsByUserAndPeriod(userId, period);
		} catch (NoSuchModelException e) {
			e.printStackTrace();
		}

		return null;
	}

	public List<Basket> getBasketsByUserId(long userId) throws SystemException {
		try {
			return BasketLocalServiceUtil.getBasketsByUserId(userId);
		} catch (NoSuchModelException e) {
			e.printStackTrace();
		}

		return null;
	}

	public List<Long> getBasketsIdByUserAndPeriod(long userId, int period) throws SystemException {
		try {
			return BasketLocalServiceUtil.getBasketsIdByUserAndPeriod(userId, period);
		} catch (NoSuchModelException e) {
			e.printStackTrace();
		}

		return null;
	}

	public List<Long> getBasketsIdByUserId(long userId) throws SystemException {
		try {
			return BasketLocalServiceUtil.getBasketsIdByUserId(userId);
		} catch (NoSuchModelException e) {
			e.printStackTrace();
		}

		return null;
	}

	public long updateBasket(long basketId, long userId, String name, String basketJSON, String queryJSON) throws SystemException {
		return BasketLocalServiceUtil.updateBasket(basketId, userId, name, basketJSON, queryJSON);
	}

	public Basket removeBasket(long basketId, long userId)
			throws NoSuchModelException, SystemException {
		return BasketLocalServiceUtil.removeBasket(basketId,userId);
	}
	
	public Map<Long,String> getBasketUsersIds(long userId) throws Exception{
		return BasketLocalServiceUtil.getBasketUsersIds(userId);
	}
}