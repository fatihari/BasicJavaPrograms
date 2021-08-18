package LeapYearCalculator;
import java.util.Scanner;
/**
 *  @author Fatih ARI - 18.08.2021
 * 
 *  The program is designed to find whether the year the user entered is a leap year or not.
 *
 *  There are two rules:
 *  Leap years are years that are a multiple of 4, such as 1996, 2000, 2004, 2008, 2012, 2016, 2020.
 *  A year that is a multiple of 100 is a leap year if it is divisible by 400 without a remainder. 
 */

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        input.close();
        System.out.println(year + " is " + controlLeapYear(year));
    }

    private static String controlLeapYear(int year) 
    {   
        String yearStatus = "";
        if(year % 4 == 0 && year % 100 != 0)
            yearStatus = "\"leap year\".";
        else if(year % 400 == 0)
            yearStatus = "\"leap year\".";
        else
            yearStatus = "\"not a leap year\".";
        return yearStatus;
    }
}
