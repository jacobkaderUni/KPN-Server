//package com.kpn.backend.services;
//
//import com.kpn.backend.model.SecurityQuestionAnswer;
//import com.kpn.backend.repositories.SecurityQuestionAnswerRepository;
//import org.springframework.stereotype.Service;
//
//@Service
//public class SecurityQuestionAnswerService {
//
//    private final SecurityQuestionAnswerRepository securityQuestionAnswerRepository;
//
//    public SecurityQuestionAnswerService(SecurityQuestionAnswerRepository securityQuestionAnswerRepository){
//        this.securityQuestionAnswerRepository = securityQuestionAnswerRepository;
//    }
//
//    public SecurityQuestionAnswer getSecurityQuestionAnswer(String customer_number, String questionId) {
//        return securityQuestionAnswerRepository.findByCustomerNumberAndQuestionId(customer_number, questionId).orElseThrow(() -> new IllegalArgumentException("Invalid customerNumber or questionId"));
//    }
//}
