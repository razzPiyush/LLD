package VendingMachine.State;

import VendingMachine.Coin;
import VendingMachine.Note;
import VendingMachine.Product;
import VendingMachine.VendingMachine;

public class ReturnChangeState implements VendingMachineState {

    public VendingMachine vendingMachine;
    public ReturnChangeState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    public void selectItems(Product product){
        System.out.println("Wait, currently returning the change if any");
    };
    public void insertCoins(Coin coin){
        System.out.println("Wait, currently returning the change if any");
    };
    public void insertNotes(Note note){
        System.out.println("Wait, currently returning the change if any");
    };
    public void returnChange(){
        int currentMoney = vendingMachine.getTotalPayment();
        int productPrice = vendingMachine.getProduct().getPrice();
        if(currentMoney >= productPrice){
            System.out.println("Returning the extra money " + (currentMoney-productPrice));
        }
        vendingMachine.resetProduct();
        vendingMachine.resetPayment();
        vendingMachine.setState(vendingMachine.getIdleState());
        System.out.println("Returning back to the Idle state!");
    };
    public void dispenseItem(){
        System.out.println("Wait, currently returning the change if any");
    };
}
