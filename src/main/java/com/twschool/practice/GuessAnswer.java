package com.twschool.practice;

public class GuessAnswer {
    private Answer answer;
    private final int MAX_INPUT_TIMES = 6;
    private int count = MAX_INPUT_TIMES;

    public GuessAnswer(Answer answer) {
        this.answer = answer;
    }

    public GuessStatus guess(String useranswer) {
        String result = answer.check(useranswer);
        decrease();
        if ("4A0B".equals(result)) {
            return GuessStatus.SUCCEED;
        }
        if (count == 0) {
            return GuessStatus.FIALED;
        } else {
            return GuessStatus.CONTINUED;
        }
    }

    public void decrease() {
        count--;
    }
}
