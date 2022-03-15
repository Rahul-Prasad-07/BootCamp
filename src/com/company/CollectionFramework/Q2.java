package com.company.CollectionFramework;

public class Q2 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[200];
            arr[234] = 90 + 4 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("1");
        } catch (ArithmeticException e) {
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("3");
        }
    }
}
