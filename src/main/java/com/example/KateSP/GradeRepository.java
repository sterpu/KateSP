package com.example.KateSP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;

@Component
public class GradeRepository {
    @Autowired
    private EntityManager entityManager;

    public GradeEntity findById(int id) {
        return entityManager.find(GradeEntity.class, id);
    }

}
