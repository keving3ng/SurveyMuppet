package com.keving3ng.SurveyMuppet.model.survey;

import java.util.ArrayList;

public class Survey {

    private int id;
    private ArrayList<QType> surveyQuestions;

    public Survey(){
        this.id = 1;
        this.surveyQuestions = new ArrayList<>();
    }


    public ArrayList<QType> getSurveyQuestions() {
        return surveyQuestions;
    }

    public void setSurveyQuestions(ArrayList<QType> surveyQuestions) {
        this.surveyQuestions = surveyQuestions;
        this.renumberQuestions();
    }

    public void addQuestion(QType question){
        surveyQuestions.add(question);
        question.setNumber(surveyQuestions.size());
    }

    public void removeQuestion(int index) {
        surveyQuestions.remove(index);
        this.renumberQuestions();
    }

    public int getNumQuestions(){
        return this.surveyQuestions.size();
    }

    private void renumberQuestions(){
        for (int i = 0; i < surveyQuestions.size(); i++){
            surveyQuestions.get(i).setNumber(i + 1);
        }
    }
}
