package com.java.study.week11;

public class EnumDemo{
    enum Season {SPRING, SUMMER, FALL, WINTER}

    public static void main(String[] args){
        printSeason(Season.SPRING);
    }

    public static void printSeason(Season season){
        switch(season){
            case SPRING -> System.out.println("봄입니다.");
            case SUMMER -> System.out.println("봄입니다.");
            case FALL -> System.out.println("봄입니다.");
            case WINTER -> System.out.println("봄입니다.");
            default -> throw new IllegalArgumentException("계절의 이름이 아닙니다.");
        }
    }
}
