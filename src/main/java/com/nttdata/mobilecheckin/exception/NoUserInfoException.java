package com.nttdata.mobilecheckin.exception;

public class NoUserInfoException extends Exception {
	private String message;
	public NoUserInfoException(String message) {
	 this.message = message;
	}
	public String getMessage(){
		return message;
		
	}
}
