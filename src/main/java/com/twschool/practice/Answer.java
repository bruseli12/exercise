package com.twschool.practice;

import java.util.Arrays;
import java.util.List;

public class Answer {
    private String answernumber;

    public Answer(String answernumber) {
        this.answernumber = answernumber;
    }

    public String check(String usernumber) {
        List<String> usernumberlist = Arrays.asList(usernumber.split(" "));
        List<String> answernumberlist = Arrays.asList(answernumber.split(" "));
        System.out.println(usernumberlist.toString());
        System.out.println(answernumberlist.toString());

        int valueAndpositionCorrect = 0;
        int valueCorrectAndpositionIncorrect = 0;
        for (int index = 0; index < usernumberlist.size(); index++) {
            if (answernumberlist.get(index) .equals(usernumberlist.get(index))) {
                valueAndpositionCorrect++;
            } else if (answernumberlist.contains(usernumberlist.get(index))) {
                valueCorrectAndpositionIncorrect++;
            }
        }
        System.out.println(valueAndpositionCorrect);
        System.out.println(valueCorrectAndpositionIncorrect);


        return valueAndpositionCorrect+"A"+valueCorrectAndpositionIncorrect+"B";
    }
}
