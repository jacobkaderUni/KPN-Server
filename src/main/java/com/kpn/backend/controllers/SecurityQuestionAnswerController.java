//package com.kpn.backend.controllers;
//
//import com.kpn.backend.model.SecurityQuestionAnswer;
//import com.kpn.backend.services.SecurityQuestionAnswerService;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/securityQuestionAnswer")
//public class SecurityQuestionAnswerController {
//
//    private final SecurityQuestionAnswerService securityQuestionAnswerService;
//
//    public SecurityQuestionAnswerController(SecurityQuestionAnswerService securityQuestionAnswerService){
//        this.securityQuestionAnswerService = securityQuestionAnswerService;
//    }
//
//    @GetMapping("/customer/{customerNumber}/securityQuestion/{questionId}")
//    public ResponseEntity<SecurityQuestionAnswer> getSecurityQuestionAnswer(@PathVariable String customerNumber, @PathVariable String questionId){
//        SecurityQuestionAnswer securityQuestionAnswer = securityQuestionAnswerService.getSecurityQuestionAnswer(customerNumber, questionId);
//
//        if (securityQuestionAnswer != null) {
//            return ResponseEntity.ok(securityQuestionAnswer);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//}
//
