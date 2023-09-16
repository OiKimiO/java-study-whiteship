package com.java.study.week10;

public class RunDaemonThread {
    public RunDaemonThread() {
        DaemonThread thread = new DaemonThread();
        thread.setDaemon(true);
        thread.start();
    }

}
