import java.util.Vector;

public class Operations {
    
    void checkInventory(InventoryInterface obj){
        System.out.println(obj);
        System.out.println("Obj ID will be used to check inventory");
    }
    
    void orderInventory(InventoryInterface obj){
        System.out.println(obj);
        System.out.println("Obj ID will be used to order inventory");
    }


    public static void main(String[] args) {
        InventoryInterface p1 = new Perfume("per101", 100.0f, 10, PerfumeType.MALE);
        InventoryInterface s1 = new Soap("soap102", 20.0f, 12, SoapType.DETERGENT);
        InventoryInterface b1 = new BillingDesk("billdesk103", 11100.0f, 10, "IKEA");
        InventoryInterface ce = new CleaningEquipment("cleaningEquipment104", 2000.0f, 20, EquipmentType.FLOOR_CLEANING);

        Vector<InventoryInterface> inventory = new Vector<InventoryInterface>();

        inventory.add(p1);
        inventory.add(s1);
        inventory.add(b1);
        inventory.add(ce);



        for(InventoryInterface inv : inventory){
            inv.checkUnits();
            inv.orderForUnits();
        }
    }
}



