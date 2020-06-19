package com.twschool.practice;

public enum Direction {
    E {
        @Override
        public Enum turnleft() {
            return N;
        }

        @Override
        public Enum turnRight() {
            return S;
        }
    },S {
        @Override
        public Enum turnleft() {
            return W;
        }

        @Override
        public Enum turnRight() {
            return null;
        }
    },W {
        @Override
        public Enum turnleft() {
            return N;
        }

        @Override
        public Enum turnRight() {
            return null;
        }
    },N {
        @Override
        public Enum turnleft() {
            return E;
        }

        @Override
        public Enum turnRight() {
            return null;
        }
    };
   public abstract Enum turnleft();
   public  abstract Enum turnRight();
}
