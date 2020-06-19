package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GuessAnswerTest {
    @Test
    public void should_return_status_SUCCEED_when_input_1234_given_answer_1234(){
        //given
        Answer answer=new Answer("1 2 3 4");
        GuessAnswer guessAnswer=new GuessAnswer(answer);
        //when
        GuessStatus guessStatus=guessAnswer.guess("1 2 3 4");
        //then
        Assert.assertEquals(GuessStatus.SUCCEED,guessStatus);
    }
   @Test
    public void should_return_status_SUCCEED_when_after_6_input_given_answer_1234(){
        //given
        Answer answer=new Answer("1 2 3 4");
        GuessAnswer guessAnswer=new GuessAnswer(answer);
        //when
        guessAnswer.guess("1 2 3 5");
        guessAnswer.guess("1 2 3 6");
        guessAnswer.guess("1 2 3 7");
        guessAnswer.guess("1 2 3 8");
        guessAnswer.guess("1 2 3 9");
        GuessStatus guessStatus=guessAnswer.guess("1 2 3 4");

        //then
        Assert.assertEquals(GuessStatus.SUCCEED,guessStatus);
    }
    @Test
    public void should_return_status_FALID_when_after_6_input_given_answer_1234(){
        //given
        Answer answer=new Answer("1 2 3 4");
        GuessAnswer guessAnswer=new GuessAnswer(answer);
        //when
        guessAnswer.guess("1 2 3 5");
        guessAnswer.guess("1 2 3 6");
        guessAnswer.guess("1 2 3 7");
        guessAnswer.guess("1 2 3 8");
        guessAnswer.guess("1 2 3 9");

        GuessStatus guessStatus=guessAnswer.guess("1 2 6 8");

        //then
        Assert.assertEquals(GuessStatus.FIALED,guessStatus);
    }

    @Test
    public void should_return_status_FALID_when_after_7_input_given_answer_1234(){
     String result=RandomGenerate.generate();
     System.out.println(Arrays.asList(result.split(" ")));
        //then
        Assert.assertEquals("1 2 3 4",result);
    }

}
