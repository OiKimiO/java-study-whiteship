package com.java.study.week4.collections;

public class Main {
    public static void main(String[] args) {
        // linkedListTest();
        // arrayStack();
        // linkedListStack();
        // linkedListQueue();
        arrayQueue();
    }

    private static void linkedListTest() {
        ListNode head = new ListNode(1);
        ListNode addToNode1 = new ListNode(2);
        ListNode addToNode2 = new ListNode(3);
        ListNode addToNode3 = new ListNode(4);

        head.add(head, addToNode1, 0);
        head.add(head, addToNode2, 1);
        head.add(head, addToNode3, 2);

        if(head.contains(head, addToNode2)){
            System.out.println("데이터가 포함되어 있습니다.");
        }

        head.remove(head, 2);

        if(head.contains(head, addToNode3)){
            System.out.println("데이터가 포함되어 있습니다.");
        }else{
            System.out.println("데이터가 포함되지 않았습니다.");
        }
    }

    private static void arrayStack() {
        ArrayStack stacked = new ArrayStack();
        stacked.push(1);
        stacked.push(2);
        stacked.push(3);

        System.out.println(stacked.pop());
        System.out.println(stacked.pop());
        stacked.push(4);
        System.out.println(stacked.pop());
    }

    private static void linkedListStack() {
        ListNodeStack stack = new ListNodeStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(4);
        System.out.println(stack.pop());
    }

    private static void linkedListQueue() {
        ListNodeQueue queue = new ListNodeQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        queue.push(4);
        System.out.println(queue.pop());
    }

    private static void arrayQueue() {
        ArrayQueue queue = new ArrayQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        queue.push(4);
        System.out.println(queue.pop());
    }
}
