package week3;

public class TernaryOperator {

    public static void main(String[] args) {
        System.out.printf("두 수 중 큰수는 %d입니다.", 큰수(5,7));
    }

    private static int 큰수(int num1, int num2) {
        return (num1 - num2 > 0) ? num1 : num2;
    }
}
