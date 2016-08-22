package com.gringottBank.beans;

public class CustomerCreditWorthRequestBean {
	int paymentId;
	int customerId;
	int customerLiquidity;
	public int getCustomerLiquidity() {
		return customerLiquidity;
	}
	public void setCustomerLiquidity(int customerLiquidity) {
		this.customerLiquidity = customerLiquidity;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
}
