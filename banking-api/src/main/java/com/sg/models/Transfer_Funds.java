package com.sg.banking_api.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Transfer_Funds {
    private String trans_id;
    private String from_account;
    private String from_cust_number;
    private String to_account;
    private String to_cust_number;
    private BigDecimal transfer_amount;
    private LocalDateTime trans_date;

    public Transfer_Funds(String trans_id) {
        this.trans_id = trans_id;
        this.trans_date = LocalDateTime.now();
    }

    public String getTrans_id() {
        return trans_id;
    }

    public String getFrom_account() {
        return from_account;
    }

    public void setFrom_account(String from_account) {
        this.from_account = from_account;
    }

    public String getFrom_cust_number() {
        return from_cust_number;
    }

    public void setFrom_cust_number(String from_cust_number) {
        this.from_cust_number = from_cust_number;
    }

    public String getTo_account() {
        return to_account;
    }

    public void setTo_account(String to_account) {
        this.to_account = to_account;
    }

    public String getTo_cust_number() {
        return to_cust_number;
    }

    public void setTo_cust_number(String to_cust_number) {
        this.to_cust_number = to_cust_number;
    }

    public BigDecimal getTransfer_amount() {
        return transfer_amount;
    }

    public void setTransfer_amount(BigDecimal transfer_amount) {
        this.transfer_amount = transfer_amount;
    }

    public LocalDateTime getTrans_date() {
        return trans_date;
    }

    public void setTrans_date(LocalDateTime trans_date) {
        this.trans_date = trans_date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transfer_Funds that = (Transfer_Funds) o;
        return trans_id.equals(that.trans_id) && Objects.equals(from_account, that.from_account) && Objects.equals(from_cust_number, that.from_cust_number) && Objects.equals(to_account, that.to_account) && Objects.equals(to_cust_number, that.to_cust_number) && Objects.equals(transfer_amount, that.transfer_amount) && Objects.equals(trans_date, that.trans_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trans_id, from_account, from_cust_number, to_account, to_cust_number, transfer_amount, trans_date);
    }

    @Override
    public String toString() {
        return "Transfer_Funds{" +
                "trans_id='" + trans_id + '\'' +
                ", from_account='" + from_account + '\'' +
                ", from_cust_number='" + from_cust_number + '\'' +
                ", to_account='" + to_account + '\'' +
                ", to_cust_number='" + to_cust_number + '\'' +
                ", transfer_amount=" + transfer_amount +
                ", trans_date=" + trans_date +
                '}';
    }
}
