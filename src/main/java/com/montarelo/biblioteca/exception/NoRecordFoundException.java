package com.montarelo.biblioteca.exception;

public class NoRecordFoundException extends Exception {
	
	
	private static final long serialVersionUID = 1L;
	private static final String MESSAGE = "No record exists for the given input";
	
	public NoRecordFoundException() {
		super(MESSAGE);
	}
	
	public NoRecordFoundException(Throwable cause) {
		super(MESSAGE, cause);
	}
	
	public NoRecordFoundException(String message) {
		super(message);
	}

}
