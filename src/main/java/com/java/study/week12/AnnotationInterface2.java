package com.java.study.week12;

import java.lang.annotation.*;

@Target(value={ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface AnnotationInterface2 {

}
