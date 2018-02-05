package ru.alexkulikov.repo;

import org.springframework.stereotype.Repository;
import ru.alexkulikov.entity.Person;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@Repository
public class PersonRepo extends MemoryRepo<Person> {

    @PostConstruct
    public void init() {
        entities.add(new Person("aaa", "bbb"));
        entities.add(new Person("ccc", "ddd"));
    }
}