package ru.homepurse.pojo;

import java.util.Currency;
import java.util.Locale;

public class Profile {
    private Long id;

    private String name;

    private char[] password;

    private String email;

    private String country;

    private Currency defaultCurrency;

    private boolean includeSubCategories;

    public Profile() {
    }

    public Profile(String country, Currency defaultCurrency, String name,
                   String email) {
        this(country, defaultCurrency);
        this.name = name;
        this.email = email;
    }

    public Profile(String country, Currency defaultCurrency) {
        this(country);
        this.defaultCurrency = defaultCurrency;
    }

    public Profile(String country) {
        this.defaultCurrency = Currency.getInstance(Locale.getDefault());
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(Currency currency) {
        this.defaultCurrency = currency;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isIncludeSubCategories() {
        return includeSubCategories;
    }

    public void setIncludeSubCategories(boolean includeSubCategories) {
        this.includeSubCategories = includeSubCategories;
    }


    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Profile profile = null;
        if (obj instanceof Profile) {
            profile = (Profile) obj;
        }
        return profile != null &&
                this.getId().equals(profile.getId());
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", defaultCurrency=" + defaultCurrency +
                ", includeSubCategories=" + includeSubCategories +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
