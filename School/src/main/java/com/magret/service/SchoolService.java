package com.magret.service;

import com.magret.client.StudentClient;
import com.magret.entity.School;
import com.magret.repo.SchoolRepo;
import com.magret.response.FullSchoolResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(rollbackOn = Exception.class)
public class SchoolService {

    private final SchoolRepo schoolRepo;
    private final StudentClient studentClient;

    public void saveSchool(School school){
        schoolRepo.save(school);
    }

    public List<School> findAll(){
        return schoolRepo.findAll();
    }

    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId) {
        var school = schoolRepo.findById(schoolId).
                orElse(School
                        .builder()
                        .name("NOT_FOUND")
                        .email("NOT_FOUND")
                        .build()
                );
        var students = studentClient.findAllStudentsBySchool(schoolId);
        return FullSchoolResponse
                .builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }
}
