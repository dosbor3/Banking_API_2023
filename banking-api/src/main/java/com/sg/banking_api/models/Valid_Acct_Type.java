package com.sg.banking_api.models;

public class Valid_Acct_Type {
    private String account_type;
    private String account_description;

    public Valid_Acct_Type(String account_type) {
        this.account_type = account_type;
    }

    public String getAccount_type() {
        return account_type;
    }

    public String getAccount_description() {
        return account_description;
    }

    public void setAccount_description(String account_description) {
        this.account_description = account_description;
    }
}
