package com.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

    @BeforeEach
    public void setUp() {

        System.setOut(new PrintStream(outputStreamCaptor));

    }

    @Test
    public void testCar() {

        Vehicle vehicle = (Vehicle) context.getBean("car");
        vehicle.drive();

        Assertions.assertEquals("Driving a car...", outputStreamCaptor.toString().trim());

    }

    @Test
    public void testTruck() {

        Vehicle vehicle = (Vehicle) context.getBean("truck");
        vehicle.drive();

        Assertions.assertEquals("Driving a truck...", outputStreamCaptor.toString().trim());

    }

    @Test
    public void testTire() {

        Tire tire = (Tire) context.getBean("tire");

        Assertions.assertEquals("Tire [brand=MRF]", tire.toString());

    }

    @Test
    public void testWheel() {

        Wheel wheel = (Wheel) context.getBean("wheel");

        Assertions.assertEquals("Wheel [brand=MRF]", wheel.toString());

    }

    @AfterEach
    public void tearDown() {

        System.setOut(standardOut);

    }

}
