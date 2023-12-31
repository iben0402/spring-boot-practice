package com.iwona.secondProject.rest;

import com.iwona.secondProject.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // private field for the dependency
    private Coach myCoach;

    // contructor for dependency injection
    @Autowired
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }

    // setter injection, name of method can be anything
//    @Autowired
//    public void setCoach(Coach coach) {
//        this.myCoach = coach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
