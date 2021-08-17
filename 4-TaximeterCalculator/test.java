package TaximeterCalculator;

import java.util.Scanner;

/**
 *  @author Fatih ARI - 17.08.2021
 *  A program that prints the taximeter amount on the screen according to the distance traveled (KM) has been designed.
 *
 *  Additional Information:
 *  Taximeter costs 2.20 TL per km.
 *  The minimum amount to be paid is 20 TL. 20 TL will be charged for the fees below 20 TL.
 *  Taximeter opening fee is 10 TL.
 *  
 */

public class test {
    
    static short distanceTraveled ;
    static float unitFee, feePayable;
     
    public static void gettingInput()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Distance Traveled (KM) is: ");
        distanceTraveled = input.nextShort();
      
        input.close();
    } 

    public static void calculateFeePayable()
    {
        unitFee = 2.20f;
        feePayable = 10 + unitFee * distanceTraveled;
        boolean status = feePayable >= 20;
        feePayable = (status) ? feePayable : 20;
        System.out.println("Fee Payable: " + feePayable);
    }

    public static void main(String[] args) 
    {
        gettingInput();
        calculateFeePayable();
    }
}
