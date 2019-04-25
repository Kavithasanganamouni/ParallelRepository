package com.bank.exceptions;

public class AadharExistException extends Exception {
	public AadharExistException()
	{
		System.err.println("Entered Aadhar number already existed");
	}


}
