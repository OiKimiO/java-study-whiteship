package com.java.study.week5.lecture;

public class Init {
    private int number;
    private String name;

    {
        this.number = 10;
        System.out.println("init block");
    }

    public Init(int number) {
        // super는 생략되어 있다.
        this(); // this 호출시점은 가장 처음에 해야한다.
        this.number = number;
    }

    public Init() {
        this.name = "whiteship";
    }

    public static void main(String[] args) {
        Init init = new Init(100);
        // 출력 값은 뭘까요?
        System.out.println(init.number);
        System.out.println(init.name);
    }
}
