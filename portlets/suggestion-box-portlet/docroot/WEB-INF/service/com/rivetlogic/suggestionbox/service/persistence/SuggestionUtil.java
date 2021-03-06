/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.rivetlogic.suggestionbox.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.rivetlogic.suggestionbox.model.Suggestion;

import java.util.List;

/**
 * The persistence utility for the suggestion service. This utility wraps {@link SuggestionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Manrique Varela
 * @see SuggestionPersistence
 * @see SuggestionPersistenceImpl
 * @generated
 */
public class SuggestionUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Suggestion suggestion) {
		getPersistence().clearCache(suggestion);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Suggestion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Suggestion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Suggestion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Suggestion update(Suggestion suggestion)
		throws SystemException {
		return getPersistence().update(suggestion);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Suggestion update(Suggestion suggestion,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(suggestion, serviceContext);
	}

	/**
	* Returns all the suggestions where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching suggestions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the suggestions where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @return the range of matching suggestions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the suggestions where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching suggestions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first suggestion in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a matching suggestion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first suggestion in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suggestion, or <code>null</code> if a matching suggestion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last suggestion in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a matching suggestion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last suggestion in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suggestion, or <code>null</code> if a matching suggestion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the suggestions before and after the current suggestion in the ordered set where groupId = &#63;.
	*
	* @param suggestionId the primary key of the current suggestion
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a suggestion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion[] findByGroupId_PrevAndNext(
		long suggestionId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(suggestionId, groupId,
			orderByComparator);
	}

	/**
	* Returns all the suggestions that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching suggestions that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> filterFindByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByGroupId(groupId);
	}

	/**
	* Returns a range of all the suggestions that the user has permission to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @return the range of matching suggestions that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> filterFindByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the suggestions that the user has permissions to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching suggestions that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the suggestions before and after the current suggestion in the ordered set of suggestions that the user has permission to view where groupId = &#63;.
	*
	* @param suggestionId the primary key of the current suggestion
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a suggestion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion[] filterFindByGroupId_PrevAndNext(
		long suggestionId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException {
		return getPersistence()
				   .filterFindByGroupId_PrevAndNext(suggestionId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the suggestions where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of suggestions where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching suggestions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns the number of suggestions that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching suggestions that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByGroupId(groupId);
	}

	/**
	* Returns all the suggestions where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching suggestions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> findByCompanyGroup(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyGroup(companyId, groupId);
	}

	/**
	* Returns a range of all the suggestions where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @return the range of matching suggestions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> findByCompanyGroup(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyGroup(companyId, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the suggestions where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching suggestions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> findByCompanyGroup(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyGroup(companyId, groupId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first suggestion in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a matching suggestion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion findByCompanyGroup_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException {
		return getPersistence()
				   .findByCompanyGroup_First(companyId, groupId,
			orderByComparator);
	}

	/**
	* Returns the first suggestion in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suggestion, or <code>null</code> if a matching suggestion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion fetchByCompanyGroup_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyGroup_First(companyId, groupId,
			orderByComparator);
	}

	/**
	* Returns the last suggestion in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a matching suggestion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion findByCompanyGroup_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException {
		return getPersistence()
				   .findByCompanyGroup_Last(companyId, groupId,
			orderByComparator);
	}

	/**
	* Returns the last suggestion in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suggestion, or <code>null</code> if a matching suggestion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion fetchByCompanyGroup_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyGroup_Last(companyId, groupId,
			orderByComparator);
	}

	/**
	* Returns the suggestions before and after the current suggestion in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param suggestionId the primary key of the current suggestion
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a suggestion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion[] findByCompanyGroup_PrevAndNext(
		long suggestionId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException {
		return getPersistence()
				   .findByCompanyGroup_PrevAndNext(suggestionId, companyId,
			groupId, orderByComparator);
	}

	/**
	* Returns all the suggestions that the user has permission to view where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching suggestions that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> filterFindByCompanyGroup(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByCompanyGroup(companyId, groupId);
	}

	/**
	* Returns a range of all the suggestions that the user has permission to view where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @return the range of matching suggestions that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> filterFindByCompanyGroup(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByCompanyGroup(companyId, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the suggestions that the user has permissions to view where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching suggestions that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> filterFindByCompanyGroup(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByCompanyGroup(companyId, groupId, start, end,
			orderByComparator);
	}

	/**
	* Returns the suggestions before and after the current suggestion in the ordered set of suggestions that the user has permission to view where companyId = &#63; and groupId = &#63;.
	*
	* @param suggestionId the primary key of the current suggestion
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a suggestion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion[] filterFindByCompanyGroup_PrevAndNext(
		long suggestionId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException {
		return getPersistence()
				   .filterFindByCompanyGroup_PrevAndNext(suggestionId,
			companyId, groupId, orderByComparator);
	}

	/**
	* Removes all the suggestions where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyGroup(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyGroup(companyId, groupId);
	}

	/**
	* Returns the number of suggestions where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching suggestions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyGroup(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyGroup(companyId, groupId);
	}

	/**
	* Returns the number of suggestions that the user has permission to view where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching suggestions that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByCompanyGroup(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByCompanyGroup(companyId, groupId);
	}

	/**
	* Returns all the suggestions where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching suggestions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> findByCompanyGroupUser(
		long companyId, long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyGroupUser(companyId, groupId, userId);
	}

	/**
	* Returns a range of all the suggestions where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @return the range of matching suggestions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> findByCompanyGroupUser(
		long companyId, long groupId, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyGroupUser(companyId, groupId, userId, start,
			end);
	}

	/**
	* Returns an ordered range of all the suggestions where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching suggestions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> findByCompanyGroupUser(
		long companyId, long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyGroupUser(companyId, groupId, userId, start,
			end, orderByComparator);
	}

	/**
	* Returns the first suggestion in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a matching suggestion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion findByCompanyGroupUser_First(
		long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException {
		return getPersistence()
				   .findByCompanyGroupUser_First(companyId, groupId, userId,
			orderByComparator);
	}

	/**
	* Returns the first suggestion in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suggestion, or <code>null</code> if a matching suggestion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion fetchByCompanyGroupUser_First(
		long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyGroupUser_First(companyId, groupId, userId,
			orderByComparator);
	}

	/**
	* Returns the last suggestion in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a matching suggestion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion findByCompanyGroupUser_Last(
		long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException {
		return getPersistence()
				   .findByCompanyGroupUser_Last(companyId, groupId, userId,
			orderByComparator);
	}

	/**
	* Returns the last suggestion in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suggestion, or <code>null</code> if a matching suggestion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion fetchByCompanyGroupUser_Last(
		long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyGroupUser_Last(companyId, groupId, userId,
			orderByComparator);
	}

	/**
	* Returns the suggestions before and after the current suggestion in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param suggestionId the primary key of the current suggestion
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a suggestion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion[] findByCompanyGroupUser_PrevAndNext(
		long suggestionId, long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException {
		return getPersistence()
				   .findByCompanyGroupUser_PrevAndNext(suggestionId, companyId,
			groupId, userId, orderByComparator);
	}

	/**
	* Returns all the suggestions that the user has permission to view where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching suggestions that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> filterFindByCompanyGroupUser(
		long companyId, long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByCompanyGroupUser(companyId, groupId, userId);
	}

	/**
	* Returns a range of all the suggestions that the user has permission to view where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @return the range of matching suggestions that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> filterFindByCompanyGroupUser(
		long companyId, long groupId, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByCompanyGroupUser(companyId, groupId, userId,
			start, end);
	}

	/**
	* Returns an ordered range of all the suggestions that the user has permissions to view where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching suggestions that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> filterFindByCompanyGroupUser(
		long companyId, long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByCompanyGroupUser(companyId, groupId, userId,
			start, end, orderByComparator);
	}

	/**
	* Returns the suggestions before and after the current suggestion in the ordered set of suggestions that the user has permission to view where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param suggestionId the primary key of the current suggestion
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a suggestion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion[] filterFindByCompanyGroupUser_PrevAndNext(
		long suggestionId, long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException {
		return getPersistence()
				   .filterFindByCompanyGroupUser_PrevAndNext(suggestionId,
			companyId, groupId, userId, orderByComparator);
	}

	/**
	* Removes all the suggestions where companyId = &#63; and groupId = &#63; and userId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyGroupUser(long companyId, long groupId,
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyGroupUser(companyId, groupId, userId);
	}

	/**
	* Returns the number of suggestions where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching suggestions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyGroupUser(long companyId, long groupId,
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByCompanyGroupUser(companyId, groupId, userId);
	}

	/**
	* Returns the number of suggestions that the user has permission to view where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching suggestions that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByCompanyGroupUser(long companyId,
		long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterCountByCompanyGroupUser(companyId, groupId, userId);
	}

	/**
	* Caches the suggestion in the entity cache if it is enabled.
	*
	* @param suggestion the suggestion
	*/
	public static void cacheResult(
		com.rivetlogic.suggestionbox.model.Suggestion suggestion) {
		getPersistence().cacheResult(suggestion);
	}

	/**
	* Caches the suggestions in the entity cache if it is enabled.
	*
	* @param suggestions the suggestions
	*/
	public static void cacheResult(
		java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> suggestions) {
		getPersistence().cacheResult(suggestions);
	}

	/**
	* Creates a new suggestion with the primary key. Does not add the suggestion to the database.
	*
	* @param suggestionId the primary key for the new suggestion
	* @return the new suggestion
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion create(
		long suggestionId) {
		return getPersistence().create(suggestionId);
	}

	/**
	* Removes the suggestion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param suggestionId the primary key of the suggestion
	* @return the suggestion that was removed
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a suggestion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion remove(
		long suggestionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException {
		return getPersistence().remove(suggestionId);
	}

	public static com.rivetlogic.suggestionbox.model.Suggestion updateImpl(
		com.rivetlogic.suggestionbox.model.Suggestion suggestion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(suggestion);
	}

	/**
	* Returns the suggestion with the primary key or throws a {@link com.rivetlogic.suggestionbox.NoSuchSuggestionException} if it could not be found.
	*
	* @param suggestionId the primary key of the suggestion
	* @return the suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a suggestion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion findByPrimaryKey(
		long suggestionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException {
		return getPersistence().findByPrimaryKey(suggestionId);
	}

	/**
	* Returns the suggestion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param suggestionId the primary key of the suggestion
	* @return the suggestion, or <code>null</code> if a suggestion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion fetchByPrimaryKey(
		long suggestionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(suggestionId);
	}

	/**
	* Returns all the suggestions.
	*
	* @return the suggestions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the suggestions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @return the range of suggestions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the suggestions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of suggestions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the suggestions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of suggestions.
	*
	* @return the number of suggestions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static SuggestionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (SuggestionPersistence)PortletBeanLocatorUtil.locate(com.rivetlogic.suggestionbox.service.ClpSerializer.getServletContextName(),
					SuggestionPersistence.class.getName());

			ReferenceRegistry.registerReference(SuggestionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(SuggestionPersistence persistence) {
	}

	private static SuggestionPersistence _persistence;
}