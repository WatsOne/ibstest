package ru.alexkulikov.repo;

import org.springframework.stereotype.Repository;
import ru.alexkulikov.entity.Order;
import ru.alexkulikov.entity.OrderState;
import ru.alexkulikov.entity.Person;

import javax.annotation.PostConstruct;

@Repository
public class OrderRepo extends MemoryRepo<Order> {

    @PostConstruct
    public void init() {
        entities.add(new Order(123, "order1", new Person("as", "asd"), new Person("as", "asd"), OrderState.CREATED));
        entities.add(new Order(126, "order2", new Person("ass", "aasd"), new Person("a4s", "a5sd"), OrderState.FINISHED));
    }
}
