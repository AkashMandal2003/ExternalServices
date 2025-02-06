package com.jocata.externalservices.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "CIBIL")
public class CibilDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "pan_id")
    private String pan;

    @Column(name = "credit_score")
    private int creditScore;

    @Column(name = "credit_history")
    private String creditHistory;

    @Column(name = "total_outstanding_balance")
    private BigDecimal totalOutstandingBalance;

    @Column(name = "recent_credit_inquiries")
    private String recentCreditInquiries;

    @Column(name = "payment_history")
    private String paymentHistory;

    @Column(name = "credit_limit")
    private BigDecimal creditLimit;

    @Column(name = "status")
    private String status;

    @Column(name = "report_date")
    private Date reportDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public String getCreditHistory() {
        return creditHistory;
    }

    public void setCreditHistory(String creditHistory) {
        this.creditHistory = creditHistory;
    }

    public BigDecimal getTotalOutstandingBalance() {
        return totalOutstandingBalance;
    }

    public void setTotalOutstandingBalance(BigDecimal totalOutstandingBalance) {
        this.totalOutstandingBalance = totalOutstandingBalance;
    }

    public String getRecentCreditInquiries() {
        return recentCreditInquiries;
    }

    public void setRecentCreditInquiries(String recentCreditInquiries) {
        this.recentCreditInquiries = recentCreditInquiries;
    }

    public String getPaymentHistory() {
        return paymentHistory;
    }

    public void setPaymentHistory(String paymentHistory) {
        this.paymentHistory = paymentHistory;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }
}

