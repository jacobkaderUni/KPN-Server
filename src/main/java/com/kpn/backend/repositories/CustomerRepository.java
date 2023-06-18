package com.kpn.backend.repositories;

import com.kpn.backend.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
