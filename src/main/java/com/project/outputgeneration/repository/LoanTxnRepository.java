package com.project.outputgeneration.repository;

import com.project.outputgeneration.entity.LoanTxnId;
import com.project.outputgeneration.entity.Loan_Txn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface LoanTxnRepository extends JpaRepository<Loan_Txn, LoanTxnId> {
    @Query("SELECT lt FROM Loan_Txn lt WHERE lt.loanTxnId.invstrLoanNbr = :invstrLoanNbr")
    List<Loan_Txn> findByInvstrLoanNbr(@Param("invstrLoanNbr") Integer invstrLoanNbr);
}
