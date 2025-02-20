package VendingMachine;

// class to manage products inside vending machine
// available products and their quantities
// CRUD operations

import java.util.HashMap;

public class Inventory {
    HashMap<Product, Integer> productamountHashMap;

    public Inventory(){
        productamountHashMap = new HashMap<>();
    }

    public void addProducts(Product product){
        productamountHashMap.put(product, productamountHashMap.getOrDefault(product, 0)+1);
    }

    public void removeProduct(Product product){
        productamountHashMap.put(product, productamountHashMap.getOrDefault(product, 0)-1);
    }

    public int getQuantity(Product product){
        return productamountHashMap.getOrDefault(product, 0);
    }

    public boolean availableProduct(Product product){
        return productamountHashMap.containsKey(product) && productamountHashMap.get(product) >= 1;
    }
}

/*
simplicaity ke liye apan assume karre ki hamare pas list of products hai,
ham isme shelf, no of rows insab pe focus nai karre hai
 */
