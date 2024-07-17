package com.example.demo.service;

import com.example.demo.model.SpecialHours;
import com.example.demo.repository.SpecialHoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecialHoursService {

    @Autowired
    private SpecialHoursRepository specialHoursRepository;

    public SpecialHours getSpecialHours() {
        return specialHoursRepository.findById(1L).orElse(null);
    }

    public SpecialHours saveSpecialHours(SpecialHours specialHours) {
        return specialHoursRepository.save(specialHours);
    }
}
