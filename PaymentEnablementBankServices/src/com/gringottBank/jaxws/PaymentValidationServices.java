package com.gringottBank.jaxws;

import javax.jws.*;

import com.gringottBank.implementations.PaymentValidationFunctions;

@WebService(portName = "PaymentValidationPort", serviceName = "PaymentValidationService", targetNamespace = "http://com.gringottBank.jaxws/PaymentValidation", endpointInterface = "com.gringottBank.jaxws.PaymentValidationInterface")
public class PaymentValidationServices implements PaymentValidationInterface {

	@Override
	public boolean duplicateRequestCheck(int paymentId) {
		// TODO Auto-generated method stub
		PaymentValidationFunctions functionObj = new PaymentValidationFunctions();
		return functionObj.duplicateRequestCheck(paymentId);
	}

	@Override
	public int customerLiquidityCheck(int paymentId, int customerId) {
		// TODO Auto-generated method stub
		PaymentValidationFunctions functionObj = new PaymentValidationFunctions();
		return functionObj.customerLiquidityCheck(paymentId,customerId);
	}

	@Override
	public boolean customerCreditWorth(int paymentId, int customerId) {
		// TODO Auto-generated method stub
		PaymentValidationFunctions functionObj = new PaymentValidationFunctions();
		return functionObj.customerCreditWorth(paymentId,customerId);
	}

	
}
