package com.roomrental;

import java.util.List;

public class Admin extends SystemUser{

	@Override
	void TmsUsers() {
		System.out.println("This is admin access...");
		
	}
	
	void getTenants() {
		List<Tenant> tenants=null;
		if(tenants == null) {
			throw new TenantNotFloundException("Currently, there are no tenants!");
		}
	}
	
	void getLandlords() {
		List<Landlord> landlords = null;
		if(landlords == null) {
			throw new LandlordNotFoundException("Currently, there are no any landlords!");
		}
	}
	
}
