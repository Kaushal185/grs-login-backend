package com.grsAuth.grs.service;

import com.grsAuth.grs.entity.Field;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface FieldService {
    public List<Field> getAllFields();

    public Optional<Field> getFieldById(long id);
    public Optional<Field> getMessageById(long id);
    public List<Field> demoMethod();
    List<Field> demoMethod2(Long id);
}
