package ru.kz.springonjavaconfig;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class ClassicalMusic implements Music {


    @Override
    public String getSong() {
        return "Vivaldy";
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

}
