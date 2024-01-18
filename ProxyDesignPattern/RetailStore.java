package ProxyDesignPattern;

import java.util.List;

public class RetailStore {
    public static void main(String[] args) {
        RealWarehouse w1 = new RealWarehouse("grocery Shop");
        w1.stock.put("Tea", 20);
        w1.stock.put("chocolate", 10);
//        w1.stock.put("Biscuit",  50);
        List<RealWarehouse> warehouses = List.of(w1);
        ProxyWarehouse warehouse = new ProxyWarehouse(warehouses);

        Item i1 = new Item("Biscuit");
        Item i2 = new Item("Tea");
        Item i3 = new Item("chocolate");

        Order o1 = new Order(List.of(i1,i2));
        warehouse.fulfillOrder(o1);



    }
}
