package com.gepe.springcore.rest;

import com.gepe.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

//    @Autowired
//    public DemoController(Coach myCoach){ // constructor injection
//        this.myCoach = myCoach;
//    }

    // setter injection, we can use any name.
    // not only setMyCoach like setter used to be.
    @Autowired
    public void injectSomeStuff(Coach myCoach){
        this.myCoach =  myCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
