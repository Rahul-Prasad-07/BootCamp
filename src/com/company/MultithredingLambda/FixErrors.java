package com.company.MultithredingLambda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
Fix the bug in the code to print the counter values from 1 to 100, in the correct order.
Counter : 1
Counter : 2
...
Counter : 999
Counter : 1000
 */
public class FixErrors implements Runnable {

    private static int counter = 1;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            try{
                executorService.submit(new FixErrors()).get();
            }catch(Exception ex){

            }
        }
        executorService.shutdown();
    }
    @Override
    public void run() {
        while (counter <= 100) {
            increment();
        }
    }
    private void increment() {
        System.out.println("Counter : " + counter);
        counter++;
    }
}
