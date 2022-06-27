package com.anilduyguc.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach footballCoach = context.getBean("footballCoach", Coach.class);
        boolean result = theCoach == footballCoach;
        System.out.println("The result of 2 objects shares the same memory: " +result);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(footballCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(footballCoach.getDailyFortune());
        context.close();
    }
}
