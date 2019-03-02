package com.company;


public class Square extends Figure implements Printable {
    double a;

    public Square(){
        this.Type="Square";
        this.a=0;
    }

    public Square(double a) {
        if(a<=0) throw new IllegalArgumentException("Fail to create a Square");
        this.Type="Square";
        this.a = a;
    }

    @Override
    public void print() {
        System.out.print("Square side: ");
        System.out.print(getA());
        System.out.print(" \n");
        System.out.print("Square Area: ");
        System.out.print(calculateArea());
        System.out.print("\n");
        System.out.print("Square Perimeter: ");
        System.out.print(calculatePerimeter());
        System.out.print("\n");
    }

    @Override
    public String getType() {
        return this.Type;
    }

    @Override
    public double getA() {
        return a;
    }

    @Override
    public double getB() {
        return 0;
    }

    @Override
    public double getC() {
        return 0;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return a*a;
    }

    @Override
    public double calculatePerimeter() {
        return 4*a;
    }

}
