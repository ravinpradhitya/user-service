package com.englishlearning.user_service.Service;

import com.englishlearning.user_service.Entity.Student;
import com.englishlearning.user_service.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student saveDetails(Student student){

        return studentRepo.save(student);
    }

    public Student getStudentDetailsById(String id)
    {
        return studentRepo.findById(id).orElse(null);
    }

    public List<Student> getAllDetails()
    {
        return studentRepo.findAll();
    }

    public Student updateDetail(Student student){

        Student updateStudent=studentRepo.findById(student.getId()).orElse(null);
        if(updateStudent!=null)
        {

            updateStudent.setStudentEmail(student.getStudentEmail());
            updateStudent.setStudentName(student.getStudentName());
            updateStudent.setStudentAddress(student.getStudentAddress());
            studentRepo.save(updateStudent);
            return updateStudent;
        }
        return null;
    }

    public String deleteStudent(String id){
        if(studentRepo.existsById(id)){
            studentRepo.deleteById(id);
            return "deleted "+id;
        }else {
            return "id not exist";
        }
    }

    public List<Student> saveListDetails(List<Student> students)
    {
        return studentRepo.saveAll(students);
    }
}
