package org.example.service;

import org.example.model.Loan;
import org.example.model.LoanReport;

import java.time.LocalDate;
import java.util.List;

public interface ILoanService {

    void registerLoan(Loan loan);
    List<Loan>listLoans();
    List<Loan> filterLoansByDNIStudent(String studentDni);
    List<LoanReport>reportLoans(LocalDate startDate, LocalDate endDate);
}
