package com.personal.mission.java10;

import java.util.Arrays;

public class FirstJava10 {
    public static void main(String[] args) {
        var features = Arrays.asList("lambdas","expressons", "variable");
        features.forEach(i->System.out.println(i));
        features.forEach(System.out::println);
    }
}
