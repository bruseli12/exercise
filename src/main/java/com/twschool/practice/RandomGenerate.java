package com.twschool.practice;

import java.util.Random;

public class RandomGenerate {
    private final static int MAX_VALUE = 9;
    private final static int MIN_VALUE = 0;

    public static String generate() {
        int count = 0;
        String generated_random_string = new String();
        Random random = new Random();
        while (count < 4) {
            String randNumber = String.valueOf(random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE);
            if (generated_random_string.contains(randNumber))
                continue;
            if (count == 0) {
                generated_random_string += randNumber;
            } else {
                generated_random_string += " " + randNumber;
            }
            count++;

        }
        return generated_random_string;
    }
}
