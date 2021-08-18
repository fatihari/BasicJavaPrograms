package GradeAverageCalculator;

/**
 *  @author Fatih ARI - 17.08.2021
 *  A program was prepared that calculates a simple grade point average without using the if condition.
 */

import java.util.Scanner;

public class test {
    
     static short mathematics, physics, chemistry, turkish, history, music;
     static float averageGrades;

    
    public static void calculateAverage()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the mathmatics grade: ");
        mathematics = input.nextShort();

        System.out.print("\nEnter the physics grade: ");
        physics = input.nextShort();

        System.out.print("\nEnter the chemistry grade: ");
        chemistry = input.nextShort();

        System.out.print("\nEnter the turkish grade: ");
        turkish = input.nextShort();

        System.out.print("\nEnter the history grade: ");
        history = input.nextShort();

        System.out.print("\nEnter the music grade: ");
        music = input.nextShort();

        input.close();
        
        averageGrades = (mathematics+physics+chemistry+turkish+history+music) / 6.0f;
        System.out.println("Average of Grades: " + averageGrades);

    }

    public static void successStatus()
    {
        //Writing conditional statements without if condition

        boolean status = averageGrades > 60.0;
        String str = (status) ? "Passed Class." : "Failed in Class.";
        System.out.println(str);
    }

    public static void main(String[] args) 
    {
        calculateAverage();
        successStatus();
    }

}
