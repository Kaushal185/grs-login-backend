package com.grsAuth.grs.controller;

import com.grsAuth.grs.entity.Field;
import com.grsAuth.grs.entity.Relation;
import com.grsAuth.grs.service.RelationService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/relation")
@CrossOrigin(origins = "http://localhost:4200")
public class RelationController {
    @Autowired
    private RelationService relationService;

    @GetMapping("/{id}")
    public Optional<Relation> getAllPersons(@PathVariable Long id) {
        return relationService.getMessage(id);
    }
    @GetMapping("/custom")
    public List<Relation> customQuery() {
        return relationService.customQuery();
    }
    @GetMapping("/customQuery/{id}")
    public List<Relation> customQueryById(@PathVariable Long id) {
        return relationService.customQueryById(id);
    }

    @GetMapping("/message/{id}")
    public List<Relation> getMessage(@PathVariable Long id) {
        return relationService.customQueryByMessage(id);
    }

}
