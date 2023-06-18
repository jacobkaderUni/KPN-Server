package com.kpn.backend.repositories;

import com.kpn.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
    User findByIdandPassword(int id, String password);
}
