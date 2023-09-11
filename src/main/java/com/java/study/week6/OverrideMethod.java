package com.java.study.week6;

public class OverrideMethod {

}

class A{
    public void print(){

    }
}

class B extends A{
    // 메서드 오버라이딩 - A를 상속받았으나 함수를 재정의하였음
    public void print(){
        System.out.println("B");
    }
}
