package com.example.datafiletest;

public class ZygoSphere {

    private double fNumber;
    private double sphereRadius;
    private String name;

    public ZygoSphere(double fNumber, double sphereRadius, String name){
        this.fNumber = fNumber;
        this.sphereRadius = sphereRadius;
        this.name = name;
    }

    public double getfNumber(){
        return fNumber;
    }

    public double getSphereRadius() {
        return sphereRadius;
    }

    public String getName() {
        return name;
    }
}
