package com.company.Oop1;
import java.util.*;

public class Bank {

    public static void main (String[]args)
    {

        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        int principle_amount = scanner.nextInt ();
        int time = scanner.nextInt ();

        if (n == 1)
        {
            IBank obj = new IBank();
            System.out.println(obj.InterestCalculator(principle_amount, time));
        }
        else if (n == 2)
        {
            JBank obj = new JBank();
            System.out.println(obj.InterestCalculator(principle_amount, time));
        }
        else if (n == 3)
        {
            KBank obj = new KBank();
            System.out.println(obj.InterestCalculator(principle_amount, time));
        }
        else
        {
            System.out.println ("Please enter correct choice");}
    }
}

abstract class RBI
{
    abstract int InterestCalculator (int x, int y);
}

class IBank extends RBI
{
    int interest = 7;
    int ans = 0;
    int InterestCalculator (int principle_amount, int time)
    {
        ans = principle_amount * time * interest/100;
        return ans;
    }
}

class JBank extends RBI
{
    int interest = 8;
    int ans = 0;
    int InterestCalculator (int principle_amount, int time)
    {
        ans = principle_amount * time * interest/100;
        return ans;
    }
}

class KBank extends RBI
{
    int interest = 9;
    int ans = 0;
    int InterestCalculator (int principle_amount, int time)
    {
        ans = principle_amount * time * interest/100;
        return ans;
    }
}




