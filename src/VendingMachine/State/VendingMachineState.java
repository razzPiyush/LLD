package VendingMachine.State;

import VendingMachine.Coin;
import VendingMachine.Note;
import VendingMachine.Product;

public interface VendingMachineState {
    public void selectItems(Product product);
    public void insertCoins(Coin coin);
    public void insertNotes(Note note);
    public void returnChange();
    public void dispenseItem();

}
