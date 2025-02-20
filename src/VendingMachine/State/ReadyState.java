package VendingMachine.State;

import VendingMachine.Coin;
import VendingMachine.Note;
import VendingMachine.Product;
import VendingMachine.VendingMachine;

public class ReadyState implements VendingMachineState {

    public VendingMachine vendingMachine;

    public ReadyState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    public void selectItems(Product product){
        System.out.println("Insert the coin or money");
    };
    public void insertCoins(Coin coin){
        vendingMachine.addCoin(coin);
        // Issi veding machine ka dusra state lekar apan issi vending machine me set karre hai
        System.out.println("Successfully, inserted coin of " + coin.getValue());
        checkPaymentStatus();
    };
    public void insertNotes(Note note){
        vendingMachine.addNote(note);
        System.out.println("Successfully, inserted note of " + note.getValue());
        checkPaymentStatus();
    };
    public void returnChange(){
        System.out.println("Insert the coin or money");
    };
    public void dispenseItem(){
        System.out.println("Insert the coin or money");
    };

    public void checkPaymentStatus(){
        int currentMoney = vendingMachine.getTotalPayment();
        int productPrice = vendingMachine.getProduct().getPrice();
        if(currentMoney >= productPrice){
            vendingMachine.setState(vendingMachine.getDispenseState());
        }
        else{
            vendingMachine.resetPayment();
            vendingMachine.resetProduct();
            vendingMachine.setState((vendingMachine.getIdleState()));
            System.out.println("Sorry, product can't be dispatched due to insufficient money");
        }
    }
}
