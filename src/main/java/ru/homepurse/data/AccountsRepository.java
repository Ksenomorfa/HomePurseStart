package ru.homepurse.data;
import ru.homepurse.pojo.*;

import java.util.List;

public interface AccountsRepository {
    List<Account> findAccounts();
}
