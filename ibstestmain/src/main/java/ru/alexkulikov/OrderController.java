package ru.alexkulikov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.alexkulikov.entity.Order;
import ru.alexkulikov.repo.OrderRepo;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderRepo orderRepo;

    @GetMapping(value = "/getAll")
    public ResponseEntity<List<Order>> hello() {
        return ResponseEntity.ok().body(orderRepo.getAll());
    }
}
