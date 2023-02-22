package com.sg.banking_api.daos;

import com.sg.banking_api.models.Account;

import java.math.BigDecimal;
import java.util.List;

public class AccountDaoImpl implements AccountDao {
    @Override
    public Account getAccountByAccountNumber(int account_number) {
        return null;
    }

    @Override
    public Account getAccountByCustomerNumber(int customer_number) {
        return null;
    }

    @Override
    public Account addAccount(Account account) {
        return null;
    }

    @Override
    public List<Account> getAllAccounts() {
        return null;
    }

    @Override
    public BigDecimal getAvailableBalance(int account_number) {
        return null;
    }

    @Override
    public BigDecimal getCurrentBalance(int account_number) {
        return null;
    }

    @Override
    public void updateChecking(Account account) {

    }

    @Override
    public void deleteCheckingByAccountNumber(String account_number) {

    }
}
