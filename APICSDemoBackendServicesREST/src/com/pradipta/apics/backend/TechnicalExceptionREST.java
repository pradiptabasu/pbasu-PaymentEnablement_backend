package com.pradipta.apics.backend;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

public class TechnicalExceptionREST extends WebApplicationException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 761255314612733589L;

	public TechnicalExceptionREST(String message) 
	{
		super(Response.status(404).entity(message).type("text/plain").build());
	}
}
