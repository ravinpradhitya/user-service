package com.englishlearning.user_service.Controller;

import com.englishlearning.user_service.Entity.Teacher;
import com.englishlearning.user_service.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/addTeacher")
    public Teacher postDetails(@RequestBody Teacher teacher)
    {
        return teacherService.saveDetails(teacher);
    }

    @GetMapping("/getTeacherById/{id}")
    public Teacher fetchDetailsById(@PathVariable String id){
        return teacherService.getTeacherDetailsById(id);
    }

    @GetMapping("/getTeacher")
    public List<Teacher> getDetails()
    {
        return teacherService.getAllDetails();
    }

    @PutMapping("/updateTeacher")
    public Teacher updateTeacherDetails(@RequestBody Teacher teacher)
    {
        return teacherService.updateDetail(teacher);
    }

    @DeleteMapping("/deleteTeacher/{id}")
    public String deleteFunction(@PathVariable String id)
    {
        return teacherService.deleteTeacher(id);
    }

    @PostMapping("/addTeacherList")
    public List<Teacher> postDetails(@RequestBody List<Teacher> teachers)
    {
        return teacherService.saveListDetails(teachers);
    }

}
