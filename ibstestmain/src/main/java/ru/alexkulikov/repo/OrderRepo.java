package ru.alexkulikov.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.alexkulikov.entity.Order;
import ru.alexkulikov.entity.OrderState;

import javax.annotation.PostConstruct;

@Repository
public class OrderRepo extends MemoryRepo<Order> {

    @Autowired
    private PersonRepo personRepo;

    @PostConstruct
    public void init() {
        entities.add(new Order(123, "Заявка на йогурт", personRepo.getRandom(), personRepo.getRandom(), OrderState.CREATED));
        entities.add(new Order(126, "Заявка на сметану", personRepo.getRandom(), personRepo.getRandom(), OrderState.FINISHED));
        entities.add(new Order(129, "Заявка на молоко", personRepo.getRandom(), personRepo.getRandom(), OrderState.PROCESSED));
        entities.add(new Order(132, "Заявка на сыр", personRepo.getRandom(), personRepo.getRandom(), OrderState.CREATED));
        entities.add(new Order(135, "Заявка на творог", personRepo.getRandom(), personRepo.getRandom(), OrderState.FINISHED));
    }
}
