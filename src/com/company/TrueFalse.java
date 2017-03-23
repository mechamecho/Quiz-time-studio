package com.company;


import java.util.Arrays;
import java.util.List;

/**
 * Created by Engineer on 3/22/2017.
 */
public class TrueFalse extends Question {
    private String answers;
    private List<String> choices = Arrays.asList("True", "False");


    @Override
    public void compareAnswer() {
//        compare user input from quiz to expected answers in abstract question
    }

    @Override
    List<String> getChoices() {
        return this.choices;
    }

    public List<String> choices(){
        return this.choices;
    }

    protected TrueFalse(String questionStem, String answers,
                        int points, List<String> choices) {
        super(questionStem, points);
        this.answers = answers;
        this.choices = choices;

    }
}
