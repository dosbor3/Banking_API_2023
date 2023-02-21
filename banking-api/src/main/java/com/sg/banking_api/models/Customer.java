package com.sg.banking_api.models;

import java.math.BigDecimal;

public class Customer {
    private String customer_number;
    private String first_name;
    private String last_name;
    private BigDecimal checking_acct_bal;
    private BigDecimal savings_acct_bal;
    private BigDecimal total_acct_bal;
    private Customer_Address address;
    private boolean isActive;
    private String phone;
    private String email_address;

    public String getCustomer_number() {
        return customer_number;
    }

    public void setCustomer_number(String customer_number) {
        this.customer_number = customer_number;
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

    public BigDecimal getChecking_acct_bal() {
        return checking_acct_bal;
    }

    public void setChecking_acct_bal(BigDecimal checking_acct_bal) {
        this.checking_acct_bal = checking_acct_bal;
    }

    public BigDecimal getSavings_acct_bal() {
        return savings_acct_bal;
    }

    public void setSavings_acct_bal(BigDecimal savings_acct_bal) {
        this.savings_acct_bal = savings_acct_bal;
    }

    public BigDecimal getTotal_acct_bal() {
        return total_acct_bal;
    }

    public void setTotal_acct_bal(BigDecimal total_acct_bal) {
        this.total_acct_bal = total_acct_bal;
    }

    public Customer_Address getAddress() {
        return address;
    }

    public void setAddress(Customer_Address address) {
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
}
