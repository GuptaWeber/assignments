package com.exce;

public class BookNotFoundException extends Exception {

	private String message;

	public BookNotFoundException(String message) {
		super(message);
		this.message = message;
	}
	
	public BookNotFoundException() {

	}

	public void displayMessage(){
		System.out.println(getMessage());
	}
	
}
