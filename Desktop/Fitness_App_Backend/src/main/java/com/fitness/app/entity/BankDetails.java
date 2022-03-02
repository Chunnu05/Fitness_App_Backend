package com.fitness.app.entity;

public class BankDetails {

    private String bankName;
    private Long accountNubmer;
    private String bankIFSC;

    public BankDetails() {
    }

    public BankDetails(String bankName, Long accountNubmer, String bankIFSC) {
        this.bankName = bankName;
        this.accountNubmer = accountNubmer;
        this.bankIFSC = bankIFSC;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Long getAccountNubmer() {
        return accountNubmer;
    }

    public void setAccountNubmer(Long accountNubmer) {
        this.accountNubmer = accountNubmer;
    }

    public String getBankIFSC() {
        return bankIFSC;
    }

    public void setBankIFSC(String bankIFSC) {
        this.bankIFSC = bankIFSC;
    }

}
