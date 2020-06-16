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
                String direction = "E";
                this.marsRoverPosition.setDirection(direction);
            }
            if ("L".equals(command)) {
                String direction = "W";
                this.marsRoverPosition.setDirection(direction);
            }
        }

        if ("E".equals(initDirection)){
            if ("M".equals(command)) {
                move(initDirection);
            }
            if ("R".equals(command)) {
                String direction = "S";
                this.marsRoverPosition.setDirection(direction);
            }
            if ("L".equals(command)) {
                String direction = "N";
                this.marsRoverPosition.setDirection(direction);
            }
        }

        if ("S".equals(initDirection)){
            if ("M".equals(command)) {
                move(initDirection);
            }
            if ("R".equals(command)) {
                String direction = "W";
                this.marsRoverPosition.setDirection(direction);
            }
            if ("L".equals(command)) {
                String direction = "E";
                this.marsRoverPosition.setDirection(direction);
            }
        }

        if ("W".equals(initDirection)){
            if ("M".equals(command)) {
                move(initDirection);
            }
            if ("R".equals(command)) {
                String direction = "N";
                this.marsRoverPosition.setDirection(direction);
            }
            if ("L".equals(command)) {
                String direction = "S";
                this.marsRoverPosition.setDirection(direction);
            }
        }
        return this.marsRoverPosition;
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
