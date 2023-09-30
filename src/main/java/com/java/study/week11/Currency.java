package com.java.study.week11;

public enum Currency {
    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);

    private int value;

    Currency(int value) {
        this.value = value;
    }
    public int value(){
        return value;
    }
}
