package com.cloud.exception;

public class FieldRequireException extends CloudException {
	 
	public FieldRequireException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return msg;
	}

}
