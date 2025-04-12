package com.project.outputgeneration.repository;

import com.project.outputgeneration.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoanRepository extends JpaRepository<Loan, Integer> {
    Optional<Loan> findByInvstrLoanNbr(Integer invstrLoanNbr);
}
