package com.company;

import java.util.List;


/**
 * Created by Engineer on 3/20/2017.
 */
public abstract class Question {

    private String questionStem;
    private int points;


    public String getQuestionStem() {

        return questionStem;
    }

    /*
    Question constructor has to be in the subclasses
     */
     Question(String questionStem,  int points){
        this.questionStem=questionStem;
        this.points=points;
    }

    public void setPoints(int desirednumofpoints){

        this.points=desirednumofpoints;
    }
    public int getPoints(){
        return this.points;
    }
    public abstract void compareAnswer();
    abstract List <String> getChoices();



}