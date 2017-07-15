package ru.homepurse.pojo;

import java.util.Currency;
import java.util.Locale;

public class Profile {
    private final Long id;
    private String name;
    private String country;
    private Currency defaultCurrency;

    public Profile(String name, String country, Currency defaultCurrency) {
        this.country = country;
        this.defaultCurrency = defaultCurrency;
        this.id = null;
        this.name = name;
    }

    public Profile(String name, String country) {
        this.country = country;
        this.defaultCurrency = Currency.getInstance(Locale.getDefault());
        this.id = null;
        this.name = name;
    }

    public Profile() {
        this.id = null;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Profile id: " + id + ", name: " + name + ", country: " + country +
                ", default currency " + defaultCurrency;
    }
}
