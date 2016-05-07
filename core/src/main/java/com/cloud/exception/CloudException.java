package com.cloud.exception;

public class CloudException extends Exception {
String msg;
public CloudException(String msg){
	this.msg = msg;
}
}
