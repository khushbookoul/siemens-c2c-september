abstract public class Product implements InventoryInterface{
    protected String productId;
    protected float productCost;
    protected float productUnits;   


    public Product(String productId, float productCost, float productUnits) {
        this.productId = productId;
        this.productCost = productCost;
        this.productUnits = productUnits;
    }


    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public float getProductCost() {
        return this.productCost;
    }

    public void setProductCost(float productCost) {
        this.productCost = productCost;
    }

    public float getProductUnits() {
        return this.productUnits;
    }

    public void setProductUnits(float productUnits) {
        this.productUnits = productUnits;
    }



    @Override
    public String toString() {
        return "{" +
            " productId='" + getProductId() + "'" +
            ", productCost='" + getProductCost() + "'" +
            ", productUnits='" + getProductUnits() + "'" +
            "}";
    }


}
