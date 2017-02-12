package com.whit.view;

import java.io.Serializable;

import java.util.List;

import javax.faces.bean.ManagedBean;
import com.whit.domain.Message;
import com.whit.facade.MessageFacade;

@ManagedBean
public class GrowlView extends AbstractMB implements Serializable {
	private static final long serialVersionUID = 1L;

	//private static final String SELECTED_PERSON = "selectedPerson";

	private Message message;

	private List<Message> messages;

	private MessageFacade messageFacade;

	public void createMessage() {
		try {
			getMessageFacade().createMessage(message);
			closeDialog();
			displayInfoMessageToUser("Created With Sucess");
			loadMessages();
			resetMessage();
		} catch (Exception e) {
			keepDialogOpen();
			displayErrorMessageToUser("Ops, we could not create. Try again later");
			e.printStackTrace();
		}
	}

	public void updateMessage() {
		try {
			getMessageFacade().updateMessage(message);
			closeDialog();
			displayInfoMessageToUser("Updated With Sucess");
			loadMessages();
			resetMessage();
		} catch (Exception e) {
			keepDialogOpen();
			displayErrorMessageToUser("Ops, we could not create. Try again later");
			e.printStackTrace();
		}
	}

	public void deleteMessage() {
		try {
			getMessageFacade().deleteMessage(message);
			closeDialog();
			displayInfoMessageToUser("Deleted With Sucess");
			loadMessages();
			resetMessage();
		} catch (Exception e) {
			keepDialogOpen();
			displayErrorMessageToUser("Ops, we could not create. Try again later");
			e.printStackTrace();
		}
	}

	public MessageFacade getMessageFacade() {
		if (messageFacade == null) {
			messageFacade = new MessageFacade();
		}

		return messageFacade;
	}

	public Message getMessage() {
		if (message == null) {
			message = new Message();
		}

		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public List<Message> getAllMessages() {
		if (messages == null) {
			loadMessages();
		}

		return messages;
	}

	private void loadMessages() {
		messages = getMessageFacade().listAll();
	}

	public void resetMessage() {
		message = new Message();
	}
}