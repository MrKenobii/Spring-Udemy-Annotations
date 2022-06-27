package com.anilduyguc.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyFortuneService implements FortuneService{
    @Value("${foo.fortunes}")
    private String[] fortunes;

    @Override
    public String getFortune() {
        return fortunes[(int)Math.floor(Math.random() * (fortunes.length))];
    }
}
