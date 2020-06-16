package com.thoughtworks;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertEquals;

public class MarsRoverTest {
    @Test
    public void should_move_to_position_01N_when_direct_is_M_with_init_position_00N(){
        //given
        MarsRover marsRover = new MarsRover();
        //when
        Map position = new HashMap();
        position.put("coordinateX", "0");
        position.put("coordinateY", "0");
        position.put("direct", "N");
        String resultPosition = marsRover.move(position, "M");
        //then
        assertEquals("01N", resultPosition);
    }

    @Test
    public void should_move_to_position_00E_when_direct_is_R_with_init_position_00N(){
    }

    @Test
    public void should_move_to_position_00W_when_direct_is_L_with_init_position_00N(){
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
