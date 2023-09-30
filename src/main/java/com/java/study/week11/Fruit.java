package com.java.study.week11;

public class Fruit {
    public static final Fruit APPLE = new Fruit("APPLE");
    public static final Fruit PEACH = new Fruit("PEACH");
    public static final Fruit BANANA = new Fruit("BANANA");

    private String name;

    private Fruit(String name) {
        this.name = name;
    }
}
