package com.example.KateSP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeService {
    @Autowired
    GradeRepository gradeRepository;

    public GradeEntity getGradeById(Integer id){
        return gradeRepository.findById(id).orElseGet(() -> {
            GradeEntity result = new GradeEntity();
            result.setId(-1);
            result.setName("нет такой степени");
            return result;
        });
    }

    public GradeEntity getGradeByName(String name) {
        GradeEntity gradeEntity = gradeRepository.findByName(name);
        return gradeEntity;
    }
}
