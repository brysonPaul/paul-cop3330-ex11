/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Bryson Paul
 */
package org.example;

import java.util.Scanner;
public class App {
    public static void main( String[] args ) {
        Scanner sc= new Scanner(System.in);
        int amtOfEuros = Integer.parseInt( strIO("How many euros are you exchanging? ",sc) );
        float conversionRate = Float.parseFloat(strIO("What is the exchange rate? ", sc));
        float amtOfUSD = amtOfEuros * conversionRate;
        String DollarsRounded= String.format("%.02f",amtOfUSD);
        System.out.println( amtOfEuros + " euros at an exchange rate of " + conversionRate + " is\n" + DollarsRounded + " U.S. dollars.");
    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}
