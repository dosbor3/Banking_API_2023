package com.sg.banking_api.models;

import java.math.BigDecimal;
import java.util.Objects;

public class Customer {
    private int customer_number;
    private String first_name;
    private String last_name;
    private Address address;
    private String phone;
    private String email_address;
    private boolean isActive;

    public Customer(int customer_number) {
        this.customer_number = customer_number;
    }

    public int getCustomer_number() {
        return customer_number;
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
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean active) {
        isActive = active;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail_address() {
        return email_address;
    }
    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "customer_number='" + customer_number + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", address=" + address +
                ", isActive=" + isActive +
                ", phone='" + phone + '\'' +
                ", email_address='" + email_address + '\'' +
                '}';
    }
}
