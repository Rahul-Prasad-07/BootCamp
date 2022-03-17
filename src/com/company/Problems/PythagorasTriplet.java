package com.company.Problems;

import java.util.ArrayList;
import java.util.Scanner;
public class PythagorasTriplet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        // create 2D array for number of rows = size and 3 columns = x,y,z
        int arr[][] = new int[size][3];
        int x = 0, y = 0, z = 0;

        for (int i =0; i<size; i++){
            arr[i][0]=scanner.nextInt();
            arr[i][1]=scanner.nextInt();
            arr[i][2]=scanner.nextInt();
        }
        for (int i=0; i<size; i++){
            x=(arr[i][0])*(arr[i][0]);
            y=(arr[i][1])*(arr[i][1]);
            z=(arr[i][2])*(arr[i][2]);

            if(x+y==z){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }

    }
}
