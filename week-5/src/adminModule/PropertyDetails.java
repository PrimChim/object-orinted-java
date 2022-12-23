package adminModule;

import java.util.List;

public class PropertyDetails {
	private String propertyDetails;
	private List<Tenant> tenants;
	
	public List<Tenant> getTenants() {
		return tenants;
	}

	public void setTenants(List<Tenant> tenants) {
		this.tenants = tenants;
	}

	public String getPropertyDetails() {
		return propertyDetails;
	}

	public void setPropertyDetails(String propertyDetails) {
		this.propertyDetails = propertyDetails;
	}
	
}
