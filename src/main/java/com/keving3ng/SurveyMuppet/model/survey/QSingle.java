package com.keving3ng.SurveyMuppet.model.survey;

import com.keving3ng.SurveyMuppet.model.InputTypes;

public class QSingle extends QType {

    public QSingle(String question){
        super(question, InputTypes.RADIO, 4);
    }
}
