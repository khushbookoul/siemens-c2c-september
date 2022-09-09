public class BillingDesk extends StoreResources {
    private String billingDeskManufacturer;

    public BillingDesk(String resourceId, float resourceCost, float resourceUnits,String billingDeskManufacturer) {
        super(resourceId, resourceCost, resourceUnits);
        this.billingDeskManufacturer = billingDeskManufacturer;
    }


    public String getBillingDeskManufacturer() {
        return this.billingDeskManufacturer;
    }

    public void setBillingDeskManufacturer(String billingDeskManufacturer) {
        this.billingDeskManufacturer = billingDeskManufacturer;
    }


    @Override
    public String toString() {
        return "{" +
            " resourceId='" + getResourceId() + "'" +
            ", resourceCost='" + getResourceCost() + "'" +
            ", resourceUnits='" + getResourceUnits() + "'" +
            " billingDeskManufacturer='" + getBillingDeskManufacturer() + "'" +
            "}";
    }

   

    @Override
    public void checkUnits() {
        System.out.println("Checking units of billing desk with ID: " + this.resourceId);
        
    }

    @Override
    public void orderForUnits() {
        System.out.println("Ordering units of billing desk with ID: " + this.resourceId);
        
    }



}
