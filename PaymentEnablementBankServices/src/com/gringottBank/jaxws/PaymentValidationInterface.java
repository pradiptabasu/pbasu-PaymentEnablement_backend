package com.gringottBank.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;


@WebService(name = "PaymentValidationService", targetNamespace = "http://com.gringottBank.jaxws/PaymentValidation")
public interface PaymentValidationInterface {

	@WebMethod(operationName = "duplicateRequestCheck")
	@WebResult(name="duplicateRequestCheckResponse", targetNamespace = "http://com.gringottBank.jaxws/PaymentValidation")
	public boolean duplicateRequestCheck(
			@WebParam(name="paymentId",
			targetNamespace = "http://com.gringottBank.jaxws/PaymentValidation") int paymentId);
	
	@WebMethod(operationName = "customerLiquidityCheck")
	@WebResult(name="customerLiquidityCheckResponse", targetNamespace = "http://com.gringottBank.jaxws/PaymentValidation")
	public int customerLiquidityCheck(
			@WebParam(name="paymentId",
			targetNamespace = "http://com.gringottBank.jaxws/PaymentValidation") int paymentId, 
			@WebParam(name="customerId",
			targetNamespace = "http://com.gringottBank.jaxws/PaymentValidation") int customerId);
	
	@WebMethod(operationName = "customerCreditWorth")
	@WebResult(name="customerCreditWorthResponse", targetNamespace = "http://com.gringottBank.jaxws/PaymentValidation")
	public boolean customerCreditWorth(
			@WebParam(name="paymentId",
			targetNamespace = "http://com.gringottBank.jaxws/PaymentValidation") int paymentId, 
			@WebParam(name="customerId",
			targetNamespace = "http://com.gringottBank.jaxws/PaymentValidation") int customerId);
}