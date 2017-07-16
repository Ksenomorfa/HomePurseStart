package ru.homepurse.pojo;

import java.util.Currency;

public class Account {
    private final Long id = 1L;
    private String name;
    private Currency accountCurrency;
    private int remnant;
    private Profile profile;

    public Account() {
    }

    public Account(Profile profile) {
        this.profile = profile;
        this.accountCurrency = profile.getDefaultCurrency();
    }

    public Account(String name, Profile profile, Currency currency) {
        this(profile);
        this.name = name;
        this.accountCurrency = currency;
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


    public Currency getAccountCurrency() {
        return accountCurrency;
    }

    public void setAccountCurrency(Currency accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    public Profile getProfile() {

        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrency(Currency currency) {
        this.accountCurrency =currency;
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
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accountCurrency=" + accountCurrency +
                ", remnant=" + remnant +
                ", profile=" + profile.getName() +
                '}';
    }
}
