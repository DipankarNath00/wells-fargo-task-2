package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private long purchasePrice;
    @Column(nullable = false)
    private Timestamp purchaseDate;
    @Column(nullable = false)
    private int quantity;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getSecurityId() {
        return securityId;
    }

    public Timestamp getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Timestamp purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Security(String category, long purchasePrice, long securityId, int quantity, Timestamp purchaseDate, Portfolio portfolioId, String name) {
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.securityId = securityId;
        this.quantity = quantity;
        this.purchaseDate = purchaseDate;
        this.name = name;
    }
}
