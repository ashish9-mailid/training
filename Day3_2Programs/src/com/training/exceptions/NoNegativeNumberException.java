package com.training.exceptions;

public class NoNegativeNumberException extends Exception {
private String message;

	public NoNegativeNumberException() {
		
	}
	public NoNegativeNumberException(String message) {
		this.message=message;
	}
	
	public String getMessage() {return message;}

}
