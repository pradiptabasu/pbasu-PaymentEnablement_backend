package com.gringottBank.implementations;

public class PaymentValidationFunctions 
{
	RandomIntegerGenerator randNum = new RandomIntegerGenerator();
	public boolean duplicateRequestCheck(int paymentId)
	{
		int value = randNum.getRandomNumberInRange(0, 1, paymentId);
		if(value == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int customerLiquidityCheck(int paymentId, int customerId)
	{
		int value = randNum.getRandomNumberInRange(0, 10, customerId);
		return value * 1000;
	}
	
	public boolean customerCreditWorth(int paymentId, int customerId)
	{
		int value = randNum.getRandomNumberInRange(0, 1, customerId);
		if(value == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
