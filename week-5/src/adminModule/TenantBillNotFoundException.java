package adminModule;

public class TenantBillNotFoundException extends RuntimeException {

	public TenantBillNotFoundException() {
		super("Bill is not created by the landlord.");
	}

	
}
