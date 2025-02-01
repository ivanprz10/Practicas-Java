package org.example.model;

import java.time.LocalDate;
import java.util.UUID;

public class Loan {
    private String id;
    private Book book;
    private Student student;
    private LocalDate loanDate;
    private LocalDate returnDate;
    private boolean isLoan;

    public Loan(Book book, Student student, boolean isLoan) {
        this.id = UUID.randomUUID().toString();
        this.book = book;
        this.student = student;
        this.isLoan = isLoan;
        this.loanDate = LocalDate.now();
        this.returnDate = loanDate.plusDays(7);
    }

    public String getId() {
        return id;
    }

    public Book getBook() {
        return book;
    }

    public Student getStudent() {
        return student;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public boolean isLoan() {
        return isLoan;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id='" + id + '\'' +
                ", book=" + book +
                ", student=" + student +
                ", loanDate=" + loanDate +
                ", returnDate=" + returnDate +
                ", isLoan=" + isLoan +
                '}';
    }
}
