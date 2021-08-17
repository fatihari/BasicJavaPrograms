package BMICalculator;

import java.util.Scanner;

/**
 *  @author Fatih ARI - 17.08.2021
 *  A program has been designed that takes the height and weight values from the user and calculates the mass height index.
 *
 *  Additional Information:
 *  BMI Formula : Weight (kg) / Height (m) * Height (m) ;
 *
 */

public class test {
   
    public static short inputWeight;
    public static float inputHeight, bmiScore;
     
    public static void gettingInputs()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in meters : ");
        inputHeight = (float)input.nextFloat();

        System.out.print("Enter your weight in kilogram: ");
        inputWeight = input.nextShort();

        input.close();
    } 

    public static void calculateBmi()
    {
        bmiScore = inputWeight / (inputHeight * inputHeight);
        System.out.println("Your Body Mass Index is: " + bmiScore);
    }
   
    public static void main(String[] args) 
    {
        gettingInputs();
        calculateBmi();
    }
}
