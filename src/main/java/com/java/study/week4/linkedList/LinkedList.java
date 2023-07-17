package com.java.study.week4.linkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }

    public Node firstNodeAdd(int value){
        Node node = new Node(value);

    }
    /*private ListNode next = null;
        private ListNode prev = null;
        private int position = 0;

        public ListNode() {

        }

        ListNode add(ListNode head, ListNode nodeToAdd, int position){
            this.prev = head;
            this.next = nodeToAdd;
            this.position = position;
            return this;
        }

        ListNode remove(ListNode head, int positionToRemove){
            return this;
        }

        boolean contains(ListNode head, ListNode nodeTocheck){
            return false;
        }*/
}
