public class CleaningEquipment extends StoreResources {
    private EquipmentType equipmentType;

    public CleaningEquipment(String resourceId, float resourceCost, float resourceUnits,EquipmentType equipmentType) {
        super(resourceId, resourceCost, resourceUnits);
        this.equipmentType = equipmentType;
    }

    public EquipmentType getEquipmentType() {
        return this.equipmentType;
    }

    public void setEquipmentType(EquipmentType equipmentType) {
        this.equipmentType = equipmentType;
    }


    @Override
    public String toString() {
        return "{" +
            " equipmentType='" + getEquipmentType() + "'" +
            " resourceId='" + getResourceId() + "'" +
            ", resourceCost='" + getResourceCost() + "'" +
            ", resourceUnits='" + getResourceUnits() + "'" +
            "}";
    }


    @Override
    public void checkUnits() {
        System.out.println("Checking units of cleaning equipment with ID: " + this.resourceId);
        
    }

    @Override
    public void orderForUnits() {
        System.out.println("Ordering units of cleaning equipment with ID: " + this.resourceId);
        
    }



}
