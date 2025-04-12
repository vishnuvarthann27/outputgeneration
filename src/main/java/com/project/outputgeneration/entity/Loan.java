package com.project.outputgeneration.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "\"LOAN\"")
@Data
public class Loan {

    @Id
    @Column(name = "invstr_loan_nbr", nullable = false)
    private Integer invstrLoanNbr;

    @Column(name = "srvcr_loan_nbr", nullable = false)
    private Integer srvcrLoanNbr;

    @Column(name = "upb_amt", nullable = false)
    private double upbAmt;

    @Column(name = "original_prin_bal", nullable = false)
    private double originalPrinBal;

    @Column(name = "ddlpi_dt", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date ddlpiDt;

    @Column(name = "first_payment_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date firstPaymentDate;

    @Column(name = "loan_mtr_dt", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date loanMtrDt;

    @Column(name = "invstr_cd", nullable = false, length = 50)
    private String invstrCd;

    @Column(name = "issur_nbr", nullable = false, length = 50)
    private String issurNbr;

    @Column(name = "created_timestamp", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTimestamp;

    public Loan(){

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

    public double getUpbAmt() {
        return upbAmt;
    }

    public void setUpbAmt(double upbAmt) {
        this.upbAmt = upbAmt;
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
