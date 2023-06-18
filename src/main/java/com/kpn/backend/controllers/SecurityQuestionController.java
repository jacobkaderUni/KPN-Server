//package com.kpn.backend.controllers;
//
//import com.kpn.backend.model.SecurityQuestion;
//import com.kpn.backend.services.SecurityQuestionService;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//@RequestMapping("/api/securityQuestions")
//public class SecurityQuestionController {
//
//    private final SecurityQuestionService securityQuestionService;
//
//    public SecurityQuestionController(SecurityQuestionService securityQuestionService){
//        this.securityQuestionService = securityQuestionService;
//    }
//
//    @GetMapping("/{questionId}")
//    public ResponseEntity<SecurityQuestion> getSecurityQuestion(@PathVariable String questionId) {
//        SecurityQuestion securityQuestion = securityQuestionService.getSecurityQuestion(questionId);
//        if (securityQuestion != null) {
//            return ResponseEntity.ok(securityQuestion);
//        } else {
//           return ResponseEntity.notFound().build();
//        }
//
//    }
//}
