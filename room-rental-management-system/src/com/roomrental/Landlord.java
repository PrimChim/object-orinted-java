package com.roomrental;

import java.util.List;

public class Landlord implements LandlordRights{

	@Override
	public void notice() {
		System.out.println("I am informing you to leave this property within a week since someone will be there in coming time.");
	}

	@Override
	public void reviewBehavior() {
		System.out.println("Reviewing in the progress.");
	}

	@Override
	public void requestAdvance() {
		System.out.println("I request you to pay me the rent for this month in advance.");
	}
	
	void getTenantBill() {
		List<TenantBill> tenantBills = null;
		if(tenantBills == null) {
			throw new TenantBillNotFoundException("Currently there are no tenant bill!");
		}
	}
	
}
