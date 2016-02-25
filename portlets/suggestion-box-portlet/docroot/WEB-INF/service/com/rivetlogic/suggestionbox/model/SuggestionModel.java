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

package com.rivetlogic.suggestionbox.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Suggestion service. Represents a row in the &quot;rivetlogic_suggestion_box_Suggestion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rivetlogic.suggestionbox.model.impl.SuggestionImpl}.
 * </p>
 *
 * @author Manrique Varela
 * @see Suggestion
 * @see com.rivetlogic.suggestionbox.model.impl.SuggestionImpl
 * @see com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl
 * @generated
 */
public interface SuggestionModel extends BaseModel<Suggestion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a suggestion model instance should use the {@link Suggestion} interface instead.
	 */

	/**
	 * Returns the primary key of this suggestion.
	 *
	 * @return the primary key of this suggestion
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this suggestion.
	 *
	 * @param primaryKey the primary key of this suggestion
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the suggestion ID of this suggestion.
	 *
	 * @return the suggestion ID of this suggestion
	 */
	public long getSuggestionId();

	/**
	 * Sets the suggestion ID of this suggestion.
	 *
	 * @param suggestionId the suggestion ID of this suggestion
	 */
	public void setSuggestionId(long suggestionId);

	/**
	 * Returns the group ID of this suggestion.
	 *
	 * @return the group ID of this suggestion
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this suggestion.
	 *
	 * @param groupId the group ID of this suggestion
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this suggestion.
	 *
	 * @return the company ID of this suggestion
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this suggestion.
	 *
	 * @param companyId the company ID of this suggestion
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this suggestion.
	 *
	 * @return the user ID of this suggestion
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this suggestion.
	 *
	 * @param userId the user ID of this suggestion
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this suggestion.
	 *
	 * @return the user uuid of this suggestion
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this suggestion.
	 *
	 * @param userUuid the user uuid of this suggestion
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this suggestion.
	 *
	 * @return the create date of this suggestion
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this suggestion.
	 *
	 * @param createDate the create date of this suggestion
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this suggestion.
	 *
	 * @return the modified date of this suggestion
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this suggestion.
	 *
	 * @param modifiedDate the modified date of this suggestion
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the category of this suggestion.
	 *
	 * @return the category of this suggestion
	 */
	@AutoEscape
	public String getCategory();

	/**
	 * Sets the category of this suggestion.
	 *
	 * @param category the category of this suggestion
	 */
	public void setCategory(String category);

	/**
	 * Returns the title of this suggestion.
	 *
	 * @return the title of this suggestion
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this suggestion.
	 *
	 * @param title the title of this suggestion
	 */
	public void setTitle(String title);

	/**
	 * Returns the description of this suggestion.
	 *
	 * @return the description of this suggestion
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this suggestion.
	 *
	 * @param description the description of this suggestion
	 */
	public void setDescription(String description);

	/**
	 * Returns the status of this suggestion.
	 *
	 * @return the status of this suggestion
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this suggestion.
	 *
	 * @param status the status of this suggestion
	 */
	public void setStatus(String status);

	/**
	 * Returns the received date of this suggestion.
	 *
	 * @return the received date of this suggestion
	 */
	public Date getReceivedDate();

	/**
	 * Sets the received date of this suggestion.
	 *
	 * @param receivedDate the received date of this suggestion
	 */
	public void setReceivedDate(Date receivedDate);

	/**
	 * Returns the received comment of this suggestion.
	 *
	 * @return the received comment of this suggestion
	 */
	@AutoEscape
	public String getReceivedComment();

	/**
	 * Sets the received comment of this suggestion.
	 *
	 * @param receivedComment the received comment of this suggestion
	 */
	public void setReceivedComment(String receivedComment);

	/**
	 * Returns the received user ID of this suggestion.
	 *
	 * @return the received user ID of this suggestion
	 */
	public long getReceivedUserId();

	/**
	 * Sets the received user ID of this suggestion.
	 *
	 * @param receivedUserId the received user ID of this suggestion
	 */
	public void setReceivedUserId(long receivedUserId);

	/**
	 * Returns the received user uuid of this suggestion.
	 *
	 * @return the received user uuid of this suggestion
	 * @throws SystemException if a system exception occurred
	 */
	public String getReceivedUserUuid() throws SystemException;

	/**
	 * Sets the received user uuid of this suggestion.
	 *
	 * @param receivedUserUuid the received user uuid of this suggestion
	 */
	public void setReceivedUserUuid(String receivedUserUuid);

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
	public int compareTo(
		com.rivetlogic.suggestionbox.model.Suggestion suggestion);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.rivetlogic.suggestionbox.model.Suggestion> toCacheModel();

	@Override
	public com.rivetlogic.suggestionbox.model.Suggestion toEscapedModel();

	@Override
	public com.rivetlogic.suggestionbox.model.Suggestion toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}