package ru.homepurse.pojo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({ "ru.homepurse" })
public class CashFlowMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(CashFlow.class);
        AnnotationConfigApplicationContext context2 =
                new AnnotationConfigApplicationContext(Account.class);
        AnnotationConfigApplicationContext context3 =
                new AnnotationConfigApplicationContext(Profile.class);

        CashFlow cashFlow = context.getBean(CashFlow.class);
        Account account = context2.getBean(Account.class);
        Profile profile = context3.getBean(Profile.class);

        //account.setProfile(profile);
        cashFlow.setAccount(account);
        cashFlow.setCashFlowType(CashFlow.CashFlowType.INCOME);
        System.out.println(cashFlow);
    }
}
