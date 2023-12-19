package com.grsAuth.grs.repository;

import com.grsAuth.grs.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, String> {
    // You can add custom queries or methods here if needed
}
