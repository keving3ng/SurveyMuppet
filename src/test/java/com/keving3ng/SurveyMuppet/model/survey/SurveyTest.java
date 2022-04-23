package com.keving3ng.SurveyMuppet.model.survey;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SurveyTest {

    Survey s;
    ArrayList<QType> q;
    QText text;
    QSingle single;
    QMulti multi;

    @BeforeEach
    void setUp() {
        s = new Survey();
        q = new ArrayList<>();
        text = new QText("Text Test");
        single = new QSingle("Single Test");
        multi = new QMulti("Multi Test");
        q.add(text);
        q.add(single);
        q.add(multi);
    }

    @Test
    void getSetSurveyQuestions() {
        s.setSurveyQuestions(q);
        ArrayList res = s.getSurveyQuestions();
        assertEquals(q, res);
    }

    @Test
    void addQuestion() {
        QText text2 = new QText("Text2 Test");
        s.addQuestion(text2);
        assertTrue(s.getSurveyQuestions().contains(text2));
    }

    @Test
    void removeQuestion() {
        s.setSurveyQuestions(q);
        s.removeQuestion(0);

        // Check question is properly removed
        assertFalse(s.getSurveyQuestions().contains(text));
        assertEquals(2, s.getNumQuestions());

        // Check that questions are properly renumbered
        assertEquals(1, s.getSurveyQuestions().get(0).getNumber());
        assertEquals(2, s.getSurveyQuestions().get(1).getNumber());
    }

    @Test
    void getNumQuestions(){
        s.setSurveyQuestions(q);
        assertEquals(3, s.getNumQuestions());
    }
}