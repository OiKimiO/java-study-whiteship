package com.java.study.week11;

public class EnumFruits {
    public static final int APPLE = 1;
    public static final int PEACH = 2;
    public static final int BANANA = 3;

    // public static final int APPLE = 1;
    public static final int GOOGLE = 2;
    public static final int FACEBOOK = 3;

    public static void main(String[] args) {
        int type = APPLE;
        String kacl = switch(type){
            case APPLE -> "32 kcal";
            case PEACH -> "52 kcal";
            case BANANA -> "16 kcal";
            default -> "0 kcal";
        };

        System.out.println(kacl);
    }
}
