package com.kpn.backend.repositories;

import com.kpn.backend.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CustomerRepository extends JpaRepository<Customer, String>{
    //Find by number, email, account id
    Customer findByNumber(String number);
    Customer findByEmail(String email);
//    Customer findByAccount_Id(String account_id);
    //Save customer
    Customer save(Customer customer);

}
