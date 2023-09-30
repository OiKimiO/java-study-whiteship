package com.java.study.week11;

public enum Transport {
    BUS(1200){
        @Override
        double fare(int distance){
            return distance * BASIC_FARE * 1.5;
        }
    },

    TAXI(3900){
        @Override
        double fare(int distance) {
            return distance * BASIC_FARE * 2.0;
        }
    },

    SUBWAY(1200){
        @Override
        double fare(int distance) {
            return distance * BASIC_FARE * 0.5;
        }
    };
    protected final int BASIC_FARE; // 기본요금, protected로 선언해야 상수에서 접근 가능

    Transport(int BASIC_FARE) {
        this.BASIC_FARE = BASIC_FARE;
    }

    abstract double fare(int distance); // 거리에 따른 요금 계산
}
