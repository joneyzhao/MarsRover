package com.thoughtworks;

public class MarsRover {
    private MarsRoverPosition marsRoverPosition;

    public MarsRover(MarsRoverPosition marsRoverPosition) {
        this.marsRoverPosition = marsRoverPosition;
    }

    public MarsRoverPosition travel(String command) {
        String initDirection = this.marsRoverPosition.getDirection();
        if ("N".equals(initDirection)){
            if ("M".equals(command)) {
                move(initDirection);
            }
            if ("R".equals(command)) {
                turnRigth(initDirection);
            }
            if ("L".equals(command)) {
                turnLeft(initDirection);
            }
        }

        if ("E".equals(initDirection)){
            if ("M".equals(command)) {
                move(initDirection);
            }
            if ("R".equals(command)) {
                turnRigth(initDirection);
            }
            if ("L".equals(command)) {
                turnLeft(initDirection);
            }
        }

        if ("S".equals(initDirection)){
            if ("M".equals(command)) {
                move(initDirection);
            }
            if ("R".equals(command)) {
                turnRigth(initDirection);
            }
            if ("L".equals(command)) {
                turnLeft(initDirection);
            }
        }

        if ("W".equals(initDirection)){
            if ("M".equals(command)) {
                move(initDirection);
            }
            if ("R".equals(command)) {
                turnRigth(initDirection);
            }
            if ("L".equals(command)) {
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
