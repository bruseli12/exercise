package com.twschool.practice;

public class GuestNumber {
    public static String check(int[] gameanswer, int[] useranswer) {
        int gameanswersize = gameanswer.length;
        int useranswersize = useranswer.length;
        if (gameanswersize != useranswersize)
            return "0A0B";
        for(int i=0;i<useranswersize;i++){
            for(int j=0;j<useranswersize;j++){
                if(i==j)
                    continue;
                if(useranswer[i]==useranswer[j])
                    return  "0A0B";
            }
        }

         return "4A0b";
    }
}
