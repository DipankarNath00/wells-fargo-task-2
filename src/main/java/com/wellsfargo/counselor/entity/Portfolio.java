package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;
    @ManyToOne
    @JoinColumn(name = "clientId",nullable = false)
    private Client clientId;
    @Column(nullable = false)
    private Timestamp creationDate;

    public Portfolio(Client clientId, long portfolioId, Timestamp creationDate) {
        this.clientId = clientId;
        this.portfolioId = portfolioId;
        this.creationDate = creationDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }
}
