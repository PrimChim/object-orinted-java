package com.roomrental;

import java.util.List;

public abstract class Tenant extends SystemUser implements TenantRights{
	abstract void viewLandlord();
	abstract void selectLandlord();
	
	void getReport() {
		List<Report> reports = null;
		if (reports==null) {
			throw new ReportNotFoundException("Currently there are no reports for this tenant!!");
		}
	}
	
}
