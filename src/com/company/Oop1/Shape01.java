package com.company.Oop1;


import java.util.Scanner;

class Shape {
        public void display() {
            System.out.println("display method overriding");
        }

    }

public class Shape01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Shape obj = new Triangle();
        Shape obj2 = new Circle();
        Shape obj1 = new Rectangle();
        int numberOfSides = in.nextInt();

        switch (numberOfSides) {
            case 0:
                obj2.display();
                break;
            case 3:
                obj.display();
                break;
            case 4:
                obj1.display();
                break;
            default:
                System.out.println("Enter a valid number of sides!");
                break;
        }
    }
   // create class of triangle,circle,rectangle
   // and create override method for display which is call by main class.
    static class Triangle extends Shape {
        int numberOfSides = 3;
        @Override
        public void display() {

            System.out.println("The shape is a triangle");
        }
    }

     static class Circle extends Shape {
         int numberOfSides = 0;
        @Override
        public void display() {

            System.out.println("The shape is a circle");
        }
    }

     static class Rectangle extends Shape {
         int numberOfSides = 4;
        @Override
        public void display() {

            System.out.println("The shape is a rectangle");

        }
    }
}
