package com.company.Oop2;


public class InheritanceExmp {
        public static void main(String[] args) {

            Add a = new Add();
            System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
            System.out.print(a.Adding(1,2) + " " + a.Adding(3,4) + " " + a.Adding(5,6,7) + "\n");

        }

    }

class Add extends MathClass {

}
class MathClass {

    public int Adding(int i, int i1) {
        return i+i1;
    }

    int Adding (int a, int b, int c){
        int sum = a+b+c;
        return sum;
    }
}

