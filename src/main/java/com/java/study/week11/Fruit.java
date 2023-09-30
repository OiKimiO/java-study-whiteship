package com.java.study.week11;

public enum Fruit {
    APPLE, PEACH, BANANA;
    Fruit() {
        System.out.println("생성자 호출 " + this.name());
    }
}
