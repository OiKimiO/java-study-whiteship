package com.java.study.week4.recursive;

public class Recursion {

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        System.out.println(recursion.factorial(0));
        System.out.println(recursion.factorial(1));
        System.out.println(recursion.factorial(2));
        System.out.println(recursion.factorial(3));
        System.out.println(recursion.factorial(4));
    }

    private int factorial(int number){
        if(number < 2){
            return 1;
        }

        return number * factorial(number - 1);
    }

}
