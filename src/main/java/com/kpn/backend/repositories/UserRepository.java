package com.kpn.backend.repositories;

import com.kpn.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface UserRepository extends JpaRepository<User, Integer>{
    Optional<User> findByIdAndPassword(int id, String password);
}
