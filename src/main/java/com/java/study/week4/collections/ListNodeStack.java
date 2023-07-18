package com.java.study.week4.collections;

public class ListNodeStack {

    private ListNode head = new ListNode();
    private int currentIndex = 0;
    private int increaseIndex = 0;

    void push(int data){
        currentIndex = increaseIndex;
        ListNode listAddNode = new ListNode(data);
        head.add(head, listAddNode, currentIndex);
        increaseIndex++;
    }

    int pop(){
        ListNode node = head.remove(head, currentIndex);
        if(currentIndex > 0){
            currentIndex--;    
        }
        increaseIndex--;

        return node.getData();
    }

}
