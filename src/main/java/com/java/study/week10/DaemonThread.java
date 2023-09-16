package com.java.study.week10;

import java.lang.Thread;

public class DaemonThread extends Thread {

    @Override
    public void run(){
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}