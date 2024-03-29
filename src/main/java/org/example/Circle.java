package org.example;

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

}
