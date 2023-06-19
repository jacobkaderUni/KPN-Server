package com.kpn.backend.repositories;

import com.kpn.backend.model.SecurityQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SecurityQuestionRepository extends JpaRepository<SecurityQuestion, String> {
    SecurityQuestion findByQuestionId(String questionId);
}
