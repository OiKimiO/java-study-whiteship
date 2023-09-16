package com.java.study.week10;

public class RunSync {
    public static void main(String[] args) {
        RunSync runSync = new RunSync();
        for (int loop = 0; loop < 5; loop++) {
            runSync.runCommonCalculate();
        }
    }

    private void runCommonCalculate() {
        CommonCalculate calc = new CommonCalculate(); // 1
        ModifyAmountThread thread1 = new ModifyAmountThread(calc,true); // 2
        ModifyAmountThread thread2 = new ModifyAmountThread(calc,true); // 2

        thread1.start(); // 3
        thread2.start(); // 3

        try {
            thread1.join(); // 4
            thread2.join(); // 4
            System.out.println("Final value is " + calc.getAmount()); // 5
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
