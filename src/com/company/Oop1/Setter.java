package com.company.Oop1;
import java.util.*;

    class Setter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();
            Person01 p = new Person01();
            p.setName(name);
            System.out.println(p.getName());
        }
    }

    class Person01 {
        private String name;
        public String getName() {
            return name;
        }
     //Define setters here.

        public void setName(String name) {
            this.name = name;
        }
    }

