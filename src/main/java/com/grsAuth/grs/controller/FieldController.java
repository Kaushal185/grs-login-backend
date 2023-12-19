package com.grsAuth.grs.controller;

import com.grsAuth.grs.entity.Field;
import com.grsAuth.grs.entity.Person;
import com.grsAuth.grs.service.FieldService;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fields")
@CrossOrigin(origins = "http://localhost:4200")
public class FieldController {
    @Autowired
    private FieldService fieldService;

    @GetMapping("/all")
    public List<Field> getAllPersons() {
        return fieldService.getAllFields();
    }
}
