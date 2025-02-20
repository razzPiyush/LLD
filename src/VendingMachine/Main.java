package VendingMachine;

/*
The VendingMachineDemo class demonstrates the usage of the vending machine by adding products to the inventory,
selecting products, inserting coins and notes, dispensing products, and returning change.
 */
public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = VendingMachine.getInstance();

        // add the products to inventory
        Product product1 = new Product("bakardi", 200);
        Product product2 = new Product("balentine", 300);
        Product product3 = new Product("teachers", 100);

        vendingMachine.inventory.addProducts(product1);
        vendingMachine.inventory.addProducts(product1);
        vendingMachine.inventory.addProducts(product2);
        vendingMachine.inventory.addProducts(product2);
        vendingMachine.inventory.addProducts(product3);

        // select the products
        vendingMachine.setSelectedProduct(product3);

        // insert the coins or notes
        // vendingMachine.insertNote(Note.FIVEHUNDRED);
        vendingMachine.insertCoin(Coin.HUNDREDRUPEE);
        vendingMachine.insertNote(Note.TEN);
        vendingMachine.insertCoin(Coin.TWENTYRUPPE);

        // dispense the item
        vendingMachine.dispenseItem();

        // return change
        vendingMachine.returnChange();

        vendingMachine.inventory.removeProduct(product2);
        System.out.println("Product Quantity of " + product2.getName() + " is  "+
                vendingMachine.inventory.getQuantity(product2));
        vendingMachine.setSelectedProduct(product2);

        // insert the coins or notes
        vendingMachine.insertNote(Note.FIVEHUNDRED);
        vendingMachine.insertCoin(Coin.FIFTYRUPEE);
        vendingMachine.insertNote(Note.TEN);
        vendingMachine.insertCoin(Coin.TWENTYRUPPE);

        // dispense the item
        vendingMachine.dispenseItem();

        // return change
        vendingMachine.returnChange();
    }
}

/*
Rough flow ->
1) Vending machine is in Idle state. (waiting for user to select the Item)
2) The user select the item, the price of the items are written below the item (machine is in now ready state)
3) The user insert the money (either in the form of Coins or rupees)
4) The machine returns the output (insufficient money or returns the extra money that user inserted)
5) The machine is now on return change state (it returns the extra money {chain of responsibility pattern})
6) After the transaction is over, the machine dispense the product (machine: dispense state)
7) Machine again returns to the IDLE state
 */