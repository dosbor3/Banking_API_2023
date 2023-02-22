package com.sg.banking_api.models;

import java.math.BigDecimal;

public class Account {
    private int account_number;
    private int customer_number;
    private BigDecimal current_balance;
    private BigDecimal available_balance;
    private int account_type;
    private boolean isActive;

    public Account(int account_number){
        this.account_number = account_number;
    }

    public int getAccount_number() {
        return account_number;
    }

    public int getCustomer_number() {
        return customer_number;
    }

    public void setCustomer_number(int customer_number) {
        this.customer_number = customer_number;
    }
    public BigDecimal getCurrent_balance() {
        return current_balance;
    }

    public void setCurrent_balance(BigDecimal current_balance) {
        this.current_balance = current_balance;
    }

    public BigDecimal getAvailable_balance() {
        return available_balance;
    }

    public void setAvailable_balance(BigDecimal available_balance) {
        this.available_balance = available_balance;
    }

    public int getAccount_type() {
        return account_type;
    }

    public void setAccount_type(int account_type) {
        this.account_type = account_type;
    }
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account_number='" + account_number + '\'' +
                ", customer_number='" + customer_number + '\'' +
                ", current_balance=" + current_balance +
                ", available_balance=" + available_balance +
                ", account_type='" + account_type + '\'' +
                '}';
    }
}
