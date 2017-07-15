package ru.homepurse.pojo;

import java.util.Currency;

public class CashFlow {
    private final Long id;
    private String name;
    private Category category = new Category("Default");
    private SubCategory subCategory = new SubCategory("Default",category);
    private CashFlowType cashFlowType;
    private Account account;
    private Currency cashFlowCurrency;
    private int sum;

    enum CashFlowType {
        INCOME,
        EXPENSE;
    }

    public CashFlow(String name, CashFlowType cashFlowType, int sum, Account account) {
        this.id = null;
        this.name = name;
        this.cashFlowType = cashFlowType;
        this.sum = sum;
        this.account = account;
        this.cashFlowCurrency = account.getCurrency();
        initCashFlow();
    }

    public CashFlow(String name, CashFlowType cashFlowType,
                    int sum, Account account, Category category, SubCategory subCategory) {
        this(name,cashFlowType,sum,account);
        this.category = category;
        this.subCategory = subCategory;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CashFlowType getCashFlowType() {
        return cashFlowType;
    }

    public int getSum() {
        return sum;
    }

    public void initCashFlow() {
        if (cashFlowType == CashFlowType.INCOME) {
            account.setRemnant(account.getRemnant()+sum);
        }
        else account.setRemnant(account.getRemnant()-sum);
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

}
