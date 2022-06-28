package com.anilduyguc.springdemo;


public class FormulaFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "You will take the pole position on Saturday!";
    }
}
