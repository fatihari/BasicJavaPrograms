package LcmAndGcdCalculator;

import java.util.Scanner;
/**
 *  @author Fatih ARI - 20.08.2021
 * 
 *  A program that finds the GCF (Greatest Common Factor) and LCM (Least Common Multiple) of the two entered numbers is designed.
 *
 *  GCF=(EBOB)
 *  LCM=(EKOK)=(n1*n2)/GCF 
 */

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = input.nextInt();
        System.out.print("Enter n2: ");
        int n2 = input.nextInt();
        input.close();
        int gcf = 1, lcm=1, max;
        if(n1>n2)
            max=n1;
        else
            max=n2;
        int i = max;

        while(i!=0)
        {
            if(n1 % i == 0 && n2 % i == 0)
            {
                gcf = i;
                break;
            }
            i--;
        }
        System.out.println("GCF is: " + gcf);
        lcm = (n1*n2)/gcf;
        System.out.println("LCM is: " + lcm);
        System.out.println("");
    }
}
