package com.anilduyguc.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    private FortuneService fortuneService;

    public FootballCoach() {
        System.out.println(">>FootballCoach inside the constructor!");
    }


    /*@Autowired
    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Working on free-kicks!!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    @Autowired
    @Qualifier("randomFortuneService")
    public void setFortuneService( FortuneService fortuneService) {
        System.out.println(">>FootballCoach inside the setter setFortuneService!");
        this.fortuneService = fortuneService;
    }
}
