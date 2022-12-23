package adminModule;

public class TenantNotFoundException extends RuntimeException {

	public TenantNotFoundException() {
		super("Currently, there are no tenants!");
	}

	
}
