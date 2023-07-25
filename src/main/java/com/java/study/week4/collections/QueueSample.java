package com.java.study.week4.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.add(1);

        queue.poll();   // 꺼냈을 때 값이 없을 경우 null을 return
        queue.remove(); // 꺼냈을 때 값이 없을 경우 Exception 처리

        queue.peek();    // 꺼냈을 때 가장 첫값이 없을 경우 null을 return
        queue.element(); // 꺼냈을 때 가장 첫값이 없을 경우 Exception 처리
    }
}
