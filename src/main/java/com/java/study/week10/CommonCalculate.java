package com.java.study.week10;

public class CommonCalculate {
    private int amount;

    public CommonCalculate() {

    }

    public void plus(int value){
        amount += value;
    }

    public void minus(int value){
        amount -= value;
    }

    public int getAmount(){
        return amount;
    }
}
