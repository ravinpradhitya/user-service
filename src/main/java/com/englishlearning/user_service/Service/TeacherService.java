package com.englishlearning.user_service.Service;

import com.englishlearning.user_service.Entity.Teacher;
import com.englishlearning.user_service.Repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepo teacherRepo;

    public Teacher saveDetails(Teacher teacher){
        return teacherRepo.save(teacher);
    }

    public Teacher getTeacherDetailsById(String id)
    {
        return teacherRepo.findById(id).orElse(null);
    }

    public List<Teacher> getAllDetails()
    {
        return teacherRepo.findAll();
    }

    public Teacher updateDetail(Teacher teacher){

        Teacher updateTeacher=teacherRepo.findById(teacher.getId()).orElse(null);
        if(updateTeacher!=null)
        {

            updateTeacher.setTeacherEmail(teacher.getTeacherEmail());
            updateTeacher.setTeacherName(teacher.getTeacherName());
            updateTeacher.setTeacherAddress(teacher.getTeacherAddress());
            teacherRepo.save(updateTeacher);
            return updateTeacher;
        }
        return null;
    }

    public String deleteTeacher(String id){
        if(teacherRepo.existsById(id)){
            teacherRepo.deleteById(id);
            return "deleted "+id;
        }else {
            return "id not exist";
        }
    }

    public List<Teacher> saveListDetails(List<Teacher> teachers)
    {
        return teacherRepo.saveAll(teachers);
    }

}
