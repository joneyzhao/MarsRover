package com.thoughtworks;

import org.junit.Test;

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
        //given
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "E");
        MarsRover marsRover = new MarsRover(marsRoverPosition);
        //when
        MarsRoverPosition resultPosition = marsRover.travel("M");
        //then
        assertEquals(1, resultPosition.getCoordinateX());
        assertEquals(0, resultPosition.getCoordinateY());
        assertEquals("E", resultPosition.getDirection());
    }

    @Test
    public void should_move_to_position_00S_when_direct_is_R_with_init_position_00E(){
        //given
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "E");
        MarsRover marsRover = new MarsRover(marsRoverPosition);
        //when
        MarsRoverPosition resultPosition = marsRover.travel("R");
        //then
        assertEquals(0, resultPosition.getCoordinateX());
        assertEquals(0, resultPosition.getCoordinateY());
        assertEquals("S", resultPosition.getDirection());
    }

    @Test
    public void should_move_to_position_00N_when_direct_is_L_with_init_position_00E(){
        //given
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "E");
        MarsRover marsRover = new MarsRover(marsRoverPosition);
        //when
        MarsRoverPosition resultPosition = marsRover.travel("L");
        //then
        assertEquals(0, resultPosition.getCoordinateX());
        assertEquals(0, resultPosition.getCoordinateY());
        assertEquals("N", resultPosition.getDirection());
    }

    @Test
    public void should_move_to_position_0_1S_when_direct_is_M_with_init_position_00S(){
        //given
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "S");
        MarsRover marsRover = new MarsRover(marsRoverPosition);
        //when
        MarsRoverPosition resultPosition = marsRover.travel("M");
        //then
        assertEquals(0, resultPosition.getCoordinateX());
        assertEquals(-1, resultPosition.getCoordinateY());
        assertEquals("S", resultPosition.getDirection());
    }

    @Test
    public void should_move_to_position_00W_when_direct_is_R_with_init_position_00S(){
        //given
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "S");
        MarsRover marsRover = new MarsRover(marsRoverPosition);
        //when
        MarsRoverPosition resultPosition = marsRover.travel("R");
        //then
        assertEquals(0, resultPosition.getCoordinateX());
        assertEquals(0, resultPosition.getCoordinateY());
        assertEquals("W", resultPosition.getDirection());
    }

    @Test
    public void should_move_to_position_00E_when_direct_is_L_with_init_position_00S(){
        //given
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "S");
        MarsRover marsRover = new MarsRover(marsRoverPosition);
        //when
        MarsRoverPosition resultPosition = marsRover.travel("L");
        //then
        assertEquals(0, resultPosition.getCoordinateX());
        assertEquals(0, resultPosition.getCoordinateY());
        assertEquals("E", resultPosition.getDirection());
    }

    @Test
    public void should_move_to_position__10W_when_direct_is_M_with_init_position_00W(){
        //given
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "W");
        MarsRover marsRover = new MarsRover(marsRoverPosition);
        //when
        MarsRoverPosition resultPosition = marsRover.travel("M");
        //then
        assertEquals(-1, resultPosition.getCoordinateX());
        assertEquals(0, resultPosition.getCoordinateY());
        assertEquals("W", resultPosition.getDirection());
    }

    @Test
    public void should_move_to_position_00N_when_direct_is_R_with_init_position_00W(){
        //given
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "W");
        MarsRover marsRover = new MarsRover(marsRoverPosition);
        //when
        MarsRoverPosition resultPosition = marsRover.travel("R");
        //then
        assertEquals(0, resultPosition.getCoordinateX());
        assertEquals(0, resultPosition.getCoordinateY());
        assertEquals("N", resultPosition.getDirection());
    }

    @Test
    public void should_move_to_position_00S_when_direct_is_L_with_init_position_00W(){
        //given
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "W");
        MarsRover marsRover = new MarsRover(marsRoverPosition);
        //when
        MarsRoverPosition resultPosition = marsRover.travel("L");
        //then
        assertEquals(0, resultPosition.getCoordinateX());
        assertEquals(0, resultPosition.getCoordinateY());
        assertEquals("S", resultPosition.getDirection());
    }

    @Test
    public void should_move_to_position__10E_when_direct_is_MLL_with_init_position_00W(){
        //given
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "W");
        MarsRover marsRover = new MarsRover(marsRoverPosition);
        //when
        MarsRoverPosition resultPosition3 = marsRover.travel("M,L,L");
        //then
        assertEquals(-1, resultPosition3.getCoordinateX());
        assertEquals(0, resultPosition3.getCoordinateY());
        assertEquals("E", resultPosition3.getDirection());
    }

    @Test
    public void should_move_to_position_50S_when_direct_is_RMLLL_with_init_position_40N(){
        //given
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(4, 0, "N");
        MarsRover marsRover = new MarsRover(marsRoverPosition);
        //when
        MarsRoverPosition resultPosition3 = marsRover.travel("R,M,L,L,L");
        //then
        assertEquals(5, resultPosition3.getCoordinateX());
        assertEquals(0, resultPosition3.getCoordinateY());
        assertEquals("S", resultPosition3.getDirection());
    }

    @Test
    public void should_move_to_position_50E_when_direct_is_RMLLL_with_init_position_50N(){
        //given
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(5, 0, "N");
        MarsRover marsRover = new MarsRover(marsRoverPosition);
        //when
        MarsRoverPosition resultPosition = marsRover.travel("R,M,L,L");
        //then
        assertEquals(5, resultPosition.getCoordinateX());
        assertEquals(0, resultPosition.getCoordinateY());
        assertEquals("E", resultPosition.getDirection());
    }

    @Test
    public void should_move_to_position_50E_when_direct_is_RMLLL_with_init_position__50N(){
//        //given
//        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(-5, 0, "N");
//        MarsRover marsRover = new MarsRover(marsRoverPosition);
//        //when
//        MarsRoverPosition resultPosition = marsRover.travel("R,M,L,L");
//        //then
//        assertEquals(-5, resultPosition.getCoordinateX());
//        assertEquals(0, resultPosition.getCoordinateY());
//        assertEquals("E", resultPosition.getDirection());
    }
}
