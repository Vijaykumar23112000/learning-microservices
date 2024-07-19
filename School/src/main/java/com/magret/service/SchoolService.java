package com.magret.service;

import com.magret.entity.School;
import com.magret.repo.SchoolRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepo schoolRepo;

    public void saveSchool(School school){
        schoolRepo.save(school);
    }

    public List<School> findAll(){
        return schoolRepo.findAll();
    }

}
