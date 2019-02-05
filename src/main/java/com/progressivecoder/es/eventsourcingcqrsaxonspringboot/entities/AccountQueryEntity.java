package com.progressivecoder.es.eventsourcingcqrsaxonspringboot.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountQueryEntity {

    @Id
    private String id;

    private double accountBalance;

    private String currency;

    private String status;

    public AccountQueryEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AccountQueryEntity{" +
                "id='" + id + '\'' +
                ", accountBalance=" + accountBalance +
                ", currency='" + currency + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
