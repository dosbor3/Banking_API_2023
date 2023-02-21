package com.sg.banking_api.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Checking_Trans {
    private String trans_id;
    private String account_number;
    private String customer_number;
    private LocalDateTime trans_date;
    private BigDecimal deposit_amount;
    private BigDecimal withdrawl_amount;
    private BigDecimal total;
    private String check_no;
    private String image_url;
    private boolean pending_flag;

    public Checking_Trans(String trans_id) {
        this.trans_id = trans_id;
    }

    public String getTrans_id() {
        return trans_id;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getCustomer_number() {
        return customer_number;
    }

    public void setCustomer_number(String customer_number) {
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

    public String getCheck_no() {
        return check_no;
    }

    public void setCheck_no(String check_no) {
        this.check_no = check_no;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public boolean isPending_flag() {
        return pending_flag;
    }

    public void setPending_flag(boolean pending_flag) {
        this.pending_flag = pending_flag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Checking_Trans that = (Checking_Trans) o;
        return pending_flag == that.pending_flag && trans_id.equals(that.trans_id) && Objects.equals(account_number, that.account_number) && Objects.equals(customer_number, that.customer_number) && Objects.equals(trans_date, that.trans_date) && Objects.equals(deposit_amount, that.deposit_amount) && Objects.equals(withdrawl_amount, that.withdrawl_amount) && Objects.equals(total, that.total) && Objects.equals(check_no, that.check_no) && Objects.equals(image_url, that.image_url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trans_id, account_number, customer_number, trans_date, deposit_amount, withdrawl_amount, total, check_no, image_url, pending_flag);
    }

    @Override
    public String toString() {
        return "Checking_Trans{" +
                "trans_id='" + trans_id + '\'' +
                ", account_number='" + account_number + '\'' +
                ", customer_number='" + customer_number + '\'' +
                ", trans_date=" + trans_date +
                ", deposit_amount=" + deposit_amount +
                ", withdrawl_amount=" + withdrawl_amount +
                ", total=" + total +
                ", check_no='" + check_no + '\'' +
                ", image_url='" + image_url + '\'' +
                ", pending_flag=" + pending_flag +
                '}';
    }
}
