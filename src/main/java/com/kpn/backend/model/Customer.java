package com.kpn.backend.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "customers")
public class Customer {

    //Private variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String number;
    @Column(name = "account_id")
    private String account_id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name="dob")
    private Date dob;
    @Column(name="email")
    private String email;
    @Column(name="street")
    private String street;
    @Column(name="city")
    private String city;
    @Column(name="postcode")
    private String postcode;
    @Column(name="country")
    private String country;

    public Customer() {

    }
    public Customer(String account_id, String first_name, String last_name, Date dob, String email, String street, String city, String postcode, String country) {
        this.account_id = account_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.dob = dob;
        this.email = email;
        this.street = street;
        this.city = city;
        this.postcode = postcode;
        this.country = country;
    }

    //getters and setters
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }



}
