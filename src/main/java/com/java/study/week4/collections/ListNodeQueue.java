package com.java.study.week4.collections;

public class ListNodeQueue {
    private static ListNode head = new ListNode();
    private static int firstIndex = 0;
    private static int increaseIndex = 0;

    static void push(int data){
        ListNode listAddNode = new ListNode(data);
        head.add(head,listAddNode,increaseIndex);
        increaseIndex++;
    }

    static int pop(){
        if(increaseIndex < firstIndex){
            System.out.println("데이터가 없습니다.");
            return 0;
        }
        ListNode listNode = ListNode.remove(head, firstIndex);
        increaseIndex--;
        return listNode.getData();
    }
}
