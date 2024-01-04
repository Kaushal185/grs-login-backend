package com.grsAuth.grs.service;

import com.grsAuth.grs.entity.Field;
import com.grsAuth.grs.entity.Relation;

import java.util.List;
import java.util.Optional;

public interface RelationService {
    public Optional<Relation> getMessage(long id);
    public List<Relation> customQuery();
    public List<Relation> customQueryById(long id);
    public List<Relation> customQueryByMessage(Long id);

}
