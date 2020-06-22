package com.example.KateSP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @GetMapping("/grade")
    public GradeEntity getGradeById(@RequestParam(value = "id") String gradeId){
        return gradeService.getGradeById(Integer.valueOf(gradeId));
    }

    @GetMapping("/grade_name")
    public GradeEntity getGradeByName(@RequestParam(value = "name") String name){
        return gradeService.getGradeByName(name);
    }
}
