public class Soap extends Product{

    private SoapType soapType;


    public SoapType getSoapType() {
        return this.soapType;
    }

    public void setSoapType(SoapType soapType) {
        this.soapType = soapType;
    }


    @Override
    public String toString() {
        return "{" +
            " productId='" + getProductId() + "'" +
            ", productCost='" + getProductCost() + "'" +
            ", productUnits='" + getProductUnits() + "'" +
            " soapType='" + getSoapType() + "'" +
            "}";
    }


    public Soap(String productId, float productCost, float productUnits,SoapType soapType) {
        super(productId, productCost, productUnits);
        this.soapType = soapType;
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
