package com.klef.jfsd.beans;

import java.util.Map;

public class QuestionCI {
    private int qid;
    private String qname;
    private Map<Integer, String> answers;

    public QuestionCI(int qid, String qname, Map<Integer, String> answers) {
        this.qid = qid;
        this.qname = qname;
        this.answers = answers;
    }

    public void display() {
        System.out.println("Question ID: " + qid);
        System.out.println("Question Name: " + qname);
        System.out.println("Answers: ");
        for (Map.Entry<Integer, String> entry : answers.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}