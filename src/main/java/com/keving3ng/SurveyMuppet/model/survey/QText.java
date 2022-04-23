package com.keving3ng.SurveyMuppet.model.survey;

import com.keving3ng.SurveyMuppet.model.InputTypes;

public class QText extends QType {

    public QText(String question){
        super(question, InputTypes.TEXT, 1);
    }

}
