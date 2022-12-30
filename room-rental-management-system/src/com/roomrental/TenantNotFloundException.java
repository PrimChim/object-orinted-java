package com.roomrental;

@SuppressWarnings("serial")
public class TenantNotFloundException extends RuntimeException{

	public TenantNotFloundException(String message) {
		super(message);
	}
}
