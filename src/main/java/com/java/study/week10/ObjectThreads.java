package com.java.study.week10;

import java.lang.Thread;

public class ObjectThreads extends Thread {

    public static void main(String[] args) {
        // runThreads1();
        runThreads2();
    }

    private static void runThreads2() {
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor);
        StateThread thread2 = new StateThread(monitor);

        try {
            System.out.println("thread state = " + thread.getState());
            thread.start();
            thread2.start();
            System.out.println("thread state(after start) = " + thread.getState());

            Thread.sleep(100);
            System.out.println("thread state(after 0.1 sec) = " + thread.getState());

            synchronized (monitor){
                monitor.notifyAll();
            }

            Thread.sleep(100);
            System.out.println("thread state(after notify)=" + thread.getState());

            thread.join();
            System.out.println("thread state(after join)=" + thread.getState());
            thread2.join();
            System.out.println("thread2 state(after join)=" + thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void runThreads1() {
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor);  // 1

        try {
            System.out.println("thread state = " + thread.getState());
            thread.start(); // 2
            System.out.println("thread state(after start) = " + thread.getState());

            Thread.sleep(100);
            System.out.println("thread state(after 0.1 sec) = " + thread.getState());

            synchronized (monitor){
                monitor.notify(); // 3
            }

            Thread.sleep(100);
            System.out.println("thread state(after notify)=" + thread.getState());

            thread.join(); // 4
            System.out.println("thread state(after join)=" + thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
