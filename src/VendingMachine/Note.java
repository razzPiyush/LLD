package VendingMachine;

public enum Note {
    TEN(10),
    FIFTY(50),
    HUNDRED(100),
    FIVEHUNDRED(500);

    public final int value;
    private Note(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
