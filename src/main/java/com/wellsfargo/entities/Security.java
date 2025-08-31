package com.wellsfargo.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer securityId;

    @Column
    private String tickerSymbol;

    @Column
    private String name;

    @Column
    private String category;

    @Column
    private BigDecimal expenseRatio;

    @OneToMany(mappedBy = "security", cascade = CascadeType.ALL)
    private List<Holding> holdings = new ArrayList<>();

    @OneToMany(mappedBy = "security", cascade = CascadeType.ALL)
    private List<Transaction> transactions = new ArrayList<>();

    public Security() {
    }

    public Security(String tickerSymbol, String name, String category, BigDecimal expenseRatio) {
        this.tickerSymbol = tickerSymbol;
        this.name = name;
        this.category = category;
        this.expenseRatio = expenseRatio;
    }

    public Integer getSecurityId() {
        return securityId;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getExpenseRatio() {
        return expenseRatio;
    }

    public void setExpenseRatio(BigDecimal expenseRatio) {
        this.expenseRatio = expenseRatio;
    }

    public List<Holding> getHoldings() {
        return holdings;
    }

    public void setHoldings(List<Holding> holdings) {
        this.holdings = holdings;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
