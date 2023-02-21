package com.sg.banking_api.daos;

import com.sg.banking_api.models.Checking;

import java.math.BigDecimal;
import java.util.List;

public class CheckingDaoImpl implements CheckingDao{
    @Override
    public Checking getCheckingByAccountNumber(String account_number) {
        return null;
    }

    @Override
    public Checking getCheckingByCustomerNumber(String customer_number) {
        return null;
    }

    @Override
    public Checking addChecking(Checking checking) {
        return null;
    }

    @Override
    public List<Checking> getAllChecking() {
        return null;
    }

    @Override
    public BigDecimal getAvailableBalance(String account_number) {
        return null;
    }

    @Override
    public BigDecimal getCurrentBalance(String account_number) {
        return null;
    }

    @Override
    public BigDecimal makeDeposit(BigDecimal funds) {
        return null;
    }

    @Override
    public BigDecimal makeWithdrawl(BigDecimal funds) {
        return null;
    }

    @Override
    public void updateChecking(Checking checking) {

    }

    @Override
    public void deleteCheckingByAccountNumber(String account_number) {

    }
}
