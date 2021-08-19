package CombinationCalculator;

import java.util.Scanner;

/**
 *  @author Fatih ARI - 19.08.2021
 * 
 * A program that calculates the r combination of n with n and r values received from the user is designed.
 * 
 */

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter \"n\" value: ");
        int n = input.nextInt();
        System.out.print("Enter \"x\" value: ");
        int x = input.nextInt();
        input.close();
        System.out.println("C(n,x)=C(" + n + "," + x + ")=" + calculateCombinaton(n, x));
    }
    private static int calculateCombinaton(int n, int x) 
    {
        return facto(n) / (facto(x) * facto(n-x));
    }

    private static int facto(int k)
    {
        int factorialProduct = 1 ;
        for (int i = 1; i <= k; i++) {
            factorialProduct *= i;
        }
        return factorialProduct;
    }
}
