package org.example.service.impl;

import org.example.model.Loan;
import org.example.model.LoanReport;
import org.example.service.ILoanService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LoanServiceImpl implements ILoanService {

     private List<Loan> loans = new ArrayList<>();


    @Override
    public void registerLoan(Loan loan) {

        loans.add(loan);

    }

    @Override
    public List<Loan> listLoans() {
        return loans;
    }

    @Override
    public List<Loan> filterLoansByDNIStudent(String studentDni) {
        return loans.stream()
                .filter(loan -> loan.getStudent().getDni().equals(studentDni))
                .toList();
    }

    @Override
    public List<LoanReport> reportLoans(LocalDate startDate, LocalDate endDate) {
        return loans.stream()
                .filter(
                        loan -> (loan.getLoanDate().isEqual(startDate) ||
                                loan.getLoanDate().isAfter(startDate))
                        &&((loan.getLoanDate().isEqual(endDate) ||
                                loan.getLoanDate().isBefore(startDate))
                )).map(
                        loan -> new LoanReport(
                                loan.getBook().getTitle(),
                                loan.getLoanDate(),
                                loan.getReturnDate(),
                                loan.getStudent().getName()
                        )).toList();
    }
}
