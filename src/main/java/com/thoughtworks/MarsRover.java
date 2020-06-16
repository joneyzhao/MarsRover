package com.thoughtworks;

import java.util.Map;

public class MarsRover {

    public String move(Map position, String m) {
        String result = "";
        if ("N".equals(position.get("direct"))) {
            String coordinateY = (String) position.get("coordinateY");
            int newCoordinateY = Integer.valueOf(coordinateY) + 1;
            position.put("coordinateY",String.valueOf(newCoordinateY));
            result = (String) position.get("coordinateX") + position.get("coordinateY") + position.get("direct");
        }
        return result;
    }
}
