package ru.homepurse.data;

import org.springframework.stereotype.Repository;
import ru.homepurse.pojo.Purse;
import ru.homepurse.pojo.Profile;

import java.util.ArrayList;
import java.util.List;
@Repository
public class PursesRepositoryImpl implements PursesRepository {

    @Override
    public List<Purse> findPurses(long max, int count) {
        List<Purse> list = new ArrayList<>();
        Profile profile = new Profile();
        list.add(new Purse(profile));
        return list;
    }
}
