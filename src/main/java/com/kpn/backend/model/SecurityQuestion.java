package com.kpn.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "securityQuestions")
public class SecurityQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String questionId;

    @Column(name = "questionText")
    private String questionText;

    public SecurityQuestion() {

    }

    public SecurityQuestion(String questionId, String questionText){
        this.questionId = questionId;
        this.questionText = questionText;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setquestionText(String questionText) {
        this.questionText = questionText;
    }
}
