package com.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Vehicle vehicle = (Vehicle) context.getBean("vehicle");
        vehicle.drive();

        Tire tire = (Tire) context.getBean("tire");
        System.out.println(tire);

        Wheel wheel = (Wheel) context.getBean("wheel");
        System.out.println(wheel);

    }

}
