package com.magret.repo;

import com.magret.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepo extends JpaRepository<School , Integer> {
}
