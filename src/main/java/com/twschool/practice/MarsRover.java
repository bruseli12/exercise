package com.twschool.practice;

public class MarsRover {
    private MarsPosition initPosition;
    private final char L = 'L';
    private final char R = 'R';
    private final char M = 'M';


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
            /*
            if ("N".equals(getDirection())&&'M'==path.charAt(i)) {
                initPosition.setY(initPosition.getY() + 1);
                continue;
            }
            if ("N".equals(getDirection()) && 'L'==path.charAt(i)) {
                initPosition.setDirection("W");
                continue;
            }
            if ("N".equals(getDirection()) && 'R'==path.charAt(i)) {
                initPosition.setDirection("E");
                continue;
            }
            if ("E".equals(getDirection()) && 'M'==path.charAt(i)) {
                initPosition.setX(initPosition.getX() + 1);
                continue;
            }
            if ("E".equals(getDirection()) && 'L'==path.charAt(i)) {
                initPosition.setDirection("N");
                continue;
            }
            if ("E".equals(getDirection()) && 'R'==path.charAt(i)) {
                initPosition.setDirection("S");
                continue;
            }
            if ("S".equals(getDirection()) && 'M'==path.charAt(i)) {
                initPosition.setY(initPosition.getY() - 1);
                continue;
            }
            if ("S".equals(getDirection()) && 'L'==path.charAt(i)) {
                initPosition.setDirection("E");
                continue;
            }
            if ("W".equals(getDirection()) && 'R'==path.charAt(i)) {
                initPosition.setDirection("W");
                continue;
            }
            if ("S".equals(getDirection()) && 'M'==path.charAt(i)) {
                initPosition.setX(initPosition.getX() - 1);
                continue;
            }
            if ("W".equals(getDirection()) && 'L'==path.charAt(i)) {
                initPosition.setDirection("S");
                continue;
            }
            if ("W".equals(getDirection()) && 'R'==path.charAt(i)) {
                initPosition.setDirection("N");
                continue;
            }*/
            if (L == path.charAt(i))
                turnLeft();
            if (R == path.charAt(i))
                turnRight();
            if (M == path.charAt(i))
                move();
        }

        return initPosition;

    }

    private void move() {

        if (Direction.E.equals(getDirection()))
            initPosition.setX(initPosition.getX() + 1);
        if (Direction.S.equals(getDirection()))
            initPosition.setY(initPosition.getY() - 1);
        if (Direction.W.equals(getDirection()))
            initPosition.setX(initPosition.getX() - 1);
        if (Direction.N.equals(getDirection()))
            initPosition.setY(initPosition.getY() + 1);

    }

    private void turnLeft() {
        /*if (Direction.E.equals(getDirection()))
            initPosition.setDirection(Direction.E.turnleft());
        if (Direction.S.equals(getDirection()))
            initPosition.setDirection(Direction.S.turnleft());
        if (Direction.W.equals(getDirection()))
            initPosition.setDirection(Direction.W.turnleft());
        if (Direction.N.equals(getDirection()))
            initPosition.setDirection(Direction.N.turnleft());
*/
        initPosition.setDirection(getDirection().turnleft());
        System.out.println(getDirection().turnleft());
    }

    private void turnRight() {
       /* if (Direction.E.equals(getDirection()))
            initPosition.setDirection(Direction.E.turnRight());
        if (Direction.S.equals(getDirection()))
            initPosition.setDirection(Direction.S.turnRight());
        if (Direction.W.equals(getDirection()))
            initPosition.setDirection(Direction.W.turnRight());
        if (Direction.N.equals(getDirection()))
            initPosition.setDirection(Direction.N.turnRight());

        */
        initPosition.setDirection(getDirection().turnRight());
    }

    private Direction getDirection() {
        return initPosition.getDirection();
    }
}
