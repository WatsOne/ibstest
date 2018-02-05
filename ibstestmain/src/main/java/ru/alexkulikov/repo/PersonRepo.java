package ru.alexkulikov.repo;

import org.springframework.stereotype.Repository;
import ru.alexkulikov.entity.Person;

import javax.annotation.PostConstruct;
import java.util.Random;

@Repository
public class PersonRepo extends MemoryRepo<Person> {

    private Random rnd;

    @PostConstruct
    public void init() {
        rnd = new Random();

        entities.add(new Person("Александр", "Пушкин"));
        entities.add(new Person("Лев", "Толстой"));
        entities.add(new Person("Фёдор", "Достоевский"));
        entities.add(new Person("Николай", "Гоголь"));
        entities.add(new Person("Илон", "Маск"));
        entities.add(new Person("Владимир", "Ленин"));
        entities.add(new Person("Иван", "Тургенев"));
        entities.add(new Person("Иосиф", "Сталин"));
    }

    public Person getRandom() {
        return entities.get(rnd.nextInt(entities.size()));
    }
}