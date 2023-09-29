package com.java.study.week10;

public class CommonCalculate {
    private int amount;
    private int interest;
    public static Object interestLock = new Object();

    public CommonCalculate(){
        amount= 0;
    }

    public void addInterest(int value){
        synchronized (interestLock) {
            interest += value;
        }
    }

    public void plus(int value){
        synchronized (this) {
            amount += value;
        }
    }

    public void minus(int value){
        synchronized (this) {
            amount -= value;
        }
    }

    public int getAmount(){
        return amount;
    }
}
