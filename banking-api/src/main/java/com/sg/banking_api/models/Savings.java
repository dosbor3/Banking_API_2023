package com.sg.banking_api.models;

import java.math.BigDecimal;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Savings savings = (Savings) o;
        return Objects.equals(account_number, savings.account_number) && Objects.equals(customer_number, savings.customer_number) && Objects.equals(deposits, savings.deposits) && Objects.equals(withdrawls, savings.withdrawls) && Objects.equals(current_balance, savings.current_balance) && Objects.equals(available_balance, savings.available_balance) && Objects.equals(account_type, savings.account_type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account_number, customer_number, deposits, withdrawls, current_balance, available_balance, account_type);
    }

    @Override
    public String toString() {
        return "Savings{" +
                "account_number='" + account_number + '\'' +
                ", customer_number='" + customer_number + '\'' +
                ", deposits=" + deposits +
                ", withdrawls=" + withdrawls +
                ", current_balance=" + current_balance +
                ", available_balance=" + available_balance +
                ", account_type='" + account_type + '\'' +
                '}';
    }
}
