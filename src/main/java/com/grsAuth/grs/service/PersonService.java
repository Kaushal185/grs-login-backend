package com.grsAuth.grs.service;

import com.grsAuth.grs.entity.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    public List<Person> getAllPersons();

    public Optional<Person> getPersonById(String id);

}
