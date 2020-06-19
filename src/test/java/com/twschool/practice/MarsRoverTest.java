package com.twschool.practice;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
    @Test
    public  void should_return_positionX_0_positionY_1_direction_N_when_receive_direction_L_then_positionX_0_positionY_0_direction_N(){
        MarsPosition initPosition=new MarsPosition(0,0,Direction.N);
        MarsRover marsRover=new MarsRover(initPosition);
        MarsPosition endPosition=marsRover.receive("M");
        assertThat(endPosition.getX(),is(0));
        assertThat(endPosition.getY(),is(1));
        assertEquals(endPosition.getDirection(),Direction.N);

    }
    @Test
    public  void should_return_positionX_0_positionY_1_direction_W_when_receive_direction_L_then_positionX_0_positionY_0_direction_N(){
        MarsPosition initPosition=new MarsPosition(0,0,Direction.N);
        MarsRover marsRover=new MarsRover(initPosition);
        MarsPosition endPosition=marsRover.receive("ML");
        assertThat(endPosition.getX(),is(0));
        assertThat(endPosition.getY(),is(1));
        assertEquals(Direction.W,endPosition.getDirection());

    }

    @Test
    public  void should_return_positionX_0_positionY_4_direction_N_when_receive_direction_L_then_positionX_0_positionY_0_direction_N(){
        MarsPosition initPosition=new MarsPosition(0,0,Direction.N);
        MarsRover marsRover=new MarsRover(initPosition);
        MarsPosition endPosition=marsRover.receive("MMMM");
        assertThat(endPosition.getX(),is(0));
        assertThat(endPosition.getY(),is(4));
        assertEquals(endPosition.getDirection(),Direction.N);

    }


    @Test
    public  void should_return_positionX_0_positionY_0_direction_N_when_receive_direction_L_then_positionX_0_positionY_0_direction_N(){
        MarsPosition initPosition=new MarsPosition(0,0,Direction.N);
        MarsRover marsRover=new MarsRover(initPosition);
        MarsPosition endPosition=marsRover.receive("LLLL");
        assertThat(endPosition.getX(),is(0));
        assertThat(endPosition.getY(),is(0));
        assertEquals(endPosition.getDirection(),Direction.N);

    }
}
