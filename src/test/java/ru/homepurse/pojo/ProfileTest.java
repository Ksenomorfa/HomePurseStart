package ru.homepurse.pojo;

import org.junit.Test;

import java.util.Currency;

public class ProfileTest {

    @Test
    public void testProfile() {
        Profile profile = new Profile("Polina", "Russia", Currency.getInstance("RUB"));
        System.out.println(profile);

//        Account account = new Account("Наличные",profile);
//        System.out.println(account);
//        account.setRemnant(100);
//
//        CashFlow cashFlow = new CashFlow("Salary", CashFlow.CashFlowType.INCOME, 1000,account);
//        System.out.println(cashFlow);
//        CashFlow cashFlow2 = new CashFlow("Bread", CashFlow.CashFlowType.EXPENSE, 10,account);
//        System.out.println(cashFlow2);
//
//        System.out.println(account);

    }
}