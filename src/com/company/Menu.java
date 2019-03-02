package com.company;

import java.util.Scanner;


public class Menu{

    public static Triangle Tri(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter first side of Triangle: ");
        double firstSide=scanner1.nextDouble();
        System.out.print("\n");
        System.out.print("Enter second side of Triangle: ");
        double secondSide=scanner1.nextDouble();
        System.out.print("\n");
        System.out.print("Enter third side of Triangle: ");
        double thirdSide=scanner1.nextDouble();
        System.out.print("\n");
        Triangle object1=new Triangle(firstSide, secondSide, thirdSide);
        return object1;
    }

    public static Square Squ(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter side of Square: ");
        double side=scanner1.nextDouble();
        System.out.print("\n");
        Square object1=new Square(side);
        return object1;
    }

    public static Circle Cir(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter radius of Circle: ");
        double rad=scanner1.nextDouble();
        System.out.print("\n");
        Circle object1=new Circle(rad);
        return object1;
    }

    public static void end(){
        System.out.print("\n");
        System.out.print("1. I will stay \nOther. Quit Program\n");
        System.out.print("Do You want exit?: ");
        Scanner exit = new Scanner(System.in);
        int a = exit.nextInt();
        if(a==1)
        {
            startMenu();
        }
        else
            System.exit(0);
    }



    public static void startMenu(){
        int optionChoice;
        System.out.print("Calculator of Area, Perimeter and Volume of Figures and Prisms:\n");
        System.out.print("1. Triangle\n");
        System.out.print("2. Square\n");
        System.out.print("3. Circle\n");
        System.out.print("4. Prism\n");
        System.out.print("Choose your option: ");
        Scanner scanner = new Scanner(System.in);
        optionChoice=scanner.nextInt();
        switch(optionChoice){
            case 1:{
                Triangle obj=Tri();
                obj.print();
                end();
                break;
            }

            case 2:{
                Square obj=Squ();
                obj.print();
                end();
                break;
            }

            case 3:{
                Circle obj=Cir();
                obj.print();
                end();
                break;
            }

            case 4:{
                Scanner scan3 = new Scanner(System.in);
                System.out.print("Choose base of prism:\n1.Triangle\n2.Square\n3.Circle\nEnter option: ");
                int sw= scan3.nextInt();
                switch(sw){
                    case 1:{
                        Triangle obj1=Tri();
                        System.out.print("\nEnter height of Prism: ");
                        Scanner sca = new Scanner(System.in);
                        double he=sca.nextDouble();
                        Prism obj2=new Prism(obj1,he);
                        obj2.print();
                        end();
                        break;
                    }
                    case 2:{
                        Square obj1=Squ();
                        System.out.print("\nEnter height of Prism: ");
                        Scanner sca = new Scanner(System.in);
                        double he=sca.nextDouble();
                        Prism obj2=new Prism(obj1,he);
                        obj2.print();
                        end();
                        break;
                    }
                    case 3:{
                        Circle obj1=Cir();
                        System.out.print("\nEnter height of Prism: ");
                        Scanner sca = new Scanner(System.in);
                        double he=sca.nextDouble();
                        Prism obj2=new Prism(obj1,he);
                        obj2.print();
                        end();
                        break;
                    }
                }
                end();
                break;

            }

            default:{
                System.out.print("Wrong option! Choose again!\n");
                        startMenu();
            }
        }
    }
}
