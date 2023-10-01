package com.java.study.week12;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class AnnotationTest {
    public static void main(String[] args) {
        Gyeonggi gyeonggi = new Gyeonggi();
        Annotation[] annotations = gyeonggi.getClass().getAnnotations();

        Arrays.stream(annotations)
              .forEach(System.out::println);
    }

}
