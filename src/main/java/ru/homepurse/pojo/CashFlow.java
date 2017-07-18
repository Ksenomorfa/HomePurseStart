package ru.homepurse.pojo;

import java.time.LocalDate;
import java.util.Currency;

public class CashFlow {

    private final Long id = 1L;
    private String name;
    private Category category = new Category("Default");
    private SubCategory subCategory = new SubCategory("Default", category);
    private CashFlowType cashFlowType;
    private Purse purse;
    private Currency cashFlowCurrency;
    private int sum;
    private LocalDate timeStamp;

    public enum CashFlowType {
        INCOME,
        EXPENSE;
    }

    public CashFlow(Purse purse, Category category, SubCategory subCategory) {
        this.timeStamp = LocalDate.now();
        this.purse = purse;
        this.cashFlowCurrency = purse.getCurrency();
        this.category = category;
        this.subCategory = subCategory;
        initCashFlow();
    }

    public CashFlow(String name, CashFlowType cashFlowType,
                    int sum, Purse purse, Category category, SubCategory subCategory) {
        this(purse, category, subCategory);
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

    public Purse getPurse() {
        return purse;
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

    public void setPurse(Purse purse) {
        this.purse = purse;
    }

    public void initCashFlow() {
        if (cashFlowType == CashFlowType.INCOME) {
            purse.setRemnant(purse.getRemnant() + sum);
        } else purse.setRemnant(purse.getRemnant() - sum);
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
                ", purse=" + purse.getName() +
                ", cashFlowCurrency=" + cashFlowCurrency +
                ", sum=" + sum +
                ", timeStamp=" + timeStamp +
                '}';
    }

}
