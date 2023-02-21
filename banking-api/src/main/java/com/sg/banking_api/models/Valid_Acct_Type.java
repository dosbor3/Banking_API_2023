package com.sg.banking_api.models;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Valid_Acct_Type that = (Valid_Acct_Type) o;
        return account_type.equals(that.account_type) && Objects.equals(account_description, that.account_description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account_type, account_description);
    }


}
