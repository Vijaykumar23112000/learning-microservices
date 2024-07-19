package com.magret.service;

import com.magret.entity.Student;
import com.magret.repo.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepo studentRepo;

    public void saveStudent(Student student){
        studentRepo.save(student);
    }

    public List<Student> findAllStudent(){
        return studentRepo.findAll();
    }

}
