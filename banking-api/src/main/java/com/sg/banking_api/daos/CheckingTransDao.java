package com.sg.banking_api.daos;

import com.sg.banking_api.models.Checking_Trans;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
public interface CheckingTransDao {
    Checking_Trans getCheckingTransactionsById(String trans_id);
    Checking_Trans getCheckingTransactionsByCustomer(String customer_number);
    Checking_Trans getCheckingTransactionsByDateAndTime(LocalDateTime dateTime);
    BigDecimal getCheckingDepositAmount(String trans_id);
    BigDecimal getCheckingWithdrawlAmount(String trans_id);
    BigDecimal getTotalCheckingAmount(String trans_id);
    List<Checking_Trans> getAllCheckingTransactions();
    List<Checking_Trans> getAllCheckingTransactionsByCustomer();
    List<Checking_Trans> getAllCheckingWithdrawlsByDate(LocalDate date);
    List<Checking_Trans> getAllCheckingDepositsByDate(LocalDate date);
    Checking_Trans addCheckingTransaction(Checking_Trans transaction);
    void updateCheckingTransactions(Checking_Trans transaction);
    void deleteCheckingTransactions(Checking_Trans transaction);

}
