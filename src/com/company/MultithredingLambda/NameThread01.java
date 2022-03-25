package com.company.MultithredingLambda;

/*
Create a class named "NameThread" by extending the Thread class and print the thread names.
Now, create a thread of size 5 and verify how many different threads of type NameThread
 get created by calling it 20 times.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NameThread01 {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 20; i++) {
            // submit the NameThread instance
            executorService.submit( new NameThread());
        }
        executorService.shutdown();
        // Terminate the executor service
    }
}
class NameThread extends Thread{
    public void run(){
        // get thread's name here.
        Thread t = Thread.currentThread();
        String name = t.getName();
    }
}
