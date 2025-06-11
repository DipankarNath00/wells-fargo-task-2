package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue()
    private long clientId;
    @ManyToOne
    @JoinColumn(name = "advisorId",nullable = false)
    private Advisor advisorId;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private String email;

    public Client(String address, String phone, String firstName, String lastName, long clientId, Advisor advisorId, String email) {
        this.address = address;
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;
        this.clientId = clientId;
        this.advisorId = advisorId;
        this.email = email;
    }

    public long getClientId() {
        return clientId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Advisor getAdvisorId() {
        return advisorId;
    }

    public void setAdvisorId(Advisor advisorId) {
        this.advisorId = advisorId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
