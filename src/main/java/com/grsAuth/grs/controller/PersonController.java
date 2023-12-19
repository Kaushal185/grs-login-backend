package com.grsAuth.grs.controller;
import com.grsAuth.grs.entity.Person;
import com.grsAuth.grs.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
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
}

