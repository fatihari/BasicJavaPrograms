package HoroscopeCalculator;
import java.util.Scanner;

/**
 *  @author Fatih ARI - 18.08.2021
 *  A program was designed to find the zodiac sign according to the month and day of birth of the user.
 * 
 *  Information:
 *  Aries	    March 21 - April 19
 *  Taurus	    April 20 - May 20
 *  Gemini	    May 21 - June 20
 *  Cancer	    June 21 - July 22
 *  Leo	        July 23 - August 22
 *  Virgo	    August 23 - September 22
 *  Libra	    September 23 - October 22
 *  Scorpio	    October 23 - November 21
 *  Sagittarius	November 22 - December 21
 *  Capricorn	December 22 - January 19
 *  Aquarius	January 20 - February 18
 *  Pisces	    February 19 - March 20 
 */
public class test {
    
    static byte day, month;
    static String horoscope;
    
    public static void gettingInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the birth day: ");
        day = input.nextByte();
        System.out.print("Enter the birth month: ");
        month = input.nextByte();
        input.close();
    }
    public static void controlNumbers()
    {
        if (month == 1){
            if (day < 20)
                horoscope = "Capricorn";
            else
                horoscope = "Aquarius";
        }     

        else if (month == 2){
            if (day < 19)
                horoscope = "Aquarius";
            else
                horoscope = "Pisces";
        } 
        else if(month == 3){
            if (day < 21)
                horoscope = "Pisces";
            else
                horoscope = "Aries";
        }
        else if (month == 4){
            if (day < 20)
                horoscope = "Aries";
            else
                horoscope = "Taurus";
        }
             
        else if (month == 5){
            if (day < 21)
                horoscope = "Taurus";
            else
                horoscope = "Gemini";
        }
             
        else if( month == 6){
            if (day < 21)
                horoscope = "Gemini";
            else
                horoscope = "Cancer";
        }
             
        else if (month == 7){
            if (day < 23)
                horoscope = "Cancer";
            else
                horoscope = "Leo";
        }
             
        else if( month == 8){
            if (day < 23)
                horoscope = "Leo";
            else
                horoscope = "Virgo";
        }
             
        else if (month == 9){
            if (day < 23)
                horoscope = "Virgo";
            else
                horoscope = "Libra";
        }
             
        else if (month == 10){
            if (day < 23)
                horoscope = "Libra";
            else
                horoscope = "Scorpio";
        }
             
        else if (month == 11){
            if (day < 22)
                horoscope = "Scorpio";
            else
                horoscope = "Sagittarius";
        }

        else if (month == 12){
            if (day < 22)
                horoscope = "Sagittarius";
            else
                horoscope ="Capricorn";
        }
             
        System.out.println("\nYour date of birth is " + day + "/" + month + "\n\nYour horoscope is " + horoscope + ".\n");


    }

    public static void main(String[] args) 
    {
        gettingInput();
        controlNumbers();
    }

}