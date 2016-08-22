package com.gringottBank.jaxrs;

import com.gringottBank.beans.*;



public interface PaymentValidationInterface {

	
	public DuplicateRequestCheckResponseBean duplicateRequestCheck(DuplicateRequestCheckRequestBean requestParam);
	
	
	public CustomerLiquidityCheckResponseBean customerLiquidityCheck(CustomerLiquidityCheckRequestBean requestParam);
	

	public CustomerCreditWorthResponseBean customerCreditWorth(CustomerCreditWorthRequestBean requestParam);
}