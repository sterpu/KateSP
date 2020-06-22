package com.example.KateSP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/teacher")
    public TeacherEntity getTeacher(@RequestParam(value = "id") String id) {
        return teacherService.getById(Integer.valueOf(id));
    }

    @PostMapping("/teacher")
    public TeacherEntity createTeacher(@RequestParam(value = "name") String name) {
        return teacherService.createTeacher(name);
    }

    @PutMapping("/teacher")
    public TeacherEntity updateTeachersGrade(@RequestParam(value = "id") String id, @RequestParam(value = "grade_id") String gradeId) {
        return teacherService.updateTeachersGrade(Integer.valueOf(id), Integer.valueOf(gradeId));
    }

    @DeleteMapping("/teacher")
    public String deleteTeacher(@RequestParam(value = "id") String id) {
        return teacherService.deleteTeacher(Integer.valueOf(id));
    }
}
