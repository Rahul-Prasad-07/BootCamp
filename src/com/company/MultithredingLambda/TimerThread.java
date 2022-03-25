package com.company.MultithredingLambda;

import java.util.Scanner;

/*Description
Given a timer thread that prints the number of times a statement is running.
You need to complete the TimeClock class which calls the function printCurrentTime(),
n number of times. Here n is the input to the function.
Note: Understand and then complete the code.
You just need to complete the class definition. Don't perform any input or output operation.*/
public class TimerThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        TimeClock timer = new TimeClock(times);
        Thread timerThread = new Thread(timer);
        timerThread.start();
    }
}
class TimeClock implements Runnable {

    int times = 0;
    TimeClock(int n){

        times = n;
    }

    int count = 0; // you can use this variable
    @Override
    public void run() {
        try {
            while(count<times) {
                count++;
                // code here
                printCurrentTime(count);


                Thread.sleep(100);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void printCurrentTime(int number){
        System.out.println("PrintingTime-"+number);
    }
}
