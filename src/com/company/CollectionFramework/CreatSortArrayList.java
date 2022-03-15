package com.company.CollectionFramework;
import java.util.*;

public class CreatSortArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int [size]; //given array

        for(int i=0; i<size;i++)
            arr[i] = scanner.nextInt();


        ArrayList<Integer> list =  intoArrayList(arr);

        System.out.println(list);

    }
    public static ArrayList<Integer> intoArrayList(int arr[]){

        //complete the function here and return the arraylist
        // create an ArrayList & store all the elements of the array in the arraylist
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            arrayList.add(arr[i]);
        }
        //sorted arraylist
        arrayList.sort(Comparator.comparingInt(a->a));
        return arrayList;
    }

}

