package com.grsAuth.grs.controller;
import com.grsAuth.grs.entity.LoginRequest;
import com.grsAuth.grs.entity.LoginResponse;
import com.grsAuth.grs.entity.Person;
import com.grsAuth.grs.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
@CrossOrigin(origins = "http://localhost:4200") // Replace with the actual origin of your Angular app
public class PersonController {
    @Autowired
    private PersonService personService;
    @GetMapping("/all")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }
    @GetMapping("/{id}")
    public Optional<Person> getPersonById(@PathVariable String id) {
        return personService.getPersonById(id);
    }
//    @PostMapping("/checkAuth")
//    public String checkAuth(@RequestBody LoginRequest loginRequest) {
//        return personService.postPersonById(loginRequest);
//    }
    @PostMapping("/checkAuth")
    public ResponseEntity<LoginResponse> checkAuth(@RequestBody LoginRequest loginRequest) {
        LoginResponse response = personService.postPersonById(loginRequest);

        if (response.isSuccess()) {
            return ResponseEntity.ok(response); // 200 OK
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }
    }
}

