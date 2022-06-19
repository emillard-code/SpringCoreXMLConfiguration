package com.project;

// Constructor Injection
public class Wheel {

    private String brand;

    public Wheel(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Wheel [" + "brand=" + brand + ']';
    }

}
