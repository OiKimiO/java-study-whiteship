package week3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class DirectionOperator {
    public static void main(String[] args) {
        람다();
    }

    private static void 람다() {
        익명클래스();
        람다표현식();
        람다표현식_매개변수하나_테스트();
        람다표현식_중괄호_없음_테스트();
        람다표현식_return은_중괄호_필수_테스트();
    }

    private static Object 익명클래스() {
        return new Object(){
            int min(int x, int y){
                return x < y? x : y;
            }
        };
    }

    private static IntBinaryOperator 람다표현식() {
        return (int x, int y) -> x < y ? x : y;
    }

    private static IntBinaryOperator 람다표현식_타입추론가능() {
        return (x, y) -> x < y ? x : y;
    }

    private static void 람다표현식_매개변수하나_테스트() {
        Consumer<String> 일반_consumer = 일반표현식_매개변수하나();
        일반_consumer.accept("은호");

        Consumer<String> 람다_consumer = 람다표현식_매개변수하나();
        람다_consumer.accept("은호");
    }

    private static Consumer<String> 일반표현식_매개변수하나(){
        return new Consumer<String>(){
            @Override
            public void accept(String s) {
                System.out.println("Hello, World! " + s);
            }
        };
    }

    private static Consumer<String> 람다표현식_매개변수하나() {
        return s ->  System.out.println("Hello, World! " + s);
    }

    private static void 람다표현식_중괄호_없음_테스트() {
        Consumer<String> 일반_consumer = 람다표현식_몸체중괄호();
        일반_consumer.accept("은호");

        Consumer<String> 람다_consumer = 람다표현식_몸체중괄호_없음();
        람다_consumer.accept("은호");
    }

    private static Consumer<String> 람다표현식_몸체중괄호() {
        return s -> {
            System.out.println("Hello, World! " + s);
        };
    }

    private static Consumer<String> 람다표현식_몸체중괄호_없음() {
        return s -> System.out.println("Hello, World! " + s);
    }

    private static void 람다표현식_return은_중괄호_필수_테스트() {
        Function<Integer, Integer> 람다_중괄호 = 람다표현식_중괄호();
        System.out.println(람다_중괄호.apply(3));
    }

    private static Function<Integer, Integer> 람다표현식_중괄호(){
        return (x) -> { return x * x; };
    }

    /* 컴파일 에러 발생!
       람다 표현식에서 함수의 몸체가 하나의 return 문으로만 이루어진 경우에는 중괄호를 생략할 수 없으므로,
       중괄호({})를 사용하여 몸체를 정의해야 합니다.
       private static Function<Integer, Integer> 람다표현식_중괄호_없음(){
           return (x) -> return x * x;
       }
    */
}
