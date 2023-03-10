package adminModule;

import java.util.ArrayList;
import java.util.List;

public class Admin extends TmsUser  {
	private List<Landlord> landlords = new ArrayList<>();
	private List<Tenant> tenants = new ArrayList<>();
	
//Clt + Shift + t
//	Alt + Shift + M = Create method
//	addLandlord(List<Landlord> landlords) - it will add list of landlords at a time

	public void addLandlord(List<Landlord> landLords) {
		System.out.println("Adding list of landlords");
	}
	
//	addLandlord(Landlord landlord) - it will add one landlord at a time
	public void addLandlord(Landlord landlord) {
		System.out.println("Adding one landlord");
	}
	
//	addLandlord(Landlord landlord, boolean isVipLandlord)-
	public void addLandlord(Landlord landlord, boolean isVipLandlord) {
		System.out.println("Adding one landlord with isVipLandlord field set");
	}
	
	
	public void viewLandlords() {
		if(landlords.isEmpty()) {
			throw new LandlordNotFoundException();		
		}
	}
	
	

	//Ctrl+Shift+F
	public void updateLandlord() {

	}
	
	public void deleteLandlord() {

	}
	
	public void addTenant() {

	}

	public void viewTenants() {
		if(tenants.isEmpty()) {
			throw new TenantNotFoundException();
		}
	}

	//Ctrl+Shift+F
	public void updateTenant() {

	}
	
	public void deleteTenant() {

	}
	public static void main(String [] args) {
		Admin admin = new Admin();
		try {
			admin.viewLandlords();
		} catch (LandlordNotFoundException e) {
			System.out.println("Sorry there are no landlords currently.");
		}
		
		try {
			admin.viewTenants();
		} catch (TenantNotFoundException e) {
			System.out.println("Currently, there are no tenants!");
		}
		
	}
	// Shift + Alt + S

	@Override
	public void login() {
		System.out.println("Login successful.");
		
	}

	@Override
	public void logout() {
		System.out.println("Logout successul.");
		
	}

}
