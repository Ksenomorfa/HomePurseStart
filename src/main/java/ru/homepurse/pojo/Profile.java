package ru.homepurse.pojo;

import java.util.Currency;
import java.util.Locale;

public class Profile {
    private final Long id = 1L;
    private String name;
    private String country;
    private Currency defaultCurrency;
    private boolean includeSubCategories;

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

    public Profile(String name, String country, Currency defaultCurrency) {
        this(name,country);
        this.defaultCurrency = defaultCurrency;
    }

    public Profile(String name, String country) {
        this();
        this.country = country;
        this.name = name;
    }

    public Profile() {
        this.defaultCurrency = Currency.getInstance(Locale.getDefault());
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


    public boolean isIncludeSubCategories() {
        return includeSubCategories;
    }

    public void setIncludeSubCategories(boolean includeSubCategories) {
        this.includeSubCategories = includeSubCategories;
    }

}
