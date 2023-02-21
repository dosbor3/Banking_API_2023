package com.sg.banking_api.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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

    public void setTrans_id(String trans_id) {
        this.trans_id = trans_id;
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
}
