package ru.homepurse.beanconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.homepurse.pojo.*;

@Configuration

public class ProfileConfig {
    @Bean
    public Profile profile() {
        return new Profile();
    }

    @Bean
    public Account account() {
        return new Account(profile());
    }

    @Bean
    public Category category() {
        return new Category();
    }

    @Bean
    public SubCategory subCategory() {
        return new SubCategory(category());
    }

    @Bean
    public CashFlow cashFlow() {
        return new CashFlow(account(), category(), subCategory());
    }



}