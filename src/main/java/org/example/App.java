/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Doyon
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int principal, years, compound;
        float rate;
        Scanner inp = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        principal = inp.nextInt();
        System.out.print("What is the rate? ");
        rate = inp.nextFloat();
        System.out.print("What is the number of years? ");
        years = inp.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        compound = inp.nextInt();

        double conversion = principal * Math.pow(1 + ((rate/100)/compound), compound * years);
        System.out.print("$" + principal + " invested at " + rate + "% for " + years + " years compounded " + compound + " times per year is $" + String.format("%.02f", conversion) + ".");
    }
}
