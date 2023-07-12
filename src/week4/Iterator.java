package week4;

import java.util.Stack;

public class Iterator {
    public static void main(String[] args) {
        // while문();
        doWhile문();
    }

    private static void while문() {
        Stack<Integer> stk = new Stack<>();
        stk.add(1);
        stk.add(2);

        while(!stk.isEmpty()){
            int number = stk.peek();
            System.out.println(number);
            stk.pop();
        }

    }

    private static void doWhile문() {
        Stack<Integer> stk = new Stack<>();
        stk.add(1);
        stk.add(2);
        do{
            System.out.println(stk.peek());
            stk.pop();
        }while (!stk.isEmpty());
    }
}
