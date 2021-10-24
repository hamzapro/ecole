package com.ecole.ecole.repository.impl;

import com.ecole.ecole.entity.Subject;
import com.ecole.ecole.repository.ISubjectRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class SubjectRepository implements ISubjectRepository {


    @PersistenceContext
    EntityManager em;

    @Override
    public Subject save(Subject subject) {
        return null;
    }
}
