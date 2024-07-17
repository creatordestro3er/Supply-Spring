package com.example.demo.controller;

import com.example.demo.model.SpecialHours;
import com.example.demo.service.SpecialHoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SpecialHoursController {

    @Autowired
    private SpecialHoursService specialHoursService;

    @GetMapping("/special-hours")
    public SpecialHours getSpecialHours() {
        return specialHoursService.getSpecialHours();
    }

    @PostMapping("/special-hours")
    public SpecialHours createSpecialHours(@RequestBody SpecialHours specialHours) {
        return specialHoursService.saveSpecialHours(specialHours);
    }
}
