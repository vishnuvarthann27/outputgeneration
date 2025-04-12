package com.project.outputgeneration.controllers;

import com.project.outputgeneration.entity.Llr;
import com.project.outputgeneration.entity.Loan;
import com.project.outputgeneration.entity.Loan_Txn;
import com.project.outputgeneration.repository.LLRRepository;
import com.project.outputgeneration.repository.LoanRepository;
import com.project.outputgeneration.repository.LoanTxnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/output")
public class OuputDataController {

    private final LLRRepository llrRepository;
    private final LoanRepository loanRepository;
    private final LoanTxnRepository loanTxnRepository;

    public OuputDataController(LLRRepository llrRepository, LoanRepository loanRepository, LoanTxnRepository loanTxnRepository){
        this.llrRepository = llrRepository;
        this.loanRepository = loanRepository;
        this.loanTxnRepository = loanTxnRepository;
    }

    @GetMapping("/llr/{invstrLoanNbr}")
    public ResponseEntity<Llr> getllr(@PathVariable("invstrLoanNbr") Integer invstrLoanNbr){
        return llrRepository.findByInvstrLoanNbr(invstrLoanNbr)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/loan/{invstrLoanNbr}")
    public ResponseEntity<Loan> getLoan(@PathVariable("invstrLoanNbr") Integer invstrLoanNbr){
        return loanRepository.findByInvstrLoanNbr(invstrLoanNbr)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/loan_txn/{invstrLoanNbr}")
    public ResponseEntity<List<Loan_Txn>> getLoanTxn(@PathVariable("invstrLoanNbr") Integer invstrLoanNbr){
        List<Loan_Txn> transactions = loanTxnRepository.findByInvstrLoanNbr(invstrLoanNbr);
        if (transactions.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(transactions);
    }
}
