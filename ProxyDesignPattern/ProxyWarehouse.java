package ProxyDesignPattern;

import java.util.List;

public class ProxyWarehouse implements IOrder{
    private List<RealWarehouse>realWarehouses;

    public ProxyWarehouse(List<RealWarehouse> realWarehouses){
        this.realWarehouses = realWarehouses;
    }
    @Override
    public void fulfillOrder(Order order) {
        for(Item item: order.itemList){
            for (RealWarehouse realWarehouse: realWarehouses){
                if (realWarehouse.currentInventory(item)>0){
                    Order order1 = new Order(List.of(item));
                    realWarehouse.fulfillOrder(order1);
                    break;
                }
            }
        }

    }
}
