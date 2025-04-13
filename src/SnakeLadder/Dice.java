package SnakeLadder;

public class Dice {
    private int minNumber = 1;
    private int maxNumber = 6;

    public Dice(){}

    public int rollDice(){
        return (int)(Math.random() *(maxNumber-minNumber+1)) + minNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }
}
