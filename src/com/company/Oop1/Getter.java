package com.company.Oop1;

public class Getter {
        public static void main(String[] args) {

            // Write code here
            Person p1 = new Person("Ankit");
            System.out.println(p1.getName());

        }
    }

    class Person {
        private String name;
        public Person(String name) {
            this.name = name;
        }

        // Declare a getter method here

        public String getName() {
            return name;
        }
    }


