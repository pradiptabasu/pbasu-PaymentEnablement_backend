package com.pradipta.apics.backend;



public interface PublicCalculatorService {

	public String hello();
	
	public int add(int num1, int num2);
	
	public int subtract(int num1, int num2);
	
	public int multiply(int num1, int num2);
	
	public int divide(int num1, int num2) throws TechnicalExceptionREST,CalculatorException;
	
	public int addPOST(CalculatorInputBean calcInput);
	
	public int subtractPOST(CalculatorInputBean calcInput);
	
	public int multiplyPOST(CalculatorInputBean calcInput);
	
	public int dividePOST(CalculatorInputBean calcInput) throws TechnicalExceptionREST,CalculatorException;
}