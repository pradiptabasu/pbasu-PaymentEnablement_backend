package com.pradipta.apics.backend;

public class CalculatorException extends Exception 
{
	private static final long serialVersionUID = -22988802664768382L;
	/**
	 * Fault Code
	 */
	 private int faultCode;
	 /**
	  * Fault String
	  */
     private String faultString;
	/**
	 * @return the faultCode
	 */
	public int getFaultCode() {
		return faultCode;
	}
	/**
	 * @param faultCode the faultCode to set
	 */
	public void setFaultCode(int faultCode) {
		this.faultCode = faultCode;
	}
	/**
	 * @return the faultString
	 */
	public String getFaultString() {
		return faultString;
	}
	/**
	 * @param faultString the faultString to set
	 */
	public void setFaultString(String faultString) {
		this.faultString = faultString;
	}
	
	public CalculatorException(int faultCode, String faultString)
	{
		setFaultCode(faultCode);
		setFaultString(faultString);
	}
}
