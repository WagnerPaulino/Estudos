package com.whit.view;

import java.io.Serializable;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import com.whit.domain.Message;
import com.whit.facade.MessageFacade;

@ManagedBean
@ViewScoped
public class GrowlView extends AbstractMB implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Message message = new Message();

	private List<Message> messages;

	private MessageFacade messageFacade;

	public void save() {
		if (message.getId() == (null)) {
			createMessage();
		} else {
			updateMessage(message);
		}
	}

	private void createMessage() {
		try {
			getMessageFacade().createMessage(message);
			addSucess(message.getMessage());
		} catch (Exception e) {
			addFail(message.getMessage());
			e.printStackTrace();
		}finally {
			resetMessage();			
			loadMessages();
		}
	}

	private void updateMessage(Message message) {
		try {
			getMessageFacade().updateMessage(message);
			addSucess(message.getMessage());
		} catch (Exception e) {
			addFail(message.getMessage());
			e.printStackTrace();
		}finally {
			resetMessage();			
			loadMessages();
		}
	}

	public void deleteMessage(Message message) {
		try {
			getMessageFacade().deleteMessage(message);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			resetMessage();			
			loadMessages();
		}
	}

	public Message preprarUpdate(Message message) {
		this.message = getMessageFacade().findMessage(message.getId());
		return this.message;
	}

	public MessageFacade getMessageFacade() {
		if (messageFacade == null) {
			messageFacade = new MessageFacade();
		}

		return messageFacade;
	}

	public Message getMessage() {
		if(message == null){
			return new Message();
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
		this.message = new Message();
	}
}