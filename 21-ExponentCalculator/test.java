package ExponentCalculator;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the exponential number: ");
        int x = input.nextInt();

        System.out.print("Enter the power of the exponential number: ");
        int y = input.nextInt();
        input.close();
        int exponentialNumber=1;
       
        for(int i = 0; i < y; i++)
        {
            exponentialNumber *= x;
        }
        System.out.print("x^y = " + x + "^" + y + " = " + exponentialNumber);
    }
}
