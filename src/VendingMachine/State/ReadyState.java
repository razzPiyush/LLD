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
        vendingMachine.insertCoin(coin);
        vendingMachine.addCoin(coin);
        // vedingMachine me coin add karre hai
        vendingMachine.setState(vendingMachine.getReturnChangeState());
        // Issi veding machine ka dusra state lekar apan issi vending machine me set karre hai
        System.out.println("Successfully, inserted coin of " + coin.getValue());
    };
    public void insertNotes(Note note){
        vendingMachine.insertNote(note);
        vendingMachine.addNote(note);
        vendingMachine.setState(vendingMachine.getReturnChangeState());
        System.out.println("Successfully, inserted coin of " + note.getValue());
    };
    public void returnChange(){
        System.out.println("Insert the coin or money");
    };
    public void dispenseItem(){
        System.out.println("Insert the coin or money");
    };
}
