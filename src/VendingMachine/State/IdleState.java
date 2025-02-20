package VendingMachine.State;

import VendingMachine.Coin;
import VendingMachine.Note;
import VendingMachine.Product;
import VendingMachine.VendingMachine;

public class IdleState implements VendingMachineState {

    private final VendingMachine vendingMachine;
    public IdleState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    public void selectItems(Product product){
        if(vendingMachine.inventory.availableProduct(product)){
            //vendingMachine.setSelectedProduct(product);
            vendingMachine.setState(vendingMachine.getReadyState());
            // vending machine me hame sare states bana rakhe hai aur initialize kar rakhe hai
            // ab hum vending machine se ready state utha ka usko set kardenge vending machine me
            System.out.println("Successfully, added the product " + product.getName());
        }
        else{
            System.out.println("Sorry, this product is out of stock");
        }
    };

    public void insertCoins(Coin coin){
        System.out.println("First select the product");
    };
    public void insertNotes(Note note){
        System.out.println("First select the product");
    };
    public void returnChange(){
        System.out.println("First select the product");
    };
    public void dispenseItem(){
        System.out.println("First select the product");
    };
}
