package adminModule;

import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {
//		Tenant tenant = new Tenant(); // subclass type object
//		tenant.setUsername("admin@123");
//		tenant.setPassword("admin@123!");
//		System.out.println(tenant);
//		System.out.println(tenant.toString());
//		
//		
//		
//		
////		()data_tyoe
//		TmsUser tmsUser = new TmsUser(); // superClass type
//		Tenant tenantUserObject = (Tenant)tmsUser;
		
		Admin admin = new Admin();
		admin.addLandlord(new Landlord());
		admin.addLandlord(new ArrayList<>());
		admin.addLandlord(new Landlord(), true);
		
		
		TmsUser tmsUser;
		tmsUser = new Tenant();
		tmsUser.printUserInformation();
		
		tmsUser = new TmsUser();
		tmsUser.printUserInformation();
		
	}

}
