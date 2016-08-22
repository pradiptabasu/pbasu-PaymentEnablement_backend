package com.gringottBank.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class BusinessExceptionREST extends Exception implements ExceptionMapper<CalculatorException>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -959556243599249271L;

	@Override
	public Response toResponse(CalculatorException ex) {
		// TODO Auto-generated method stub
		return Response.status(ex.getFaultCode()).entity(ex.getMessage()).type("text/plain").build();
	}
}
