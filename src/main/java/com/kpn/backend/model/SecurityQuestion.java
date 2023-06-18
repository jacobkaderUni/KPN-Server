//package com.kpn.backend.model;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "Security Question")
//public class SecurityQuestion {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private String question_id;
//
//    @Column(name = "question_text")
//    private String question_text;
//
//    public SecurityQuestion() {
//
//    }
//
//    public SecurityQuestion(String question_id, String question_text){
//        this.question_id = question_id;
//        this.question_text = question_text;
//    }
//
//    public String getQuestion_id() {
//        return question_id;
//    }
//
//    public void setQuestion_id(String question_id) {
//        this.question_id = question_id;
//    }
//
//    public String getQuestion_text() {
//        return question_text;
//    }
//
//    public void setQuestion_text(String question_text) {
//        this.question_text = question_text;
//    }
//}
