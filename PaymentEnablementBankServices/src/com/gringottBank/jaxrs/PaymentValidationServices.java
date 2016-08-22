package com.gringottBank.jaxrs;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.gringottBank.beans.CustomerCreditWorthRequestBean;
import com.gringottBank.beans.CustomerCreditWorthResponseBean;
import com.gringottBank.beans.CustomerLiquidityCheckRequestBean;
import com.gringottBank.beans.CustomerLiquidityCheckResponseBean;
import com.gringottBank.beans.DuplicateRequestCheckRequestBean;
import com.gringottBank.beans.DuplicateRequestCheckResponseBean;
import com.gringottBank.implementations.PaymentValidationFunctions;

@Path("/PaymentValidationServices")
public class PaymentValidationServices implements PaymentValidationInterface {

//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String hello() {
//		writeFile(0,"helloGET");
//		return ("Operations are : 1. add \n 2. subtract \n 3. multiply \n 4. divide");
//	}
//
//	@Override
//	@POST
//	@Path("add")
//	@Consumes(MediaType.APPLICATION_JSON)
//	public int addPOST(CalculatorInputBean calcInput) {
//		// TODO Auto-generated method stub
//		writeFile(calcInput.getNum1() + calcInput.getNum2(),"addPOST");
//		return calcInput.getNum1() + calcInput.getNum2();
//	}
//
//	@Override
//	@POST
//	@Path("subtract")
//	@Consumes(MediaType.APPLICATION_JSON)
//	public int subtractPOST(CalculatorInputBean calcInput) {
//		// TODO Auto-generated method stub
//		writeFile(calcInput.getNum1() - calcInput.getNum2(),"subtractPOST");
//		return calcInput.getNum1() - calcInput.getNum2();
//	}
//
//	@Override
//	@POST
//	@Path("multiply")
//	@Consumes(MediaType.APPLICATION_JSON)
//	public int multiplyPOST(CalculatorInputBean calcInput) {
//		// TODO Auto-generated method stub
//		writeFile(calcInput.getNum1() * calcInput.getNum2(),"multiplyPOST");
//		return calcInput.getNum1() * calcInput.getNum2();
//	}
//
//	@Override
//	@POST
//	@Path("divide")
//	@Consumes(MediaType.APPLICATION_JSON)
//	public int dividePOST(CalculatorInputBean calcInput) throws TechnicalExceptionREST,CalculatorException {
//		// TODO Auto-generated method stub
//		
//		if(calcInput.getNum2() == 0)
//		{
//			throw new TechnicalExceptionREST("Cannot divide by Zero");
//		}
//		else if(calcInput.getNum2() == 1)
//		{
//			throw new CalculatorException(101,"Cannot divide by Zero");
//		}
//		else
//		{
//			writeFile(calcInput.getNum1() / calcInput.getNum2(),"dividePOST");
//			return calcInput.getNum1() / calcInput.getNum2();
//		}
//	}
//
//	@Override
//	@GET
//	@Path("add/{number1}/{number2}")
//	public int add(@PathParam("number1")int num1, @PathParam("number2")int num2) {
//		// TODO Auto-generated method stub
//		writeFile(num1 + num2,"addGET");
//		return num1 + num2;
//	}
//
//	@Override
//	@GET
//	@Path("subtract/{number1}/{number2}")
//	public int subtract(@PathParam("number1")int num1, @PathParam("number2")int num2) {
//		// TODO Auto-generated method stub
//		writeFile(num1 - num2,"subtractGET");
//		return num1 - num2;
//	}
//
//	@Override
//	@GET
//	@Path("multiply/{number1}/{number2}")
//	public int multiply(@PathParam("number1")int num1, @PathParam("number2")int num2) {
//		// TODO Auto-generated method stub
//		writeFile(num1 * num2,"multiplyGET");
//		return num1 * num2;
//	}
//
//	@Override
//	@GET
//	@Path("divide/{number1}/{number2}")
//	public int divide(@PathParam("number1")int num1, @PathParam("number2")int num2) throws TechnicalExceptionREST, CalculatorException 
//	{
//		// TODO Auto-generated method stub
//		if(num2 == 0)
//		{
//			throw new TechnicalExceptionREST("Cannot divide by Zero");
//		}
//		else if(num2 == 1)
//		{
//			throw new CalculatorException(101,"Cannot divide by Zero");
//		}
//		else
//		{
//			writeFile(num1 / num2,"divideGET");
//			return num1 / num2;
//		}
//	}
//	
//	public void writeFile(int result, String namePostFix) 
//	{
//		try 
//		{
//			SecureRandom random = new SecureRandom();
//			String fileName = new BigInteger(130,random).toString(32);
//			File file = new File(fileName + "." + namePostFix + ".txt");
//			FileWriter fw = new FileWriter(file.getAbsoluteFile());
//			fw.write(Integer.toString(result));
//			fw.flush();
//			fw.close();
//		} 
//		catch (IOException e) 
//		{
//			e.printStackTrace();
//		}
//	}


	@Override
	@POST
	@Path("duplicateRequestCheck")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public DuplicateRequestCheckResponseBean duplicateRequestCheck(
			DuplicateRequestCheckRequestBean requestParam) {
		// TODO Auto-generated method stub
		DuplicateRequestCheckResponseBean responseParam = new DuplicateRequestCheckResponseBean();
		PaymentValidationFunctions functionObj = new PaymentValidationFunctions();
		responseParam.setduplicateRequestCheckResponse(functionObj.duplicateRequestCheck(requestParam.getPaymentId()));
		return responseParam;
	}

	@Override
	@POST
	@Path("duplicateRequestCheck")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public CustomerLiquidityCheckResponseBean customerLiquidityCheck(
			CustomerLiquidityCheckRequestBean requestParam) {
		// TODO Auto-generated method stub
		CustomerLiquidityCheckResponseBean responseParam = new CustomerLiquidityCheckResponseBean();
		PaymentValidationFunctions functionObj = new PaymentValidationFunctions();
		responseParam.setCustomerLiquidityCheckResponse(functionObj.customerLiquidityCheck(requestParam.getPaymentId(), requestParam.getCustomerId()));
		return responseParam;
	}

	@Override
	@POST
	@Path("duplicateRequestCheck")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public CustomerCreditWorthResponseBean customerCreditWorth(
			CustomerCreditWorthRequestBean requestParam) {
		// TODO Auto-generated method stub
		CustomerCreditWorthResponseBean responseParam = new CustomerCreditWorthResponseBean();
		PaymentValidationFunctions functionObj = new PaymentValidationFunctions();
		responseParam.setCustomerCreditWorthResponse(functionObj.customerCreditWorth(requestParam.getPaymentId(), requestParam.getCustomerId()));
		return responseParam;
	}
}
