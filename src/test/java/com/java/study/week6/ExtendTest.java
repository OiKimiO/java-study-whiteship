package com.java.study.week6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ExtendTest {

    @Test
    void super테스트(){
        Child child = new Child();
        child.childMethod();
    }

    @Test
    void 오버라이딩_테스트(){
        B b = new B();
        b.print(); // 재정의한 B값을 출력
    }

    @Test
    void 오버라이딩_테스트2(){
        ParnetA a = new ParnetA(new ChildB());
        a.print(); // 실행 시점엔 ChildB를 넣어 B에서 재정의한 데이터를 출력
    }

    @Test
    void 더블디스패치테스트(){
        List<Post> posts = Arrays.asList(new Text(), new Picture());
        List<SNS> sns = Arrays.asList(new Facebook(), new Twitter());

        posts.forEach(p -> sns.forEach(s -> p.postOn(s)));
    }

    @Test
    void 인터페이스테스트(){
        // 다형성 예제
        MyInterface add = new CalA();
        MyInterface multiply = new CalB();
        int calVal = 20;

        System.out.println(add.calculate(calVal));
        System.out.println(multiply.calculate(calVal));
    }
}
