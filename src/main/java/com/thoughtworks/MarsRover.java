package com.thoughtworks;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private MarsRoverPosition marsRoverPosition;

    public MarsRover(MarsRoverPosition marsRoverPosition) {
        this.marsRoverPosition = marsRoverPosition;
    }

    public MarsRoverPosition travel(String command) {
        String initDirection = this.marsRoverPosition.getDirection();
        int coordinateX = this.marsRoverPosition.getCoordinateX();
        int coordinateY = this.marsRoverPosition.getCoordinateY();

        List<String> commandList = Arrays.asList(command.split(","));
        for(String commandItem : commandList) {
            initDirection = this.marsRoverPosition.getDirection();
            if (Math.abs(coordinateX) < 5 && Math.abs(coordinateY) < 5) {
                if ("M".equals(commandItem)) {
                    move(initDirection);
                }
            } else if(Math.abs(coordinateX) >= 5 || Math.abs(coordinateY) >= 5){
                if ("M".equals(commandItem)) {
                    return this.marsRoverPosition;
                }
            }
            if ("R".equals(commandItem)) {
                turnRigth(initDirection);
            }
            if ("L".equals(commandItem)) {
                turnLeft(initDirection);
            }
        }
        return this.marsRoverPosition;
    }

    private void turnLeft(String initDirection) {
        if ("N".equals(initDirection)){
            String direction = "W";
            this.marsRoverPosition.setDirection(direction);
        }
        if ("E".equals(initDirection)){
            String direction = "N";
            this.marsRoverPosition.setDirection(direction);
        }
        if ("S".equals(initDirection)){
            String direction = "E";
            this.marsRoverPosition.setDirection(direction);
        }
        if ("W".equals(initDirection)){
            String direction = "S";
            this.marsRoverPosition.setDirection(direction);
        }
    }

    private void turnRigth(String initDirection) {
        if ("N".equals(initDirection)){
            String direction = "E";
            this.marsRoverPosition.setDirection(direction);
        }
        if ("E".equals(initDirection)){
            String direction = "S";
            this.marsRoverPosition.setDirection(direction);
        }
        if ("S".equals(initDirection)){
            String direction = "W";
            this.marsRoverPosition.setDirection(direction);
        }
        if ("W".equals(initDirection)){
            String direction = "N";
            this.marsRoverPosition.setDirection(direction);
        }
    }

    private void move(String initDirection) {
        if("N".equals(initDirection)){
            int coordinateY = this.marsRoverPosition.getCoordinateY();
            int newCoordinateY = coordinateY + 1;
            this.marsRoverPosition.setCoordinateY(newCoordinateY);
        }
        if("E".equals(initDirection)){
            int coordinateX = this.marsRoverPosition.getCoordinateX();
            int newCoordinateX = coordinateX + 1;
            this.marsRoverPosition.setCoordinateX(newCoordinateX);
        }
        if("S".equals(initDirection)){
            int coordinateY = this.marsRoverPosition.getCoordinateY();
            int newCoordinateY = coordinateY - 1;
            this.marsRoverPosition.setCoordinateY(newCoordinateY);
        }
        if("W".equals(initDirection)){
            int coordinateX = this.marsRoverPosition.getCoordinateX();
            int newCoordinateX = coordinateX - 1;
            this.marsRoverPosition.setCoordinateX(newCoordinateX);
        }
    }
}
