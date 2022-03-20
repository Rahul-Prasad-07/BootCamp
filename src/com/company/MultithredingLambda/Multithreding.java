package com.company.MultithredingLambda;

public class Multithreding {
    public static void main(String args[])
    {
        Thread t = Thread.currentThread();
        System.out.println(t.getPriority());
    }
}
