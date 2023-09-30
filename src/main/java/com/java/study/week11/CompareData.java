package com.java.study.week11;

public class CompareData {
    public static void main(String[] args) {
        if( Company.APPLE == Fruit.APPLE){
            System.out.println("논리적으로 맞으면 안됨");
        }else{
            System.out.println("정답");
        }
    }
}
