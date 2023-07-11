package week3;

import java.util.function.IntBinaryOperator;

public class DirectionOperator {
    public static void main(String[] args) {
        람다();
    }

    private static void 람다() {
        익명클래스();
        람다표현식();
    }

    private static Object 익명클래스() {
        return new Object(){
            int min(int x, int y){
                return x < y? x : y;
            }
        };
    }

    private static IntBinaryOperator 람다표현식() {
        return (x,y) -> x < y ? x : y;
    }
}
