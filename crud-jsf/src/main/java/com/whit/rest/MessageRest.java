package com.whit.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.whit.domain.Message;
import com.whit.view.GrowlView;

@Path(value = "/message")
public class MessageRest {
	
	@Inject
	private GrowlView bean;
	
	private List<Message> message;
	
	@GET
	@Path(value = "/messages")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMessage(){
		message = bean.getAllMessages();
		return Response.status(200).entity(message).build();
	}

}
