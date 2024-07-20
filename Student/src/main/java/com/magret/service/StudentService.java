package com.magret.service;

import com.magret.entity.Student;
import com.magret.repo.StudentRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(rollbackOn = Exception.class)
public class StudentService {

    private final StudentRepo studentRepo;

    public void saveStudent(Student student){
        studentRepo.save(student);
    }

    public List<Student> findAllStudent(){
        return studentRepo.findAll();
    }

    public List<Student> findAllStudentBySchool(Integer schoolId) {
        return studentRepo.findBySchoolId(schoolId);
    }
}
