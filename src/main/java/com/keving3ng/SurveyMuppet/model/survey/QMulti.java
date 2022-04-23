package com.keving3ng.SurveyMuppet.model.survey;

import com.keving3ng.SurveyMuppet.model.InputTypes;

public class QMulti extends QType {

    public QMulti(String question) {
        super(question, InputTypes.CHECKBOX, 8);
    }
}
