package CircleAreaAndPerimeterCalculator;


import java.util.Scanner;

/**
 *  @author Fatih ARI - 17.08.2021
 *  The program is designed to calculate the area and perimeter of the circle whose radius you get from the user by taking the Pi number 3.14. 
 *
 *  Additional Information:
 *  Area Formula : π * r * r;
 *  Perimeter Formula : 2 * π * r;
 *  Area of the Circle Sector Formula: (𝜋 * (r*r) * 𝛼) / 360
 */

public class test {
    
    static short inputRadius, inputAlphaDegree;
    static float areaCircle, perimeterCircle, piNumber, areaCircleSector;
     
    public static void gettingInputs()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Radius of circle is (m) : ");
        inputRadius = input.nextShort();
      
        System.out.print("The angle of circle is (alpha) : ");
        inputAlphaDegree = input.nextShort();


        input.close();
    } 

    public static void calculateCircleOperations()
    {
        piNumber = 3.14f; 
        areaCircle = piNumber * inputRadius * inputRadius;
        perimeterCircle = 2 * piNumber * inputRadius;
        areaCircleSector= piNumber * inputRadius * inputRadius * inputAlphaDegree / 360;

        System.out.println("Area of circle is: " + areaCircle);
        System.out.println("Perimeter of circle is: " + perimeterCircle);
        System.out.println("Area of the circle sector is: " + areaCircleSector);
    }

    public static void main(String[] args) 
    {
        gettingInputs();
        calculateCircleOperations();
    }
}

