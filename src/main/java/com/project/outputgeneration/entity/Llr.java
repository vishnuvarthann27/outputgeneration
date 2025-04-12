package com.project.outputgeneration.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "llr")
public class Llr implements Serializable {

    @Id
    @Column(name = "invstr_loan_nbr", nullable = false)
    private Integer invstrLoanNbr;

    @Column(name = "srvcr_loan_nbr", nullable = false)
    private Integer srvcrLoanNbr;

    @Column(name = "prin_pymt_amt")
    private double prinPymtAmt;

    @Column(name = "int_pymt_amt")
    private double intPymtAmt;

    @Temporal(TemporalType.DATE)
    @Column(name = "txn_dt")
    private Date txnDt;

    @Temporal(TemporalType.DATE)
    @Column(name = "next_pymt_due_dt")
    private Date nextPymtDueDt;

    @Column(name = "crtl_amt")
    private double crtlAmt;

    @Column(name = "int_only_pymt_amt")
    private double intOnlyPymtAmt;

    @Column(name = "lqdtn_pymt_amt")
    private double lqdtnPymtAmt;

    @Column(name = "end_upb_amt")
    private double endUpbAmt;

    @Column(name = "opening_upb_amt")
    private double openingUpbAmt;

    @Column(name = "original_prin_bal")
    private double originalPrinBal;

    @Temporal(TemporalType.DATE)
    @Column(name = "ddlpi_dt")
    private Date ddlpiDt;

    @Temporal(TemporalType.DATE)
    @Column(name = "first_payment_date")
    private Date firstPaymentDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "loan_mtr_dt")
    private Date loanMtrDt;

    @Column(name = "invstr_cd")
    private String invstrCd;

    @Column(name = "issur_nbr")
    private String issurNbr;

    @Column(name = "created_timestamp", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTimestamp;

    public Llr() {
    }


    public Integer getInvstrLoanNbr() {
        return invstrLoanNbr;
    }

    public void setInvstrLoanNbr(Integer invstrLoanNbr) {
        this.invstrLoanNbr = invstrLoanNbr;
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

    public Date getTxnDt() {
        return txnDt;
    }

    public void setTxnDt(Date txnDt) {
        this.txnDt = txnDt;
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

    public double getEndUpbAmt() {
        return endUpbAmt;
    }

    public void setEndUpbAmt(double endUpbAmt) {
        this.endUpbAmt = endUpbAmt;
    }

    public double getOpeningUpbAmt() {
        return openingUpbAmt;
    }

    public void setOpeningUpbAmt(double openingUpbAmt) {
        this.openingUpbAmt = openingUpbAmt;
    }

    public double getOriginalPrinBal() {
        return originalPrinBal;
    }

    public void setOriginalPrinBal(double originalPrinBal) {
        this.originalPrinBal = originalPrinBal;
    }

    public Date getDdlpiDt() {
        return ddlpiDt;
    }

    public void setDdlpiDt(Date ddlpiDt) {
        this.ddlpiDt = ddlpiDt;
    }

    public Date getFirstPaymentDate() {
        return firstPaymentDate;
    }

    public void setFirstPaymentDate(Date firstPaymentDate) {
        this.firstPaymentDate = firstPaymentDate;
    }

    public Date getLoanMtrDt() {
        return loanMtrDt;
    }

    public void setLoanMtrDt(Date loanMtrDt) {
        this.loanMtrDt = loanMtrDt;
    }

    public String getInvstrCd() {
        return invstrCd;
    }

    public void setInvstrCd(String invstrCd) {
        this.invstrCd = invstrCd;
    }

    public String getIssurNbr() {
        return issurNbr;
    }

    public void setIssurNbr(String issurNbr) {
        this.issurNbr = issurNbr;
    }

    public Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }
}
