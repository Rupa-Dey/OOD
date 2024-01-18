package ProxyDesignPattern;

import java.util.Hashtable;

public class RealWarehouse implements IOrder {
    public Hashtable<String,Integer> stock;
    public String address;
//    private Item item;

    public RealWarehouse (String address){
        this.address = address;
        this.stock = new Hashtable<>();
    }

    public Integer fulfillOrder(Order order1) {
        for (Item itm: Order.itemList){
            String itmName = itm.itm_n;
            if((stock.get(itmName)>0) && stock.containsKey(itmName)){
                stock.put(itmName, stock.get(itmName)-1);
            }
            else System.out.println("unavailable");
    }

    public int currentInventory(Item itm) {
            String itmN = itm.itm_n ;
            if(stock.containsKey(itmN)){
                return stock.get(itmN);
            }
            return 0;
    }
}


}
