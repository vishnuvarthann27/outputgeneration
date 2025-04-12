package com.project.outputgeneration.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "loan_txn")
@Data
public class Loan_Txn {

    @EmbeddedId
    private LoanTxnId loanTxnId;  // Composite Primary Key

    @Column(name = "srvcr_loan_nbr", nullable = false)
    private Integer srvcrLoanNbr;

    @Column(name = "prin_pymt_amt", nullable = false)
    private double prinPymtAmt;

    @Column(name = "int_pymt_amt", nullable = false)
    private double intPymtAmt;

    @Column(name = "txn_dt", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date txnDt;

    @Column(name = "next_pymt_due_dt", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date nextPymtDueDt;

    @Column(name = "crtl_amt", nullable = false)
    private double crtlAmt;

    @Column(name = "int_only_pymt_amt", nullable = false)
    private double intOnlyPymtAmt;

    @Column(name = "lqdtn_pymt_amt", nullable = false)
    private double lqdtnPymtAmt;

    @Column(name = "prin_bal_aftr_pymt", nullable = false)
    private double prinBalAftrPymt;

    @Column(name = "created_timestamp", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTimestamp;

    public Loan_Txn(){

    }

    public Date getTxnDt() {
        return txnDt;
    }

    public void setTxnDt(Date txnDt) {
        this.txnDt = txnDt;
    }

    public LoanTxnId getLoanTxnId() {
        return loanTxnId;
    }

    public void setLoanTxnId(LoanTxnId loanTxnId) {
        this.loanTxnId = loanTxnId;
    }

    public Integer getSrvcrLoanNbr() {
        return srvcrLoanNbr;
    }

    public void setSrvcrLoanNbr(Integer srvcrLoanNbr) {
        this.srvcrLoanNbr = srvcrLoanNbr;
    }

    public double getPrinPymtAmt() {
        return prinPymtAmt;
    }

    public void setPrinPymtAmt(double prinPymtAmt) {
        this.prinPymtAmt = prinPymtAmt;
    }

    public double getIntPymtAmt() {
        return intPymtAmt;
    }

    public void setIntPymtAmt(double intPymtAmt) {
        this.intPymtAmt = intPymtAmt;
    }

    public Date getNextPymtDueDt() {
        return nextPymtDueDt;
    }

    public void setNextPymtDueDt(Date nextPymtDueDt) {
        this.nextPymtDueDt = nextPymtDueDt;
    }

    public double getCrtlAmt() {
        return crtlAmt;
    }

    public void setCrtlAmt(double crtlAmt) {
        this.crtlAmt = crtlAmt;
    }

    public double getIntOnlyPymtAmt() {
        return intOnlyPymtAmt;
    }

    public void setIntOnlyPymtAmt(double intOnlyPymtAmt) {
        this.intOnlyPymtAmt = intOnlyPymtAmt;
    }

    public double getLqdtnPymtAmt() {
        return lqdtnPymtAmt;
    }

    public void setLqdtnPymtAmt(double lqdtnPymtAmt) {
        this.lqdtnPymtAmt = lqdtnPymtAmt;
    }

    public double getPrinBalAftrPymt() {
        return prinBalAftrPymt;
    }

    public void setPrinBalAftrPymt(double prinBalAftrPymt) {
        this.prinBalAftrPymt = prinBalAftrPymt;
    }

    public Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }
}
