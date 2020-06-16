package com.thoughtworks;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_move_to_position_01N_when_direct_is_M_with_init_position_00N(){
        //given
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "N");
        MarsRover marsRover = new MarsRover(marsRoverPosition);
        //when
        MarsRoverPosition resultPosition = marsRover.travel("M");
        //then
        assertEquals(0, resultPosition.getCoordinateX());
        assertEquals(1, resultPosition.getCoordinateY());
        assertEquals("N", resultPosition.getDirection());
    }

    @Test
    public void should_move_to_position_00E_when_direct_is_R_with_init_position_00N(){
        //given
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "N");
        MarsRover marsRover = new MarsRover(marsRoverPosition);
        //when
        MarsRoverPosition resultPosition = marsRover.travel("R");
        //then
        assertEquals(0, resultPosition.getCoordinateX());
        assertEquals(0, resultPosition.getCoordinateY());
        assertEquals("E", resultPosition.getDirection());
    }

    @Test
    public void should_move_to_position_00W_when_direct_is_L_with_init_position_00N(){
        //given
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "N");
        MarsRover marsRover = new MarsRover(marsRoverPosition);
        //when
        MarsRoverPosition resultPosition = marsRover.travel("L");
        //then
        assertEquals(0, resultPosition.getCoordinateX());
        assertEquals(0, resultPosition.getCoordinateY());
        assertEquals("W", resultPosition.getDirection());
    }

    @Test
    public void should_move_to_position_10E_when_direct_is_M_with_init_position_00E(){
    }

    @Test
    public void should_move_to_position_00S_when_direct_is_R_with_init_position_00E(){
    }

    @Test
    public void should_move_to_position_00N_when_direct_is_L_with_init_position_00E(){
    }

    @Test
    public void should_move_to_position_0_1S_when_direct_is_M_with_init_position_00S(){
    }

    @Test
    public void should_move_to_position_00W_when_direct_is_R_with_init_position_00S(){
    }

    @Test
    public void should_move_to_position_00E_when_direct_is_L_with_init_position_00S(){
    }

    @Test
    public void should_move_to_position__10W_when_direct_is_M_with_init_position_00W(){
    }

    @Test
    public void should_move_to_position_00N_when_direct_is_R_with_init_position_00W(){
    }

    @Test
    public void should_move_to_position_00S_when_direct_is_L_with_init_position_00W(){
    }

    @Test
    public void should_move_to_position_00S_when_direct_is_MLR_with_init_position_00W(){
    }

}
