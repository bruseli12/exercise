package com.twschool.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessNumberTest {


    @Test
    public void should_return_0A0B_when_check_given_gameanswer_1234_useranswer_123(){
        //given
        int[] gameanswer=new int[]{1,2,3,4};
        int[] useranswer=new int[]{1,2,3};
        //when
        String result=GuestNumber.check(gameanswer,useranswer);
        //then
        assertEquals(result,"0A0B");
    }



    @Test
    public void should_return_0A0B_when_check_given_gameanswer_1234_useranswer_1123(){
        //given
        int[] gameanswer=new int[]{1,2,3,4};
        int[] useranswer=new int[]{1,1,2,3};
        //when
        String result=GuestNumber.check(gameanswer,useranswer);
        //then
        assertEquals(result,"0A0B");
    }

    @Test
    public void should_return_0A0B_when_check_given_gameanswer_1234_useranswer_1123(){
        //given
        int[] gameanswer=new int[]{1,2,3,4};
        int[] useranswer=new int[]{1,1,2,3};
        //when
        String result=GuestNumber.check(gameanswer,useranswer);
        //then
        assertEquals(result,"0A0B");
    }
}
