package com.java.study.week4.collections;

public class ArrayStack {

    private int[] array = new int[10];
    private int increaseIndex = 0;
    private int currentIndex = 0;

    void push(int data){
        currentIndex = increaseIndex;
        array[currentIndex] = data;
        increaseIndex++;
    }

    int pop(){
        int data = array[currentIndex];
        array[currentIndex] = 0;
        currentIndex--;
        return data;
    }
}
