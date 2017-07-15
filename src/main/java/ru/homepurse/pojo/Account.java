package ru.homepurse.pojo;

import java.util.Currency;

public class Account {
    private final Long id;
    private String name;
    private Currency accountCurrency;
    private int remnant;
    private Profile profile;

    public Account(String name, Profile profile) {
        this.id = null;
        this.name = name;
        this.accountCurrency = profile.getDefaultCurrency();
        this.profile = profile;
    }

    public Account(String name, Profile profile, Currency currency) {
        this(name, profile);
        this.accountCurrency = currency;
    }

    public Account() {
        this.id = null;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Currency getCurrency() {
        return accountCurrency;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Account account = null;
        if (obj instanceof Account) {
            account = (Account) obj;
        }
        return account != null &&
                this.getId().equals(account.getId());
    }

    public int getRemnant() {
        return remnant;
    }

    public void setRemnant(int remnant) {
        this.remnant = remnant;
    }

    @Override
    public String toString() {
        return "Profile: " + profile.getName() + ". Account id:" + id + ", name: " + name
                + ", remnant: " + remnant + " " + accountCurrency;
    }
}
