//package com.kpn.backend.model;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "Security Question Answer")
//public class SecurityQuestionAnswer {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int answer_id;
//
//    @Column(name = "answer")
//    private String answer;
//
//    @Column(name = "question_id")
//    private String question_id;
//
//    @Column(name = "customer_number")
//    private String customer_number;
//
//    public SecurityQuestionAnswer() {
//
//    }
//
//    public SecurityQuestionAnswer(String answer, String question_id, String customer_number){
//        this.answer = answer;
//        this.question_id = question_id;
//        this.customer_number = customer_number;
//    }
//
//    public int getAnswer_id() {
//        return answer_id;
//    }
//
//    public void setAnswer_id(int answer_id) {
//        this.answer_id = answer_id;
//    }
//
//    public String getAnswer() {
//        return answer;
//    }
//
//    public void setAnswer(String answer) {
//        this.answer = answer;
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
//    public String getCustomer_number() {
//        return customer_number;
//    }
//
//    public void setCustomer_number(String customer_number) {
//        this.customer_number = customer_number;
//    }
//}
