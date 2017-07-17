package ru.homepurse.pojo;

import java.util.Currency;
import java.util.Locale;

public class Profile {
    private final Long id = 1L;
    private String name;
    private String country;
    private Currency defaultCurrency;
    private boolean includeSubCategories;

    public Profile(String name, String country, Currency defaultCurrency) {
        this(name, country);
        this.defaultCurrency = defaultCurrency;
    }

    public Profile(String name, String country) {
        this.defaultCurrency = Currency.getInstance(Locale.getDefault());
        this.country = country;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
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
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", defaultCurrency=" + defaultCurrency +
                ", includeSubCategories=" + includeSubCategories +
                '}';
    }

}
