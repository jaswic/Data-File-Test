package com.example.datafiletest;

public class Lens {

    private double diameter, radius1, radius2;

    public Lens(double diameter, double radius1, double radius2) {
        this.diameter = diameter;
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getRadius1() {
        return radius1;
    }

    public void setRadius1(double radius1) {
        this.radius1 = radius1;
    }

    public double getRadius2() {
        return radius2;
    }

    public void setRadius2(double radius2) {
        this.radius2 = radius2;
    }
}
