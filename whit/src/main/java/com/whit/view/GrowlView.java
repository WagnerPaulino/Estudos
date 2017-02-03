package com.whit.view;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class GrowlView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public String getMessage() {

		return message;
	}

	public void setMessage(String message) {

		this.message = message;
	}

	public void saveMessage() {
		FacesContext context = FacesContext.getCurrentInstance();

		context.addMessage(null, new FacesMessage("Successful", "Your message: " + message));
		context.addMessage(null, new FacesMessage("Second Message", "Additional Message Detail"));
	}
}