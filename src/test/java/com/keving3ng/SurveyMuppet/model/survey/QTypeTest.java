package com.keving3ng.SurveyMuppet.model.survey;

import com.keving3ng.SurveyMuppet.model.InputTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class QTypeTest {

    Survey s;
    QText text;
    QSingle single;
    QMulti multi;

    @BeforeEach
    void setUp() {
        s = new Survey();
        text = new QText("Text Test");
        single = new QSingle("Single Test");
        multi = new QMulti("Multi Test");
        s.addQuestion(text);
        s.addQuestion(single);
        s.addQuestion(multi);
    }

    @Test
    void getNumber() {
        assertEquals(1, text.getNumber());
        assertEquals(2, single.getNumber());
        assertEquals(3, multi.getNumber());
    }

    @Test
    void setNumber() {
        int num = 400;
        text.setNumber(num);
        assertEquals(num, text.getNumber());
    }

    @Test
    void getQuestion() {
        assertEquals("Text Test", text.getQuestion());
    }

    @Test
    void setQuestion() {
        String newText = "Text Modified";
        text.setQuestion(newText);
        assertEquals(newText, text.getQuestion());
    }

    @Test
    void getInputType() {
        assertEquals(InputTypes.TEXT, text.getInputType());
        assertEquals(InputTypes.RADIO, single.getInputType());
        assertEquals(InputTypes.CHECKBOX, multi.getInputType());
    }

    @Test
    void setInputType() {
        text.setInputType(InputTypes.CHECKBOX);
        assertEquals(InputTypes.CHECKBOX, text.getInputType());
    }

    @Test
    void getMaxInputs() {
        assertEquals(1, text.getMaxInputs());
        assertEquals(4, single.getMaxInputs());
        assertEquals(8, multi.getMaxInputs());
    }

    @Test
    void setMaxInputs() {
        int val = 14;
        text.setMaxInputs(val);
        assertEquals(val, text.getMaxInputs());
    }
}