package com.company.Oop;
import java.util.*;

public class SwordFighter01 {


    public static void main(String[] args) {
        //Interface variables are implicitly static and final
        System.out.println("Maximum swords that can be wielded: "+ SwordFighter.maxSwordsWielded);

        Knight knight = new Knight();
        Ninja ninja = new Ninja();

        knight.showWeapon();
        ninja.showWeapon();

        knight.attack();
        ninja.attack();

        knight.escape();
        ninja.escape();
    }

}

class Knight implements SwordFighter {

    @Override
    public void attack() {

        System.out.println("Knight stops the horse and attacks");
    }

    @Override
    public void escape() {
        System.out.println("Knight climbs the horse and flees");
    }

    // please write the showWeapon() method for the Knight class here.
    // It should print out "Shows Sword" in a new line
    public void showWeapon() {
        System.out.println("Shows Sword");
    }
}

class Ninja implements SwordFighter {

    @Override
    public void attack() {
        System.out.println("Ninja steps forward and attacks");
    }

    @Override
    public void escape() {
        System.out.println("Ninja gets into forest and flees");
    }

    @Override
    // please write the showWeapon() method for the Ninja class here.
    // It should print out "Shows Katana" in a new line
    public void showWeapon() {
        System.out.println("Shows Katana");
    }
}

