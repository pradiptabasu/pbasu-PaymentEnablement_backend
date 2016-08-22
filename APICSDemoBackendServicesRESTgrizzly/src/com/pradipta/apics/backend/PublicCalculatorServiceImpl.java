package com.pradipta.apics.backend;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/APICSDemoBackendServices/PublicCalculatorService")
public class PublicCalculatorServiceImpl implements PublicCalculatorService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		// replace with your impl here
		return ("Operations are : 1. add \n 2. subtract \n 3. multiply \n 4. divide");

	}

	@Override
	@POST
	@Path("add")
	@Consumes(MediaType.APPLICATION_JSON)
	public int addPOST(CalculatorInputBean calcInput) {
		// TODO Auto-generated method stub
		return calcInput.getNum1() + calcInput.getNum2();
	}

	@Override
	@POST
	@Path("subtract")
	@Consumes(MediaType.APPLICATION_JSON)
	public int subtractPOST(CalculatorInputBean calcInput) {
		// TODO Auto-generated method stub
		return calcInput.getNum1() - calcInput.getNum2();
	}

	@Override
	@POST
	@Path("multiply")
	@Consumes(MediaType.APPLICATION_JSON)
	public int multiplyPOST(CalculatorInputBean calcInput) {
		// TODO Auto-generated method stub
		return calcInput.getNum1() * calcInput.getNum2();
	}

	@Override
	@POST
	@Path("divide")
	@Consumes(MediaType.APPLICATION_JSON)
	public int dividePOST(CalculatorInputBean calcInput) throws TechnicalExceptionREST,CalculatorException {
		// TODO Auto-generated method stub
		
		if(calcInput.getNum2() == 0)
		{
			throw new TechnicalExceptionREST("Cannot divide by Zero");
		}
		else if(calcInput.getNum2() == 1)
		{
			throw new CalculatorException(101,"Cannot divide by Zero");
		}
		else
		{
			return calcInput.getNum1() / calcInput.getNum2();
		}
	}

	@Override
	@GET
	@Path("add/{number1}/{number2}")
	public int add(@PathParam("number1")int num1, @PathParam("number2")int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	@GET
	@Path("subtract/{number1}/{number2}")
	public int subtract(@PathParam("number1")int num1, @PathParam("number2")int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	@Override
	@GET
	@Path("multiply/{number1}/{number2}")
	public int multiply(@PathParam("number1")int num1, @PathParam("number2")int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	@GET
	@Path("divide/{number1}/{number2}")
	public int divide(@PathParam("number1")int num1, @PathParam("number2")int num2) throws TechnicalExceptionREST, CalculatorException 
	{
		// TODO Auto-generated method stub
		if(num2 == 0)
		{
			throw new TechnicalExceptionREST("Cannot divide by Zero");
		}
		else if(num2 == 1)
		{
			throw new CalculatorException(101,"Cannot divide by Zero");
		}
		else
		{
			return num1 / num2;
		}
	}
}
