/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Chris Mathew
 */
package base;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App
{
    private static final DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //input
        System.out.print("Enter the price of item 1: ");
        String price1 = in.nextLine();
        System.out.print("Enter the quantity of item 1: ");
        String quant1 = in.nextLine();
        System.out.print("Enter the price of item 2: ");
        String price2 = in.nextLine();
        System.out.print("Enter the quantity of item 2: ");
        String quant2 = in.nextLine();
        System.out.print("Enter the price of item 3: ");
        String price3 = in.nextLine();
        System.out.print("Enter the quantity of item 3: ");
        String quant3 = in.nextLine();
        //string conversion
        int p1 = Integer.parseInt(price1);
        int q1 = Integer.parseInt(quant1);
        int p2 = Integer.parseInt(price2);
        int q2 = Integer.parseInt(quant2);
        int p3 = Integer.parseInt(price3);
        int q3 = Integer.parseInt(quant3);

        //math processes
        double subtotal = (p1 * q1) + (p2 * q2) + (p3 * q3);
        double tax = subtotal * 0.055;
        double total = subtotal + tax;
        //string concat
        String outputString = "Subtotal: $" + df2.format(subtotal) + "\nTax: $" + df2.format(tax) + "\nTotal: $" + df2.format(total);

        //output
        System.out.println(outputString);
    }
}
