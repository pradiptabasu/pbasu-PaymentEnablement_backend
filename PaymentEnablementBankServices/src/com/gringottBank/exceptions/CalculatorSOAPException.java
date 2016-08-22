package com.gringottBank.exceptions;

import javax.xml.ws.WebFault;

import com.gringottBank.beans.SOAPFaultBean;

@WebFault(name = "CalculatorException", targetNamespace = "http://com.pradipta.apics.backend/", faultBean = "CalculatorExceptionBean")
public class CalculatorSOAPException extends Exception 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5471082152996086708L;

	private SOAPFaultBean CalculatorExceptionBean;
	/**
	 * 
	 */
	public CalculatorSOAPException() 
	{
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param fault
	 */
	protected CalculatorSOAPException(SOAPFaultBean CalculatorExceptionBean) 
	{
        super(CalculatorExceptionBean.getFaultString()); 
        this.CalculatorExceptionBean = CalculatorExceptionBean;
     }
	/**
	 * 
	 * @param message
	 * @param faultInfo
	 */
	public CalculatorSOAPException(String message, SOAPFaultBean CalculatorExceptionBean)
	{
		super(message);
        this.CalculatorExceptionBean = CalculatorExceptionBean;
	}
	/**
	 * 
	 * @param message
	 * @param faultInfo
	 * @param cause
	 */
	public CalculatorSOAPException(String message, SOAPFaultBean CalculatorExceptionBean, Throwable cause){
		super(message,cause);
        this.CalculatorExceptionBean = CalculatorExceptionBean;
	}
	/**
	 * 
	 * @return
	 */
	public SOAPFaultBean getFaultInfo(){
		return CalculatorExceptionBean;
	}
	
	/**
	 * @param message
	 */
	public CalculatorSOAPException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param message
	 */
	public CalculatorSOAPException(String code, String message) {
		super(message);
		this.CalculatorExceptionBean = new SOAPFaultBean();
	    this.CalculatorExceptionBean.setFaultString(message);
	    this.CalculatorExceptionBean.setFaultCode(code);
	}

	/**
	 * @param cause
	 */
	public CalculatorSOAPException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public CalculatorSOAPException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
}
