package com.roomrental;

public interface TenantRights {
	
	static void leave() {
		System.out.println("I want to leave this property in the middle.");
	}
	
	default void requestPaymentDue() {
		System.out.println("I need some extention for this months. Due to some emergency.");
	}
	
	void reviewLandlord();
	
	void reviewProperty();
}
