package com.whit.converts;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import com.whit.domain.Message;

public class MessageConvert implements Converter{
	@Override
	public Object getAsObject(FacesContext fc, UIComponent uic, String value) {

		if (value != null && !value.isEmpty()) {
			return (Message) uic.getAttributes().get(value);
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent uic, Object obj) {
		if (obj instanceof Message) {
			Message entity = (Message) obj;
			uic.getAttributes().put(entity.getId() + "", entity);
			return entity.getId() + "";
		}
		return "";
	}
}
