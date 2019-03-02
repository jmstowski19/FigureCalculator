package com.company;


public class Prism extends Figure implements Printable{

    private Figure base;
    private double height;

    @Override
    public void print() {
        System.out.print("Base of Prism: ");
        System.out.print(base.Type);
        System.out.print("\n");
        System.out.print("Volume of Prism: ");
        System.out.print(calculateVolume());
        System.out.print("\n");
        System.out.print("Area of Prism: ");
        System.out.print(calculateArea());
        System.out.print("\n");

    }

    public Prism(Figure obj, double h){
        this.height=h;
        this.Type="Prism";
        this.base=obj;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateVolume(){
        return base.calculateArea()*height;
    }

    @Override
    public double calculateArea() {
        if(base.Type=="Triangle"){
           return (2*base.calculateArea()+base.getA()*getHeight()+base.getB()*getHeight()+base.getC()*getHeight());
        }
        else if(base.Type=="Square"){
            return (2*base.calculateArea()+4*base.getA()*getHeight());
        }
        else if(base.Type=="Circle"){
            return (2*base.calculateArea()+base.calculatePerimeter()*getHeight());
        }
        else return 0;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public String getType() {
        return this.Type;
    }

    @Override
    public double getA() {
        return 0;
    }

    @Override
    public double getB() {
        return 0;
    }

    @Override
    public double getC() {
        return 0;
    }
}
