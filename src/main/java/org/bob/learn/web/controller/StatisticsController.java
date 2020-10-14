package org.bob.learn.web.controller;

import org.bob.learn.service.StaticsService;
import org.bob.learn.web.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/statistics")
public class StatisticsController {

    @Autowired
    private StaticsService staticsService;

    @GetMapping("/add")
    public Result addStatistics() {
        staticsService.saveStatistics("A1B2C3D4E5F6","A1B2C3D4E5F6");
        return new Result();
    }
}
