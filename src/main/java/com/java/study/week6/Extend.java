package com.java.study.week6;

public class Extend {

}

class Parent{
    int a = 10;
};
class Child extends Parent{
    int a = 20;

    void childMethod(){
        System.out.println(a);       // 출력: 20
        System.out.println(this.a);  // 출력: 20
        System.out.println(super.a); // 출력: 10
    }
};

class Child2 extends Child{

}
