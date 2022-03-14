package com.company.Oop2;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Food{
    Food(){
        System.out.println("Food: Eat");
    }
}

class Spanish extends Food {
    Spanish(){
        System.out.println("Type: Spanish");
    }
}
class Dish extends Spanish {
    public Dish() {
        System.out.println("Have: Gazpacho");

    }
}
public class FoodDish  {

        public static void main(String[] args) {
            Dish bird = new Dish();
        }
    }

// Define the third class here.

