package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Engineer on 3/22/2017.
 */
public class Checkbox  extends Question {
    private List<String> answers = new ArrayList<String>();
    private List<String> choices = new ArrayList<>();

    public List<String> getChoices() {
        return choices;
    }

    @Override
    public void compareAnswer() {
//        compare user input from quiz to expected answers in abstract question
    }

    protected Checkbox(String questionStem, List<String> answers,
                       int points, List<String> choices) {
        super(questionStem, points);
        this.answers = answers;
        this.choices = choices;

    }
}
