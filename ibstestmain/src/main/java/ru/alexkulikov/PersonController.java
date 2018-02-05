package ru.alexkulikov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.alexkulikov.entity.Person;
import ru.alexkulikov.repo.PersonRepo;

import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    private PersonRepo personRepo;

    @GetMapping(value = "/getAll")
    public ResponseEntity<List<Person>> hello() {
        return ResponseEntity.ok().body(personRepo.getAll());
    }
}
