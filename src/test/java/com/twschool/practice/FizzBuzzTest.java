package com.twschool.practice;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FizzBuzzTest {
    @Test
    public void should_retuen_35_given_3(){
        int number=35;
        FizzBuzz fizzBuzz=new FizzBuzz();
        String result=fizzBuzz.say(number);
        assertThat(result,is("Fizz"));
    }
}
