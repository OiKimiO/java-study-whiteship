package com.java.study.week10;

import java.lang.Runnable;

public class RunnableSample implements Runnable{
    @Override
    public void run() {
        System.out.println("This is RunnableSample's run() method.");
    }
}
