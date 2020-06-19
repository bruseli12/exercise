package com.twschool.practice;

public class GuessAnswer {
    private  Answer answer;
    public GuessAnswer(Answer answer) {
        this.answer=answer;
    }

    public GuessStatus guess(String useranswer) {
        String result=answer.check(useranswer);
        if("4A0B".equals(result))
            return GuessStatus.SUCCEED;
        return GuessStatus.CONTINUED;
    }
}
