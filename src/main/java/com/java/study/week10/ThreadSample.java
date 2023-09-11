package com.java.study.week10;

import java.lang.Thread;

public class ThreadSample extends Thread {

    @Override
    public void run(){
        System.out.println("This is Runnable's run() method.");
    }
}
