package ru.kz.springonjavaconfig;

import org.springframework.stereotype.Component;


public class RockMusic implements Music{

    public String getSong() {
        return "Disturbed";
    }

}
