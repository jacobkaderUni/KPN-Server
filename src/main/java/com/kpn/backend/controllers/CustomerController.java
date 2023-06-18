package com.kpn.backend.controllers;

import com.kpn.backend.model.Customer;
import com.kpn.backend.services.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping("/number/{number}")
    public ResponseEntity<Customer> getCustomerByNumber(@PathVariable String number) {
        Customer customer = customerService.getCustomerByNumber(number);

        if (customer != null){
            return ResponseEntity.ok(customer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<Customer> getCustomerByEmail(@PathVariable String email){
        Customer customer = customerService.getCustomerByEmail(email);

        if (customer != null) {
            return ResponseEntity.ok(customer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

//    @GetMapping("/account/{account_id}")
//    public ResponseEntity<Customer> getCustomerByAccountId(@PathVariable String account_id){
//        Customer customer = customerService.getCustomerByAccountId(account_id);
//
//        if (customer != null) {
//            return ResponseEntity.ok(customer);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }

    @PutMapping("/{number}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable String number, @RequestBody  Customer updatedCustomer){
        Customer customer = customerService.updateCustomer(number, updatedCustomer);

        if (customer != null) {
            return ResponseEntity.ok(customer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
