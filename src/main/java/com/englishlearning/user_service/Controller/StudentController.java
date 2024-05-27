package com.englishlearning.user_service.Controller;

import com.englishlearning.user_service.Entity.Student;
import com.englishlearning.user_service.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student postDetails(@RequestBody Student student)
    {
        return studentService.saveDetails(student);
    }

    @GetMapping("/getStudentById/{id}")
    public Student fetchDetailsById(@PathVariable int id){
        return studentService.getStudentDetailsById(id);
    }

    @GetMapping("/getStudent")
    public List<Student> getDetails()
    {
        return studentService.getAllDetails();
    }

    @PutMapping("/updateStudent")
    public Student updateStudentDetails(@RequestBody Student student)
    {
        return studentService.updateDetail(student);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteFunction(@PathVariable int id)
    {
        return studentService.deleteStudent(id);
    }

    @PostMapping("/addStudentList")
    public List<Student> postDetails(@RequestBody List<Student> students)
    {
        return studentService.saveListDetails(students);
    }

}
