package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.stubbing.Answer;

public class AnswerTest {
    @Test
    public should_return_4A0B_when_compare_with_1234_given_answernumber_1234(){
        //given
        Answer answer=new Answer("1 2 3 4");
        //when
        String result=answer.check("1 2 3 4");
        //then
        Assert.assertEquals("4A0B",result);
    }
}
