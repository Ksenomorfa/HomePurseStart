package ru.homepurse.data;

import org.springframework.stereotype.Repository;
import ru.homepurse.pojo.Purse;

import java.util.List;

@Repository
public interface PursesRepository {
    List<Purse> findPurses(long max, int count);
}
