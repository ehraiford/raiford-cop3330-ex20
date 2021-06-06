/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex20;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        String input = in.nextLine();
        double amount = Double.parseDouble(input);

        System.out.print("What state do you live in? ");
        String state = in.nextLine();

        String phrase = "The total is $";
        double taxRate = 0;
        if(state.compareTo("Wisconsin") == 0){
            System.out.print("What county do you live in? ");
            String county = in.nextLine();
            if(county.compareTo("Eau Claire") == 0){
                taxRate = 5.5;
            }else if(county.compareTo("Dunn") == 0){
                taxRate = 5.4;
            }else taxRate = 5;
        }else if(state.compareTo("Illinois") == 0){
            taxRate = 8;
        }

        if(taxRate != 0){
            double tax = taxRate * amount;
            tax = Math.ceil(tax) / 100;
            phrase = String.format("The tax is $%.2f.\nThe total is $", tax);
            amount = amount + tax;
        }

        phrase = phrase + String.format("%.2f.", amount);
        System.out.println(phrase);
    }
}
