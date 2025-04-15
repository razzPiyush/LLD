package VendingMachine;

public enum Coin {
    TENRUPPE(10),
    TWENTYRUPPE(20),
    FIFTYRUPEE(50),
    HUNDREDRUPEE(100);

    public final int value;
    Coin(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
