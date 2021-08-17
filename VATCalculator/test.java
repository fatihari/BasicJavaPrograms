package VATCalculator;


/**
 *  @author Fatih ARI - 17.08.2021
 *  A simple program has been designed that calculates the price received from the user with 18% VAT rate
 *  and prints the VAT price and VAT amount to the screen.
 */

import java.util.Scanner;

public class test {
    
    static short vatExclusive;
    static float vatInclusive, vatAmount, vatRate;
     
    public static void getAPrice()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price: ");
        vatExclusive = input.nextShort();

        input.close();

    } 

    public static void calculateVatInclusive()
    {
        vatRate = 0.18f;
        System.out.println("VAT Rate: " + vatRate);

        vatAmount = vatExclusive * vatRate;
        System.out.println("VAT Amount: " + vatAmount);

        vatInclusive = vatExclusive + vatAmount;
        System.out.println("Price Including VAT: " + vatInclusive);
    }

    public static void main(String[] args) 
    {
        getAPrice();
        calculateVatInclusive();
    }

}

