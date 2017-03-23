package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Engineer on 3/20/2017.
 */
public class MultipleChoices extends Question  {
    private String answers;
    private List<String> choices =new ArrayList<>();

    public List<String> getChoices() {
        return choices;
    }

    @Override
    public void compareAnswer() {
//        compare user input from quiz to expected answers in abstract question
    }

    protected MultipleChoices(String questionStem, String answers,
                              int points, List<String>choices){
        super(questionStem, points);
        this.answers=answers;
        this.choices=choices;

    }
}


