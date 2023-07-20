package com.java.study.week5;

import java.util.LinkedList;
import java.util.Queue;

// 출처: https://math-coding.tistory.com/164
public class BinaryTree {
    Node head;
    int size;

    public BinaryTree() {
        head = null;
        size = 0;
    }

    public void push(Node node){
        if(size == 0){
            head = node;
        }else{
            node = head;

            Queue<Node> queue = new LinkedList<Node>();
            queue.add(node);

            while(!queue.isEmpty()){
                Node temp = queue.poll();
                if(temp.left == null){
                    temp.left = node;
                    break;
                }else{
                    queue.add(temp.left);
                }

                if(temp.right == null){
                    temp.right = node;
                    break;
                }else{
                    queue.add(temp.right);
                }
            }
        }

        size++;
    }

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
