package com.java.study.week11;

public enum Transport {
    BUS(1200), TAXI(3900), SUBWAY(1200);
    private final int BASIC_FARE; // 기본요금

    Transport(int BASIC_FARE) {
        this.BASIC_FARE = BASIC_FARE;
    }

    public double fare(){
        switch (this){ // 운송 수단별로 다르게 책정되는 요금
            case BUS -> {
                return BASIC_FARE * 1.5;
            }
            case TAXI -> {
                return BASIC_FARE * 2.0;
            }
            case SUBWAY -> {
                return BASIC_FARE * 0.5;
            }
            default -> throw new IllegalArgumentException(); // 실행될 일 없느 코드이지만 없으면 컴파일 에러남
        }
    }
}
