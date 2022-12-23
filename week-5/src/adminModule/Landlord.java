package adminModule;

public class Landlord extends TmsUser {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
