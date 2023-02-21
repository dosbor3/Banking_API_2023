package com.sg.banking_api.models;

import java.math.BigDecimal;

public class Savings {
    private String account_number;
    private String customer_number;
    private BigDecimal deposits;
    private BigDecimal withdrawls;
    private BigDecimal current_balance;
    private BigDecimal available_balance;
    private String account_type;

    public Savings(String account_number) {
        this.account_number = account_number;
    }

    public String getAccount_number() {
        return account_number;
    }

    public String getCustomer_number() {
        return customer_number;
    }

    public void setCustomer_number(String customer_number) {
        this.customer_number = customer_number;
    }

    public BigDecimal getDeposits() {
        return deposits;
    }

    public void setDeposits(BigDecimal deposits) {
        this.deposits = deposits;
    }

    public BigDecimal getWithdrawls() {
        return withdrawls;
    }

    public void setWithdrawls(BigDecimal withdrawls) {
        this.withdrawls = withdrawls;
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

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }
}
