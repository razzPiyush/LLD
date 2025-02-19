package VendingMachine;

import VendingMachine.State.*;

public class VendingMachine {

    private final VendingMachineState currentState;
    private final VendingMachineState idleState;
    private final VendingMachineState readyState;
    private final VendingMachineState returnChangeState;
    private final VendingMachineState dispenseState;
    public Inventory inventory;
    public Product selectedProduct;
    int totalPayment;

    private static VendingMachine instance;

    private VendingMachine() {
        inventory = new Inventory();
        idleState = new IdleState(this);
        readyState = new ReadyState(this);
        returnChangeState = new ReturnChangeState(this);
        dispenseState = new DispenseState(this);
        currentState = idleState;
        selectedProduct = null;
        totalPayment = 0;

    };
    public static VendingMachine getInstance(){
        if(instance==null){
            instance = new VendingMachine();
        }
        return instance;
    }

    public void setSelectedProduct(Product product){
        currentState.selectedProduct = product;
    }
    public Product getProduct(){
        return selectedProduct;
    }

    // vending machine me coin insert karre hai
    public void insertCoin(Coin coin){
        currentState.insertCoins(coin);
    }
    public void addCoin(Coin coin){
        totalPayment += coin.getValue();
    }

    // machine me note insert karre hai
    public void insertNote(Note note){
        currentState.insertNotes(note);
    }
    public void addNote(Note note){
        totalPayment += note.getValue();
    }

    public int getTotalPayment(){
        return totalPayment;
    }

    public void returnChange(){
        currentState.returnChange();
    }

    public void dispenseItem(){
        currentState.dispenseItem();
    }

    // vending machine me ham state set kar sakte hai
    public void setState(VendingMachineState state){
        currentState = state;
    }

    // vending machine me methods declare karte hai jisse state ham switch kar sakenge
    public VendingMachineState getReadyState(){
        return readyState;
    }
    public VendingMachineState getIdleState(){
        return idleState;
    }
    public VendingMachineState getReturnChangeState(){
        return returnChangeState;
    }
    public VendingMachineState getDispenseState(){
        return dispenseState;
    }

    public void resetPayment(){
        totalPayment = 0;
    }
    public vois resetProduct(){
        selectedProduct = null;
    }

}

/*
The VendingMachine class maintains the current state, selected product, total payment, and provides methods
for state transitions and payment handling.
 */