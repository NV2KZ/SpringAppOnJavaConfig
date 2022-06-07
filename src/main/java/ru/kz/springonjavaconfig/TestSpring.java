package ru.kz.springonjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println(classicalMusic1.getSong());
        context.close();
    }
}
