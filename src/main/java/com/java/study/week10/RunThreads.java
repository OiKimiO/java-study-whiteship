package com.java.study.week10;

import java.lang.Thread;

public class RunThreads {
    public static void main(String[] args) {
        runBasic();
    }

    private static void runBasic() {
        RunnableSample runnable = new RunnableSample();
        new Thread(runnable).start();
        ThreadSample thread = new ThreadSample();
        thread.start();
        System.out.println("RunThreads.runBasic() method is ended");
    }
}
