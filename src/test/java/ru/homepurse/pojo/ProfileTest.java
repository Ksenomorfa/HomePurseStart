package ru.homepurse.pojo;

import org.junit.Test;

import java.util.Currency;

import static org.junit.Assert.*;

public class ProfileTest {

    @Test
    public void testProfile() {
        Profile profile = new Profile("Polina", "Russia", Currency.getInstance("RUB"));
        System.out.println(profile.getDefaultCurrency());
        Account account = new Account("Наличные",profile);
        System.out.println(profile);
        System.out.println(account);
        account.setRemnant(100);
        CashFlow cashFlow = new CashFlow("Salary", CashFlow.CashFlowType.INCOME, 1000,account);
        CashFlow cashFlow2 = new CashFlow("Bread", CashFlow.CashFlowType.EXPENSE, 10,account);
        System.out.println(account);


    }
}