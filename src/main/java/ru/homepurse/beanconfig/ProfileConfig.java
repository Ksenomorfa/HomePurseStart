package ru.homepurse.beanconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.homepurse.pojo.Account;
import ru.homepurse.pojo.Profile;

@Configuration
public class ProfileConfig {
    @Bean
    public Profile profile() {
        return new Profile();
    }

    @Bean
    public Account account() {
        return new Account("Acc",profile());
    }
}