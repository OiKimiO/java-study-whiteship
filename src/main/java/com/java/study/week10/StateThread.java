package com.java.study.week10;

import java.lang.Thread;

public class StateThread extends Thread {
    private Object monitor;

    public StateThread(Object monitor){ // 1
        this.monitor = monitor;
    }

    public void run(){
        try {
            for (int loop = 0; loop < 10000; loop++) { // 2
                String a = "A";
            }
            synchronized (monitor){
                monitor.wait(); // 3
            }
            System.out.println(getName() + " is notified");
            Thread.sleep(1000); // 4
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
