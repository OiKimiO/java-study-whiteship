package com.java.study.week4.collections;

public class ArrayQueue {
    private int[] array = new int[10];
    private static int searchIndex = 0;
    private static int saveIndex = 0;

    void push(int data){
        array[saveIndex] = data;
        saveIndex++;
    }

    int pop(){
        int number = array[searchIndex];
        searchIndex++;
        return number;
    }
}
