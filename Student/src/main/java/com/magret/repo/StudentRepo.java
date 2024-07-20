package com.magret.repo;

import com.magret.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student , Integer> {

    List<Student> findBySchoolId(Integer schoolId);
}
