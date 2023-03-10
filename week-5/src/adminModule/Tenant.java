package adminModule;

import java.util.List;

public class Tenant extends TmsUser{
	private String name;
	private Bill bill;
	
	private Address address;
	private List<Report> reports;
	private List<PropertyDetails> propertyDetails;
	
	
	public List<Report> getReports() {
		if(this.reports == null) {
			throw new ReportNotFoundException();
		}
		return reports;
	}


	public void setReports(List<Report> reports) {
		this.reports = reports;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public void printUserInformation() {
		super.printUserInformation();
		System.out.println("Tenant name = " + name );
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tenant [getUsername()=" + getUsername() + ", getPassword()=" + getPassword() + "]";
	}
	
	public void viewBill() {
		if(bill == null) {
			throw new TenantBillNotFoundException();
		}
	}
	
	public static void main(String [] args) {
		Tenant tenant = new Tenant();
		try {
			tenant.viewBill();
		} catch (TenantBillNotFoundException e) {
			System.out.println("Bill not created by the landlord.");
		}
		try {
			tenant.getReports();
		} catch (ReportNotFoundException e) {
			System.out.println("The reports are not created currently.");
		}
	}


	@Override
	public void login() {
		System.out.println("Login successful.");
		
	}


	@Override
	public void logout() {
		System.out.println("Logout successful.");
		
	}
	
}
