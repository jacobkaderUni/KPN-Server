package com.kpn.backend.services;

import com.kpn.backend.model.Customer;
import com.kpn.backend.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public Customer getCustomerByNumber(String number){
        return customerRepository.findByNumber(number);
    }

    public Customer getCustomerByEmail(String email){
        return customerRepository.findByEmail(email);
    }

//    public Customer getCustomerByAccountId(String account_id){
//        return customerRepository.findByAccount_Id(account_id);
//    }
    public Customer updateCustomer(String number, Customer updatedCustomer){
        Customer customer = getCustomerByNumber(number);
        customer.setFirst_name(updatedCustomer.getFirst_name());
        customer.setLast_name(updatedCustomer.getLast_name());
        customer.setDob(updatedCustomer.getDob());
        customer.setEmail(updatedCustomer.getEmail());
        customer.setStreet(updatedCustomer.getStreet());
        customer.setCity(updatedCustomer.getCity());
        customer.setPostcode(updatedCustomer.getPostcode());
        customer.setCountry(updatedCustomer.getCountry());
        return customerRepository.save(customer);
    }
}
