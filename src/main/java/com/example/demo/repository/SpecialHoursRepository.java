package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.SpecialHours;

public interface SpecialHoursRepository extends JpaRepository<SpecialHours, Long> {
}
