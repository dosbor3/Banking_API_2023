package com.sg.banking_api.daos;

import com.sg.banking_api.models.Checking_Trans;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class CheckingTransDaoDbImpl implements CheckingTransDao{
    @Override
    public Checking_Trans getCheckingTransactionsById(String trans_id) {
        return null;
    }

    @Override
    public Checking_Trans getCheckingTransactionsByCustomer(String customer_number) {
        return null;
    }

    @Override
    public Checking_Trans getCheckingTransactionsByDateAndTime(LocalDateTime dateTime) {
        return null;
    }

    @Override
    public BigDecimal getCheckingDepositAmount(String trans_id) {
        return null;
    }

    @Override
    public BigDecimal getCheckingWithdrawlAmount(String trans_id) {
        return null;
    }

    @Override
    public BigDecimal getTotalCheckingAmount(String trans_id) {
        return null;
    }

    @Override
    public List<Checking_Trans> getAllCheckingTransactions() {
        return null;
    }

    @Override
    public List<Checking_Trans> getAllCheckingTransactionsByCustomer() {
        return null;
    }

    @Override
    public List<Checking_Trans> getAllCheckingWithdrawlsByDate(LocalDate date) {
        return null;
    }

    @Override
    public List<Checking_Trans> getAllCheckingDepositsByDate(LocalDate date) {
        return null;
    }

    @Override
    public Checking_Trans addCheckingTransaction(Checking_Trans transaction) {
        return null;
    }

    @Override
    public void updateCheckingTransactions(Checking_Trans transaction) {

    }

    @Override
    public void deleteCheckingTransactions(Checking_Trans transaction) {

    }
}
