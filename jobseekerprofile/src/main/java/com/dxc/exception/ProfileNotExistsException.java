package com.dxc.exception;

public class ProfileNotExistsException extends Exception {

	String msg;
	
	public ProfileNotExistsException() {
		super();
	}
	
	public ProfileNotExistsException(String msg) {
		super(msg);
	}
	
}
