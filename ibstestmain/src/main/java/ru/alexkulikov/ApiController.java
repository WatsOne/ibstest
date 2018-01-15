package ru.alexkulikov;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api")
public class ApiController {

    @GetMapping(value = "/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok().body("HELLO");
    }

}
