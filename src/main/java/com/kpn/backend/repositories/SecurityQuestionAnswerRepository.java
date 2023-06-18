//package com.kpn.backend.repositories;
//
//import com.kpn.backend.model.SecurityQuestionAnswer;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import java.util.Optional;
//
//public interface SecurityQuestionAnswerRepository extends JpaRepository<SecurityQuestionAnswer, Integer> {
//    Optional<SecurityQuestionAnswer> findByCustomerNumberAndQuestionId(String customer_number, String questionId);
//}
//
