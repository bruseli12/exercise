package com.twschool.practice;

public class MarsRover {
    private MarsPosition initPosition;

    public MarsRover(MarsPosition initPosition) {
        this.initPosition = initPosition;
    }

    public MarsPosition getMarsPosition() {
        return initPosition;
    }

    public void setMarsPosition(MarsPosition marsPosition) {
        this.initPosition = marsPosition;
    }

    public MarsPosition receive(String path) {
        int length = path.length();
        for (int i = 0; i < length; i++) {

            if ("N".equals(initPosition.getDirection())&&'M'==path.charAt(i)) {
                initPosition.setY(initPosition.getY() + 1);
                continue;
            }
            if ("N".equals(initPosition.getDirection()) && 'L'==path.charAt(i)) {
                initPosition.setDirection("W");
                continue;
            }
            if ("N".equals(initPosition.getDirection()) && 'R'==path.charAt(i)) {
                initPosition.setDirection("E");
                continue;
            }
            if ("E".equals(initPosition.getDirection()) && 'M'==path.charAt(i)) {
                initPosition.setX(initPosition.getX() + 1);
                continue;
            }
            if ("E".equals(initPosition.getDirection()) && 'L'==path.charAt(i)) {
                initPosition.setDirection("N");
                continue;
            }
            if ("E".equals(initPosition.getDirection()) && 'R'==path.charAt(i)) {
                initPosition.setDirection("S");
                continue;
            }
            if ("S".equals(initPosition.getDirection()) && 'M'==path.charAt(i)) {
                initPosition.setY(initPosition.getY() - 1);
                continue;
            }
            if ("S".equals(initPosition.getDirection()) && 'L'==path.charAt(i)) {
                initPosition.setDirection("E");
                continue;
            }
            if ("W".equals(initPosition.getDirection()) && 'R'==path.charAt(i)) {
                initPosition.setDirection("W");
                continue;
            }
            if ("S".equals(initPosition.getDirection()) && 'M'==path.charAt(i)) {
                initPosition.setX(initPosition.getX() - 1);
                continue;
            }
            if ("W".equals(initPosition.getDirection()) && 'L'==path.charAt(i)) {
                initPosition.setDirection("S");
                continue;
            }
            if ("W".equals(initPosition.getDirection()) && 'R'==path.charAt(i)) {
                initPosition.setDirection("N");
                continue;
            }

        }

        return initPosition;

    }
}
