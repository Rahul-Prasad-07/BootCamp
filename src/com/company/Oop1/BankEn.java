package com.company.Oop;
import java.util.*;


    class SavingAmount {
        //write your code here
        int saving;

        public void setInitialSaving(int nextInt) {
        }


        public int incrementSaving() {
            int num = 1000;
            return (saving + num);
        }

        public int decrementSaving() {
            return saving - 100;
        }

        public void checkSaving() {
            int SavingAmount = 0;
            if(SavingAmount >= 1000){
                System.out.println("Congratulations! You have saved a good amount");
            }else if (SavingAmount < 1000 ){
                System.out.println("Insufficient saving!");
            }else if (SavingAmount < 0){
                System.out.println("You are in debt");
            }
        }

        public int getCurrentSaving() {
            return saving;
        }
    }


    public class BankEn {
        public static void main(String[] args) {

            SavingAmount obj = new SavingAmount();
            Scanner in = new Scanner(System.in);
            obj.setInitialSaving(in.nextInt());
            obj.decrementSaving();
            obj.incrementSaving();
            obj.checkSaving();
            System.out.println("Your current savings are Rs" +" "+ obj.getCurrentSaving());

        }

    }
