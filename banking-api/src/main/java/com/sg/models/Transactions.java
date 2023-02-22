package com.sg.banking_api.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Transactions {
    private int trans_id;
    private int account_number;
    private int customer_number;
    private LocalDateTime trans_date;
    private BigDecimal deposit_amount;
    private BigDecimal withdrawl_amount;
    private BigDecimal total;
    private boolean pending_flag;

    public Transactions(int trans_id) {
        this.trans_id = trans_id;
    }

    public int getTrans_id() {
        return trans_id;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public int getCustomer_number() {
        return customer_number;
    }

    public void setCustomer_number(int customer_number) {
        this.customer_number = customer_number;
    }

    public LocalDateTime getTrans_date() {
        return trans_date;
    }

    public void setTrans_date(LocalDateTime trans_date) {
        this.trans_date = trans_date;
    }

    public BigDecimal getDeposit_amount() {
        return deposit_amount;
    }

    public void setDeposit_amount(BigDecimal deposit_amount) {
        this.deposit_amount = deposit_amount;
    }

    public BigDecimal getWithdrawl_amount() {
        return withdrawl_amount;
    }
    public void setWithdrawl_amount(BigDecimal withdrawl_amount) {
        this.withdrawl_amount = withdrawl_amount;
    }
    public BigDecimal getTotal() {
        return total;
    }
    public void setTotal(BigDecimal total) {
        this.total = total;
    }
    public boolean isPending_flag() {
        return pending_flag;
    }
    public void setPending_flag(boolean pending_flag) {
        this.pending_flag = pending_flag;
    }


    @Override
    public String toString() {
        return "Transactions{" +
                "trans_id='" + trans_id + '\'' +
                ", account_number='" + account_number + '\'' +
                ", customer_number='" + customer_number + '\'' +
                ", trans_date=" + trans_date +
                ", deposit_amount=" + deposit_amount +
                ", withdrawl_amount=" + withdrawl_amount +
                ", total=" + total +
                ", pending_flag=" + pending_flag +
                '}';
    }
}
