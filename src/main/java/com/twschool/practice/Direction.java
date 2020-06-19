package com.twschool.practice;

public enum Direction {
    E {
        @Override
        public Direction turnleft() {
            return N;
        }

        @Override
        public Direction turnRight() {
            return S;
        }
    },S {
        @Override
        public Direction turnleft() {
            return E;
        }

        @Override
        public Direction turnRight() {
            return W;
        }
    },W {
        @Override
        public Direction turnleft() {
            return S;
        }

        @Override
        public Direction turnRight() {
            return N;
        }
    },N {
        @Override
        public Direction turnleft() {
            return W;
        }

        @Override
        public Direction turnRight() {
            return E;
        }
    };
   public abstract Direction turnleft();
   public  abstract Direction turnRight();
}
