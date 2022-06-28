package com.anilduyguc.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("myFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println(">>TennisCoach: inside the default constructor!");
    }

    /*@Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Practice your backend volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

   /* @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">>TennisCoach: inside the setter setFortuneService!");
        this.fortuneService = fortuneService;
    } */
}
