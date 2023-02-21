package com.sg.banking_api.models;

import java.math.BigDecimal;

public class Alert {
    private String alert_id;
    private String customer_number;
    private String account_number;
    private BigDecimal when_balance;
    private BigDecimal account_balance;
    private String email_address;

    public Alert(String alert_id){
        this.alert_id = alert_id;
    }

    public String getAlert_id() {
        return alert_id;
    }
    public String getCustomer_number() {
        return customer_number;
    }

    public void setCustomer_number(String customer_number) {
        this.customer_number = customer_number;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public BigDecimal getWhen_balance() {
        return when_balance;
    }

    public void setWhen_balance(BigDecimal when_balance) {
        this.when_balance = when_balance;
    }

    public BigDecimal getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(BigDecimal account_balance) {
        this.account_balance = account_balance;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }
}
