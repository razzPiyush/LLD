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
        if(currentMoney < productPrice){
            vendingMachine.resetPayment();
            vendingMachine.resetProduct();
            vendingMachine.setState((vendingMachine.getIdleState()));
            System.out.println("Sorry, product can't be dispatched due to insufficient money");
        }
        else {
            vendingMachine.setState(vendingMachine.getIdleState());
        }
    };
    public void dispenseItem(){
        System.out.println("Wait, currently returning the change if any");
    };
}
