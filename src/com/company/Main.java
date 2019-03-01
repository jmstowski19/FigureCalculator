package com.company;

public class Main {
    public static void main(String[] args) {
	    Triangle moj=new Triangle(3,4,5);
	    double obwod=moj.calculatePerimeter();
	    double pole=moj.calculateArea();

	    System.out.print(obwod);
	    System.out.print("\n");
	    System.out.print(pole);

    }
}
