package com.sg.banking_api.daos;

import com.sg.banking_api.models.Checking;
import java.math.BigDecimal;
import java.util.List;

public interface CheckingDao {
    Checking getCheckingByAccountNumber(String account_number);
    Checking getCheckingByCustomerNumber(String customer_number);
    Checking addChecking(Checking checking);
    List<Checking> getAllChecking();
    BigDecimal getAvailableBalance(String account_number);
    BigDecimal getCurrentBalance(String account_number);
    BigDecimal makeDeposit(BigDecimal funds);
    BigDecimal makeWithdrawl(BigDecimal funds);
    void updateChecking(Checking checking);
    void deleteCheckingByAccountNumber(String account_number);

}
