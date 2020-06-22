package com.example.KateSP;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface GradeRepository extends CrudRepository<GradeEntity,Integer> {

    GradeEntity findByName(String name);
}
