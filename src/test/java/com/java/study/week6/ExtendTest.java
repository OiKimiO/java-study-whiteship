package com.java.study.week6;

import org.junit.jupiter.api.Test;

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
}
