package Proxy;
/*
Write a java program to demonstrate the implementation of a proxy pattern
for an online retail store with a global distribution and warehousing.
 */

interface OnlineRetailStore {
    void processOrder(String product, int quantity);
}
class RealOnlineRetailShop implements OnlineRetailStore {
    @Override
    public void processOrder(String product, int quantity) {
        System.out.println("Processing order for " + quantity + " units of " + product);
    }
}

class RetailShopProxy implements OnlineRetailStore {
    private RealOnlineRetailShop realOnlineRetailShop;

    @Override
    public void processOrder(String product, int quantity) {
        if (realOnlineRetailShop == null) {
            realOnlineRetailShop = new RealOnlineRetailShop();
        }

        System.out.println("Verifying product");

        realOnlineRetailShop.processOrder(product, quantity);

        System.out.println("Sending shipping");
    }
}


public class Proxy {
    public static void main(String[] args) {
        OnlineRetailStore proxy = new RetailShopProxy();
        proxy.processOrder("Laptop", 3);
        proxy.processOrder("Mobile Phone", 4);
        proxy.processOrder("SmartWatch", 7);
        proxy.processOrder("Tablet", 5);
        proxy.processOrder("Laptop", 20);
        proxy.processOrder("Desktop", 8);
    }
}

