package com.englishlearning.user_service.Service;

import com.englishlearning.user_service.Entity.School;
import com.englishlearning.user_service.Repository.SchoolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    private SchoolRepo schoolRepo;

    public School saveDetails(School school){
        return schoolRepo.save(school);
    }

    public School getSchoolDetailsById(int id)
    {
        return schoolRepo.findById(id).orElse(null);
    }

    public List<School> getAllDetails()
    {
        return schoolRepo.findAll();
    }

    public School updateDetail(School school){

        School updateSchool=schoolRepo.findById(school.getId()).orElse(null);
        if(updateSchool!=null)
        {

            updateSchool.setSchoolEmail(school.getSchoolEmail());
            updateSchool.setSchoolName(school.getSchoolName());
            updateSchool.setSchoolAddress(school.getSchoolAddress());
            schoolRepo.save(updateSchool);
            return updateSchool;
        }
        return null;
    }

    public String deleteSchool(int id){
        if(schoolRepo.existsById(id)){
            schoolRepo.deleteById(id);
            return "deleted "+id;
        }else {
            return "id not exist";
        }
    }

    public List<School> saveListDetails(List<School> schools)
    {
        return schoolRepo.saveAll(schools);
    }
}
