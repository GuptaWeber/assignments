package com.exception;

public class PersonNotFoundException extends Exception {

	private String message;

	public PersonNotFoundException(String message) {
		super(message);
		this.message = message;
	}
	
	public PersonNotFoundException() {

	}

	public void displayMessage(){
		System.out.println(getMessage());
	}
	
}
