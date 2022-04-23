package com.keving3ng.SurveyMuppet.model.survey;

import com.keving3ng.SurveyMuppet.model.InputTypes;

public abstract class QType {

    private int number;
    private String question;
    private InputTypes inputType;
    private int maxInputs;

    public QType(){}

    public QType(String question, InputTypes inputType, int maxInputs){
        this.question = question;
        this.inputType = inputType;
        this.maxInputs = maxInputs;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public InputTypes getInputType() {
        return inputType;
    }

    public void setInputType(InputTypes inputType) {
        this.inputType = inputType;
    }

    public int getMaxInputs() {
        return maxInputs;
    }

    public void setMaxInputs(int maxInputs) {
        this.maxInputs = maxInputs;
    }

    @Override
    public String toString(){
        return Integer.toString(this.number) + " - " + this.question;
    }
}
