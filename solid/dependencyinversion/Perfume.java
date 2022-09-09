public class Perfume extends Product{

    private PerfumeType permType;
    
    public Perfume(String productId, float productCost, float productUnits,PerfumeType permType) {
        super(productId, productCost, productUnits);
        this.permType = permType;
    }


    public PerfumeType getPermType() {
        return this.permType;
    }

    public void setPermType(PerfumeType permType) {
        this.permType = permType;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }


    @Override
    public String toString() {
        return "{" +
            " productId='" + getProductId() + "'" +
            ",productCost='" + getProductCost() + "'" +
            ",productUnits='" + getProductUnits() + "'" +
            " permType='" + getPermType() + "'" +
            "}";
    }


    @Override
    public void checkUnits() {
        System.out.println("Checking for perfume units with id: " + this.productId);
        
    }

    @Override
    public void orderForUnits() {
       System.out.println("Ordering units of perfume with id : " + this.productId);
        
    }
    
}
