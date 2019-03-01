package com.company;

public class Triangle extends Figure{
    private double a, b, c;

    public Triangle() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public Triangle(double a, double b, double c)
    {
        if(a<=0 || b<=0 || c<=0 || a+b<=c || a+c<=b || b+c<=a) throw new IllegalArgumentException("Fail to create Triangle");
        this.a=a;
        this.b=b;
        this.c=c;

    }



    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    double calculatePerimeter(){
        return this.a+this.b+this.c;
    }

    double calculateArea(){
        double p = (this.a+this.b+this.c)/2;
        return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
    }
}
