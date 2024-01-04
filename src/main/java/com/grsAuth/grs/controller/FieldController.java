package com.grsAuth.grs.controller;

import com.grsAuth.grs.entity.Field;
import com.grsAuth.grs.entity.Person;
import com.grsAuth.grs.entity.Relation;
import com.grsAuth.grs.service.FieldService;
import com.grsAuth.grs.service.RelationService;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fields")
@CrossOrigin(origins = "http://localhost:4200")
public class FieldController {
    @Autowired
    private FieldService fieldService;

    @Autowired
    private RelationService relationService;

    @GetMapping("/all")
    public List<Field> getAllPersons() {
        return fieldService.getAllFields();
    }
    @GetMapping("/{id}")
    public Optional<Field> getMessageById(@PathVariable long id){
        return fieldService.getMessageById(id);
    }
    @GetMapping("/demo")
    public List<Field> getOriginalandTranslated(){
        return fieldService.demoMethod();
    }

    @GetMapping("/demo2/{id}")
    public List<String> getOriginalandTranslated2(@PathVariable Long id){
        //Here I got id's of msg1,msg2.
        //I got id but I have to compare it with msg2
        List<Relation> r = relationService.customQueryByMessage(id);
        Long m1 = r.get(0).getMsg1();
        Long m2 = r.get(0).getMsg2();
        List<Field> f1 =  fieldService.demoMethod2(m1);
        List<Field> f2 = fieldService.demoMethod2(m2);
        String message1 = f1.get(0).getMessage();
        String message2 = f2.get(0).getMessage();
        ArrayList<String> list = new ArrayList<>(List.of(message1,message2));
        return list;
    }
}
