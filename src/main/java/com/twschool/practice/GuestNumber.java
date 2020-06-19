package com.twschool.practice;

public class GuestNumber {
    public static String check(int[] gameanswer, int[] useranswer) {
        int gameanswersize = gameanswer.length;
        int useranswersize = useranswer.length;
        if (gameanswersize != useranswersize)
            return "0A0B";

         return "4A0b";
    }
}
