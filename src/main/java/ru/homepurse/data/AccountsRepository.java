package ru.homepurse.data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import ru.homepurse.pojo.*;

import java.util.List;

@Repository
public interface AccountsRepository {
    List<Account> findAccounts(long max, int count);
}
