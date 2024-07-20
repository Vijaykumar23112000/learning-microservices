package com.magret.resource;

import com.magret.entity.Student;
import com.magret.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void saveStudent(
        @RequestBody Student student
    )
    {
        studentService.saveStudent(student);
    }

    @GetMapping
    ResponseEntity<List<Student>> findAllStudents()
    {
        return ResponseEntity.ok(studentService.findAllStudent());
    }

    @GetMapping("/school/{schoolId}")
    ResponseEntity<List<Student>> findAllStudents(
            @PathVariable Integer schoolId
    )
    {
        return ResponseEntity.ok(studentService.findAllStudentBySchool(schoolId));
    }

}
