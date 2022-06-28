package com.anilduyguc.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FormulaSportConfig {
    @Bean
    public FortuneService formulaFortuneService(){
        return new FormulaFortuneService();
    }
    @Bean
    public Coach formulaCoach(){
        return new FormulaCoach(formulaFortuneService());
    }
}
