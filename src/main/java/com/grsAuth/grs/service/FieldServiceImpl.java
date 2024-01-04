package com.grsAuth.grs.service;
import com.grsAuth.grs.entity.Field;
import com.grsAuth.grs.repository.FieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FieldServiceImpl implements FieldService{
    @Autowired
    private FieldRepository fieldRepository;
    @Override
    public List<Field> getAllFields() {
        return fieldRepository.findAll();
    }
    @Override
    public Optional<Field> getFieldById(long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Field> getMessageById(long id) {
        return fieldRepository.findById(id);

    }
    @Override
    public List<Field> demoMethod(){
        return fieldRepository.demoMethod();
    }

    @Override
    public List<Field> demoMethod2(Long id) {
        return fieldRepository.demoMethod2(id);
    }
}
