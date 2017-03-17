package com.whit.view;

import javax.faces.context.FacesContext;
import javax.faces.context.PartialViewContext;
import javax.faces.application.FacesMessage;
import org.primefaces.context.RequestContext;

import com.whit.util.JSFMessageUtil;

public class AbstractMB {
	private static final String KEEP_DIALOG_OPENED = "KEEP_DIALOG_OPENED";

	public AbstractMB() {
		super();
	}

	protected void displayErrorMessageToUser(String message) {
		JSFMessageUtil messageUtil = new JSFMessageUtil();
		messageUtil.sendErrorMessageToUser(message);
	}

	protected void displayInfoMessageToUser(String message) {
		JSFMessageUtil messageUtil = new JSFMessageUtil();
		messageUtil.sendInfoMessageToUser(message);
	}

	protected void closeDialog() {
		getRequestContext().addCallbackParam(KEEP_DIALOG_OPENED, false);
	}

	protected void keepDialogOpen() {
		getRequestContext().addCallbackParam(KEEP_DIALOG_OPENED, true);
	}

	protected RequestContext getRequestContext() {
		return RequestContext.getCurrentInstance();
	}

	public void addSucess(String message) {
		FacesContext context = FacesContext.getCurrentInstance();

		context.addMessage(null, new FacesMessage("Successful", "Message " + message + " adicionada com sucesso"));
	}

	public void addFail(String message) {
		FacesContext context = FacesContext.getCurrentInstance();

		context.addMessage(null, new FacesMessage("Erro", "Message " + message + " Não foi adicionada"));
	}

	public void updateComponent(String componente) {
		PartialViewContext pvc = FacesContext.getCurrentInstance().getPartialViewContext();
		pvc.getRenderIds().add(componente);
	}
}
