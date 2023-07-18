package com.java.study.week4.collections;

import java.util.Objects;

public class ListNode {
    private int data;
    private ListNode next;

    public ListNode(){}

    public ListNode(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public static ListNode add(ListNode head, ListNode nodeToAdd, int position){
        ListNode target = head;
        for (int i = 0; i < position; i++) {
            if(target.next == null){
                System.out.println("해당 노드 위치에선 추가할 수 없습니다.");
                return head;
            }
            target = target.next;
        }
        nodeToAdd.next = target.next;
        target.next = nodeToAdd;
        return nodeToAdd;
    }

    public static ListNode remove(ListNode head, int positionToRemove){
        ListNode target = head.next;
        ListNode before = head;

        for (int i = 0; i < positionToRemove; i++) {
            if(target == null) {
                System.out.println("해당 노드 위치에선 삭제할 수 없습니다.");
                return head;
            }
            before = target;
            target = target.next;
        }

        before.next = target.next;
        return target;
    }

    public static boolean contains(ListNode head, ListNode nodeToCheck){
        while(head != null){
            if(head.equals(nodeToCheck)){
                return true;
            }
            head = head.next;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()){
            return false;
        }

        ListNode other = (ListNode) o;
        return data == other.data && Objects.equals(next, other.next);
    }

}
