package com.englishlearning.user_service.Controller;

import com.englishlearning.user_service.Entity.School;
import com.englishlearning.user_service.Entity.Student;
import com.englishlearning.user_service.Service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @PostMapping("/addSchool")
    public School postDetails(@RequestBody School school)
    {
        return schoolService.saveDetails(school);
    }

    @GetMapping("/getSchoolById/{id}")
    public School fetchDetailsById(@PathVariable int id){
        return schoolService.getSchoolDetailsById(id);
    }

    @GetMapping("/getSchool")
    public List<School> getDetails()
    {
        return schoolService.getAllDetails();
    }

    @PutMapping("/updateSchool")
    public School updateSchoolDetails(@RequestBody School school)
    {
        return schoolService.updateDetail(school);
    }

    @DeleteMapping("/deleteSchool/{id}")
    public String deleteFunction(@PathVariable int id)
    {
        return schoolService.deleteSchool(id);
    }

    @PostMapping("/addSchoolList")
    public List<School> postDetails(@RequestBody List<School> schools)
    {
        return schoolService.saveListDetails(schools);
    }

    @GetMapping("/getStudentsBySchoolId/{id}")
    public List<Student> getStudentsBySchoolId(@PathVariable int id) {
        return schoolService.getStudentsBySchoolId(id);
    }
}
