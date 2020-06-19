package com.twschool.practice;

import java.util.Scanner;

public class GuessMain {
    public static void main(String[] args) {
        String answer = RandomGenerate.generate();
        Answer answernumber = new Answer(answer);
        GuessAnswer guessAnswer = new GuessAnswer(answernumber);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            GuessStatus guessStatus = guessAnswer.guess(input);
            if (guessStatus.equals(GuessStatus.SUCCEED)) {
                System.out.println("input correct output is "+guessAnswer.getResult());
                break;
            }else if(guessStatus.equals(GuessStatus.FIALED)){
                System.out.println("input 6 times failed");
                break;
            }else{
                System.out.println("input incorrect please continue ,ouput is "+guessAnswer.getResult());
            }
        }

    }
}
