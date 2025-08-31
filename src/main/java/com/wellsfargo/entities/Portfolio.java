package com.wellsfargo.entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer portfolioId;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private FinancialAdvisor financialAdvisor;

    @Column
    private String name;

    @Column
    private Date creationDate;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL)
    private List<Account> accounts = new ArrayList<>();

    public Portfolio() {
    }

    public Portfolio(Client client, FinancialAdvisor financialAdvisor, String name, Date creationDate) {
        this.client = client;
        this.financialAdvisor = financialAdvisor;
        this.name = name;
        this.creationDate = creationDate;
    }

    public Integer getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public FinancialAdvisor getFinancialAdvisor() {
        return financialAdvisor;
    }

    public void setFinancialAdvisor(FinancialAdvisor financialAdvisor) {
        this.financialAdvisor = financialAdvisor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
