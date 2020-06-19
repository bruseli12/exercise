package com.twschool.practice;

public class FizzBuzz{
    public String say(int number){
        StringBuffer result=new StringBuffer();
        if(String.valueOf(number).contains("3"))
            return  "Fizz";
        if(number%3==0)   result.append("Fizz");
        if(number%5==0)   result.append("Buzz")  ;
        if(number%7==0)   result.append("Whizz")  ;
        if("".equals(result.toString()))
            return String.valueOf(number);
        return result.toString();
    }

}
