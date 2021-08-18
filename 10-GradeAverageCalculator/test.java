package GradeAverageCalculator;

/**
 *  @author Fatih ARI - 18.08.2021
 *  A simple program was prepared that calculates the grade point average of the courses with the if condition.
 *  If the average score is below 55, it will be written "Failed in Class", and above it, "Passed the Class".
 *  If the entered course grade is not between 0 and 100, the grade will be assumed to be 0.
 *
 */

import java.util.Scanner;

public class test {
    
     static short mathematics, physics, turkish, chemistry, music;
     static float averageGrades;

    
    public static void calculateAverage()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the mathmatics grade: ");
        mathematics = input.nextShort();
        if(mathematics<0 || mathematics>100)
            mathematics = 0;

        System.out.print("\nEnter the physics grade: ");
        physics = input.nextShort();
        if(physics<0 || physics>100)
            physics = 0;

        System.out.print("\nEnter the turkish grade: ");
        turkish = input.nextShort();
        if(turkish<0 || turkish>100)
            turkish = 0;

        System.out.print("\nEnter the chemistry grade: ");
        chemistry = input.nextShort();
        if(chemistry<0 || chemistry>100)
            chemistry = 0;

        System.out.print("\nEnter the music grade: ");
        music = input.nextShort();
        if(music<0 || music>100)
            music = 0;

        input.close();
        
        averageGrades = (mathematics+physics+chemistry+turkish+music) / 5.0f;
        System.out.println("Average of Grades: " + averageGrades);
    }

    public static void successStatus()
    {
        //Writing conditional statements with if condition
        if(averageGrades>=55)
        {
            System.out.println("Passed Class.");
        }
        else
        {
            System.out.println("Failed in Class.");
        }
    }

    public static void main(String[] args) 
    {
        calculateAverage();
        successStatus();
    }

}