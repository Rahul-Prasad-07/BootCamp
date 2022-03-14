package com.company.Oop2;
import java.util.*;


    public class API {

        public static void main(String[] args) {


            APIimplements obj = new APIimplements();
            obj.CountNumber();
            obj.Payment();

        }
    }

    class APIimplements implements APIextension{

        @Override
        public void CountNumber() {
            System.out.println("Count the number of API running");
        }


        public void Payment(){
        System.out.println("Count the payment of API");
     }
    }

interface APIextension{
        void CountNumber();
        void Payment();
}


