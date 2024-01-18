package ProxyDesignPattern;

import java.util.List;

public class Order {
   // public static Item[] itemList;
    List<Item> itemList;
    public Order(List<Item> itemList){
        this.itemList = itemList;
    }

}
