package com.portal;


public class CustomException extends Exception{
	private static final long serialVersionUID = 1L;
	private String errorMessage;
	
	public CustomException() {
		super();
	}

	public CustomException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}
	
	
}
