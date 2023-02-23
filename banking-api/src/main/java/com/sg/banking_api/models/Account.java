package com.sg.banking_api.models;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {
    private int account_number;
    private int customer_number;
    private BigDecimal current_balance;
    private BigDecimal available_balance;
    private int account_type;
    private boolean isActive;


    public Account(){
        this.isActive = true;
    }


    public void setAccount_number(int account_number) { this.account_number = account_number; }
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return account_number == account.account_number && customer_number == account.customer_number && account_type == account.account_type && isActive == account.isActive && Objects.equals(current_balance, account.current_balance) && Objects.equals(available_balance, account.available_balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account_number, customer_number, current_balance, available_balance, account_type, isActive);
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
