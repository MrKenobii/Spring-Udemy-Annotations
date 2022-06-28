package com.anilduyguc.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FormulaCoach implements Coach {
    private FortuneService fortuneService;

    public FormulaCoach(@Qualifier(value = "formulaFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Working on exit of an apex";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
