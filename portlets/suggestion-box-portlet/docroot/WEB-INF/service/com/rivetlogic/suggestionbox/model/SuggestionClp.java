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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.rivetlogic.suggestionbox.service.ClpSerializer;
import com.rivetlogic.suggestionbox.service.SuggestionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Manrique Varela
 */
public class SuggestionClp extends BaseModelImpl<Suggestion>
	implements Suggestion {
	public SuggestionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Suggestion.class;
	}

	@Override
	public String getModelClassName() {
		return Suggestion.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _suggestionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSuggestionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _suggestionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("suggestionId", getSuggestionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("category", getCategory());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("status", getStatus());
		attributes.put("receivedDate", getReceivedDate());
		attributes.put("receivedComment", getReceivedComment());
		attributes.put("receivedUserId", getReceivedUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long suggestionId = (Long)attributes.get("suggestionId");

		if (suggestionId != null) {
			setSuggestionId(suggestionId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Date receivedDate = (Date)attributes.get("receivedDate");

		if (receivedDate != null) {
			setReceivedDate(receivedDate);
		}

		String receivedComment = (String)attributes.get("receivedComment");

		if (receivedComment != null) {
			setReceivedComment(receivedComment);
		}

		Long receivedUserId = (Long)attributes.get("receivedUserId");

		if (receivedUserId != null) {
			setReceivedUserId(receivedUserId);
		}
	}

	@Override
	public long getSuggestionId() {
		return _suggestionId;
	}

	@Override
	public void setSuggestionId(long suggestionId) {
		_suggestionId = suggestionId;

		if (_suggestionRemoteModel != null) {
			try {
				Class<?> clazz = _suggestionRemoteModel.getClass();

				Method method = clazz.getMethod("setSuggestionId", long.class);

				method.invoke(_suggestionRemoteModel, suggestionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_suggestionRemoteModel != null) {
			try {
				Class<?> clazz = _suggestionRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_suggestionRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_suggestionRemoteModel != null) {
			try {
				Class<?> clazz = _suggestionRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_suggestionRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_suggestionRemoteModel != null) {
			try {
				Class<?> clazz = _suggestionRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_suggestionRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_suggestionRemoteModel != null) {
			try {
				Class<?> clazz = _suggestionRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_suggestionRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_suggestionRemoteModel != null) {
			try {
				Class<?> clazz = _suggestionRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_suggestionRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCategory() {
		return _category;
	}

	@Override
	public void setCategory(String category) {
		_category = category;

		if (_suggestionRemoteModel != null) {
			try {
				Class<?> clazz = _suggestionRemoteModel.getClass();

				Method method = clazz.getMethod("setCategory", String.class);

				method.invoke(_suggestionRemoteModel, category);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTitle() {
		return _title;
	}

	@Override
	public void setTitle(String title) {
		_title = title;

		if (_suggestionRemoteModel != null) {
			try {
				Class<?> clazz = _suggestionRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_suggestionRemoteModel, title);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_suggestionRemoteModel != null) {
			try {
				Class<?> clazz = _suggestionRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_suggestionRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatus() {
		return _status;
	}

	@Override
	public void setStatus(String status) {
		_status = status;

		if (_suggestionRemoteModel != null) {
			try {
				Class<?> clazz = _suggestionRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_suggestionRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getReceivedDate() {
		return _receivedDate;
	}

	@Override
	public void setReceivedDate(Date receivedDate) {
		_receivedDate = receivedDate;

		if (_suggestionRemoteModel != null) {
			try {
				Class<?> clazz = _suggestionRemoteModel.getClass();

				Method method = clazz.getMethod("setReceivedDate", Date.class);

				method.invoke(_suggestionRemoteModel, receivedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReceivedComment() {
		return _receivedComment;
	}

	@Override
	public void setReceivedComment(String receivedComment) {
		_receivedComment = receivedComment;

		if (_suggestionRemoteModel != null) {
			try {
				Class<?> clazz = _suggestionRemoteModel.getClass();

				Method method = clazz.getMethod("setReceivedComment",
						String.class);

				method.invoke(_suggestionRemoteModel, receivedComment);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getReceivedUserId() {
		return _receivedUserId;
	}

	@Override
	public void setReceivedUserId(long receivedUserId) {
		_receivedUserId = receivedUserId;

		if (_suggestionRemoteModel != null) {
			try {
				Class<?> clazz = _suggestionRemoteModel.getClass();

				Method method = clazz.getMethod("setReceivedUserId", long.class);

				method.invoke(_suggestionRemoteModel, receivedUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReceivedUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getReceivedUserId(), "uuid",
			_receivedUserUuid);
	}

	@Override
	public void setReceivedUserUuid(String receivedUserUuid) {
		_receivedUserUuid = receivedUserUuid;
	}

	public BaseModel<?> getSuggestionRemoteModel() {
		return _suggestionRemoteModel;
	}

	public void setSuggestionRemoteModel(BaseModel<?> suggestionRemoteModel) {
		_suggestionRemoteModel = suggestionRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _suggestionRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_suggestionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			SuggestionLocalServiceUtil.addSuggestion(this);
		}
		else {
			SuggestionLocalServiceUtil.updateSuggestion(this);
		}
	}

	@Override
	public Suggestion toEscapedModel() {
		return (Suggestion)ProxyUtil.newProxyInstance(Suggestion.class.getClassLoader(),
			new Class[] { Suggestion.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SuggestionClp clone = new SuggestionClp();

		clone.setSuggestionId(getSuggestionId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCategory(getCategory());
		clone.setTitle(getTitle());
		clone.setDescription(getDescription());
		clone.setStatus(getStatus());
		clone.setReceivedDate(getReceivedDate());
		clone.setReceivedComment(getReceivedComment());
		clone.setReceivedUserId(getReceivedUserId());

		return clone;
	}

	@Override
	public int compareTo(Suggestion suggestion) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), suggestion.getCreateDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SuggestionClp)) {
			return false;
		}

		SuggestionClp suggestion = (SuggestionClp)obj;

		long primaryKey = suggestion.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{suggestionId=");
		sb.append(getSuggestionId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", category=");
		sb.append(getCategory());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", receivedDate=");
		sb.append(getReceivedDate());
		sb.append(", receivedComment=");
		sb.append(getReceivedComment());
		sb.append(", receivedUserId=");
		sb.append(getReceivedUserId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.rivetlogic.suggestionbox.model.Suggestion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>suggestionId</column-name><column-value><![CDATA[");
		sb.append(getSuggestionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>category</column-name><column-value><![CDATA[");
		sb.append(getCategory());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receivedDate</column-name><column-value><![CDATA[");
		sb.append(getReceivedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receivedComment</column-name><column-value><![CDATA[");
		sb.append(getReceivedComment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receivedUserId</column-name><column-value><![CDATA[");
		sb.append(getReceivedUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _suggestionId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private String _category;
	private String _title;
	private String _description;
	private String _status;
	private Date _receivedDate;
	private String _receivedComment;
	private long _receivedUserId;
	private String _receivedUserUuid;
	private BaseModel<?> _suggestionRemoteModel;
	private Class<?> _clpSerializerClass = com.rivetlogic.suggestionbox.service.ClpSerializer.class;
}