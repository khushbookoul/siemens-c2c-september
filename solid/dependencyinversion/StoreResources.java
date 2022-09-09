abstract public class StoreResources implements InventoryInterface{
    protected String resourceId;
    protected float resourceCost;
    protected float resourceUnits;   


    public StoreResources(String resourceId, float resourceCost, float resourceUnits) {
        this.resourceId = resourceId;
        this.resourceCost = resourceCost;
        this.resourceUnits = resourceUnits;
    }


    public String getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public float getResourceCost() {
        return this.resourceCost;
    }

    public void setResourceCost(float resourceCost) {
        this.resourceCost = resourceCost;
    }

    public float getResourceUnits() {
        return this.resourceUnits;
    }

    public void setResourceUnits(float resourceUnits) {
        this.resourceUnits = resourceUnits;
    }



    @Override
    public String toString() {
        return "{" +
            " resourceId='" + getResourceId() + "'" +
            ", resourceCost='" + getResourceCost() + "'" +
            ", resourceUnits='" + getResourceUnits() + "'" +
            "}";
    }


}
