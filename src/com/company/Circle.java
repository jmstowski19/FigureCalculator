package com.company;


public class Circle extends Figure implements Printable {
    double radius;

    public Circle(){
        this.Type="Circle";
        this.radius=0;
    }

    @Override
    public void print() {
        System.out.print("Circle Radius: ");
        System.out.print(getA());
        System.out.print(" \n");
        System.out.print("Circle Area: ");
        System.out.print(calculateArea());
        System.out.print("\n");
        System.out.print("Circle Perimeter: ");
        System.out.print(calculatePerimeter());
        System.out.print("\n");
    }

    public Circle(double radius) {
        if(radius<=0) throw new IllegalArgumentException("Fail to create a Circle!");
        this.Type="Circle";
        this.radius = radius;
    }

    @Override
    public double getA() {
        return radius;
    }

    @Override
    public String getType() {
        return this.Type;
    }

    @Override
    public double getB() {
        return 0;
    }

    @Override
    public double getC() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI*2*radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}

