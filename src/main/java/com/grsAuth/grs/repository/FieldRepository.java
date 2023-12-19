package com.grsAuth.grs.repository;

import com.grsAuth.grs.entity.Field;
import com.grsAuth.grs.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FieldRepository extends JpaRepository<Field, Long> {
}
