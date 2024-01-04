package com.grsAuth.grs.service;

import com.grsAuth.grs.entity.Field;
import com.grsAuth.grs.entity.Relation;
import com.grsAuth.grs.repository.RelationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RelationServiceImpl implements RelationService{
    @Autowired
    private RelationRepository relationRepository;
    @Override
    public Optional<Relation> getMessage(long id) {
        return relationRepository.findById(id);
    }
    @Override
    public List<Relation> customQuery() {
        return relationRepository.customQuery();
    }

    @Override
    public List<Relation> customQueryById(long id) {
        // it is returning List of realation
        return relationRepository.customQueryById(id);

    }
    @Override
    public List<Relation> customQueryByMessage(Long id) {
        return relationRepository.customQueryByMessage(id);
    }

}
