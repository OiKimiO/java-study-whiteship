package com.java.study.week6;

public class InterfaceImpl {
}

interface MyInterface{
    int value = 10;
    int calculate(int a);
}

class CalA implements MyInterface{
    @Override
    public int calculate(int a){
        return value + a;
    }
}
class CalB implements MyInterface{
    @Override
    public int calculate(int a){
        return value * a;
    }
}