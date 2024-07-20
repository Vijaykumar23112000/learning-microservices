package com.magret.resource;

import com.magret.entity.School;
import com.magret.response.FullSchoolResponse;
import com.magret.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/schools")
public class SchoolController {

    private final SchoolService schoolService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void saveSchool(
            @RequestBody School school
    )
    {
        schoolService.saveSchool(school);
    }

    @GetMapping
    ResponseEntity<List<School>> findAllSchools()
    {
        return ResponseEntity.ok(schoolService.findAll());
    }

    @GetMapping("/with-students/{schoolId}")
    ResponseEntity<FullSchoolResponse> findAllStudentsOfASchool(
            @PathVariable Integer schoolId
    )
    {
        return ResponseEntity.ok(schoolService.findSchoolsWithStudents(schoolId));
    }

}
