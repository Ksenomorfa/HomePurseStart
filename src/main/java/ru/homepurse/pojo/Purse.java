package ru.homepurse.pojo;

import java.util.Currency;

public class Purse {
    private final Long id = 1L;
    private String name;
    private Currency purseCurrency;
    private int remnant;
    private Profile profile;

    public Purse(Profile profile) {
        this.profile = profile;
        this.purseCurrency = profile.getDefaultCurrency();
    }

    public Purse(String name, Profile profile) {
        this(profile);
        this.name = name;
        this.profile = profile;

    }

    public Purse(String name, Profile profile, Currency currency) {
        this(name, profile);
        this.purseCurrency = currency;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Currency getCurrency() {
        return purseCurrency;
    }


    public Currency getPurseCurrency() {
        return purseCurrency;
    }

    public void setPurseCurrency(Currency purseCurrency) {
        this.purseCurrency = purseCurrency;
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
        this.purseCurrency = currency;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Purse purse = null;
        if (obj instanceof Purse) {
            purse = (Purse) obj;
        }
        return purse != null &&
                this.getId().equals(purse.getId());
    }

    public int getRemnant() {
        return remnant;
    }

    public void setRemnant(int remnant) {
        this.remnant = remnant;
    }


    @Override
    public String toString() {
        return "Purse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", purseCurrency=" + purseCurrency +
                ", remnant=" + remnant +
                ", profile=" + profile.getId() +
                '}';
    }
}
