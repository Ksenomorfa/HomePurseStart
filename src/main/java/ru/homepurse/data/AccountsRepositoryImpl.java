package ru.homepurse.data;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import ru.homepurse.pojo.Account;
import ru.homepurse.pojo.Profile;

import java.util.ArrayList;
import java.util.List;
@Repository
public class AccountsRepositoryImpl implements AccountsRepository {


    @Override
    public List<Account> findAccounts(long max, int count) {
        List<Account> list = new ArrayList<>();
        list.add(new Account(new Profile("Polina","Russia")));

        return list;
    }
}
