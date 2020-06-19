package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

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

}
