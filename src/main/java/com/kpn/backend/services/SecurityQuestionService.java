//package com.kpn.backend.services;
//
//import com.kpn.backend.model.SecurityQuestion;
//import com.kpn.backend.repositories.SecurityQuestionRepository;
//import org.springframework.stereotype.Service;
//
//@Service
//public class SecurityQuestionService {
//
//    private final SecurityQuestionRepository securityQuestionRepository;
//
//    public SecurityQuestionService(SecurityQuestionRepository securityQuestionRepository){
//        this.securityQuestionRepository = securityQuestionRepository;
//    }
//
//    public SecurityQuestion getSecurityQuestion(String questionId) {
//        return securityQuestionRepository.findByQuestionId(questionId).orElseThrow(() -> new IllegalArgumentException("Invalid questionId"));
//    }
//}
