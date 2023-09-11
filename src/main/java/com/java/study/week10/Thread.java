package com.java.study.week10;

import java.lang.Runnable;

public class Thread implements Runnable{
    private static native void registerNatives();
    static {
        registerNatives();
    }

    @Override
    public void run() {

    }
}
