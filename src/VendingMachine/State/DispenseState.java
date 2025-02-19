package VendingMachine.State;

import VendingMachine.Coin;
import VendingMachine.Note;
import VendingMachine.Product;
import VendingMachine.VendingMachine;

public class DispenseState implements VendingMachineState {

    public VendingMachine vendingMachine;
    public DispenseState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    public void selectItems(Product product){
        System.out.println("Wait, dispensing the product");
    };
    public void insertCoins(Coin coin){
        System.out.println("Wait, dispensing the product");
    };
    public void insertNotes(Note note){
        System.out.println("Wait, dispensing the product");
    };
    public void returnChange(){
        System.out.println("Wait, dispensing the product");
    };
    public void dispenseItem(){
        vendingMachine.inventory.removeProduct(vendingMachine.getProduct());
        vendingMachine.resetProduct();
        vendingMachine.resetPayment();
        System.out.print("Successfully, dispatched the product. Thank you for your order");
        vendingMachine.setState(vendingMachine.getReturnChangeState());
    };
}