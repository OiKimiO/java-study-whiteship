package com.java.study.week12;

import java.lang.annotation.Annotation;

public class AnonymousAnnotation {
    public static void main(String[] args) {
        Annotation annotation = new Annotation() {
            @Override
            public Class<? extends Annotation> annotationType() {
                return null;
            }
        };
    }
}
