package week3;

public class BitOperation {
    public static void main(String[] args) {
        bitOperation();
    }

    public static void bitOperation(){
        int num1 = 10; // 00000000 00000000 00000000 00001010
        int num2 = 15; // 00000000 00000000 00000000 00001111

        System.out.println(~num1); // 11111111 11111111 11111111 11110101
        System.out.println(num1 & num2); // 00000000 00000000 00000000 00001010
        System.out.println(num1 | num2); // 00000000 00000000 00000000 00001111
        System.out.println(num1 ^ num2); // 00000000 00000000 00000000 00000101
    }
}
