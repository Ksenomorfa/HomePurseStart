package ru.homepurse.pojo;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.Currency;

public class CashFlow {

    private final Long id = 1L;
    private String name;
    private Category category = new Category("Default");
    private SubCategory subCategory = new SubCategory("Default", category);
    private CashFlowType cashFlowType;
    private Account account;
    private Currency cashFlowCurrency;
    private int sum;
    private LocalDate timeStamp;

    public enum CashFlowType {
        INCOME,
        EXPENSE;
    }

    public CashFlow() {
        this.timeStamp = LocalDate.now();
    }

    public CashFlow(Account account, Category category, SubCategory subCategory) {
        this();
        this.account = account;
        this.cashFlowCurrency = account.getCurrency();
        this.category = category;
        this.subCategory = subCategory;
        initCashFlow();
    }

    public CashFlow(String name, CashFlowType cashFlowType,
                    int sum, Account account, Category category, SubCategory subCategory) {
        this(account, category, subCategory);
        this.cashFlowType = cashFlowType;
        this.sum = sum;
        this.name = name;

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }

    public CashFlowType getCashFlowType() {
        return cashFlowType;
    }

    public Currency getCashFlowCurrency() {
        return cashFlowCurrency;
    }

    public Category getCategory() {
        return category;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public Account getAccount() {
        return account;
    }

    public LocalDate getTimeStamp() {
        return timeStamp;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCashFlowType(CashFlowType cashFlowType) {
        this.cashFlowType = cashFlowType;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void initCashFlow() {
        if (cashFlowType == CashFlowType.INCOME) {
            account.setRemnant(account.getRemnant() + sum);
        } else account.setRemnant(account.getRemnant() - sum);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        CashFlow cashFlow = null;
        if (obj instanceof CashFlow) {
            cashFlow = (CashFlow) obj;
        }
        return cashFlow != null &&
                this.getId().equals(cashFlow.getId());
    }

    @Override
    public String toString() {
        return "CashFlow{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category.getName() +
                ", subCategory=" + subCategory.getName() +
                ", cashFlowType=" + cashFlowType.name() +
                ", account=" + account.getName() +
                ", cashFlowCurrency=" + cashFlowCurrency +
                ", sum=" + sum +
                ", timeStamp=" + timeStamp +
                '}';
    }

}
