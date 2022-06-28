package com.anilduyguc.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FormulaDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FormulaSportConfig.class);

        Coach theCoach = context.getBean("formulaCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        context.close();
    }
}
