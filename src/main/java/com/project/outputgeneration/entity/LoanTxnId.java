package com.project.outputgeneration.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class LoanTxnId implements Serializable {

    @Column(name = "invstr_loan_nbr", nullable = false)
    private Integer invstrLoanNbr;

    @Column(name = "txn_seq_nbr", nullable = false)
    private Integer txnSeqNbr;

    public LoanTxnId() {
    }

    public LoanTxnId(Integer invstrLoanNbr, Integer txnSeqNbr) {
        this.invstrLoanNbr = invstrLoanNbr;
        this.txnSeqNbr = txnSeqNbr;
    }

    public Integer getInvstrLoanNbr() {
        return invstrLoanNbr;
    }

    public void setInvstrLoanNbr(Integer invstrLoanNbr) {
        this.invstrLoanNbr = invstrLoanNbr;
    }

    public Integer getTxnSeqNbr() {
        return txnSeqNbr;
    }

    public void setTxnSeqNbr(Integer txnSeqNbr) {
        this.txnSeqNbr = txnSeqNbr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoanTxnId loanTxnId = (LoanTxnId) o;
        return Objects.equals(invstrLoanNbr, loanTxnId.invstrLoanNbr) &&
                Objects.equals(txnSeqNbr, loanTxnId.txnSeqNbr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invstrLoanNbr, txnSeqNbr);
    }
}

