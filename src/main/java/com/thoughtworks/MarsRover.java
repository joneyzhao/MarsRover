package com.thoughtworks;

public class MarsRover {
    private MarsRoverPosition marsRoverPosition;

    public MarsRover(MarsRoverPosition marsRoverPosition) {
        this.marsRoverPosition = marsRoverPosition;
    }

    public MarsRoverPosition travel(String command) {
        if ("M".equals(command)) {
            int coordinateY = this.marsRoverPosition.getCoordinateY();
            int newCoordinateY = coordinateY + 1;
            this.marsRoverPosition.setCoordinateY(newCoordinateY);
        }
        if ("R".equals(command)) {
            String direction = "E";
            this.marsRoverPosition.setDirection(direction);
        }
        if ("L".equals(command)) {
            String direction = "W";
            this.marsRoverPosition.setDirection(direction);
        }
        return this.marsRoverPosition;
    }
}
