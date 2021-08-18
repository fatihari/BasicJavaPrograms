package ChineseZodiacSignCalculator;
import java.util.Scanner;
/**
 *  @author Fatih ARI - 18.08.2021
 *  The program is designed to take the birth date from the user and calculate the Chinese Zodiac sign value.
 * 
 *  When calculating the Chinese zodiac, it is based on the remainder of the 12th division of the person's birth year.

 *  Year of Birth 12% = 0 ➜ Monkey
 *  Year of Birth 12% = 1 ➜ Rooster
 *  Year of Birth 12% = 2 ➜ Dog
 *  Year of Birth 12% = 3 ➜ Pig
 *  Year of Birth 12% = 4 ➜ Rat
 *  Year of Birth 12% = 5 ➜ Ox
 *  Year of Birth 12% = 6 ➜ Tiger
 *  Year of Birth 12% = 7 ➜ Rabbit
 *  Year of Birth 12% = 8 ➜ Dragon
 *  Year of Birth 12% = 9 ➜ Snake
 *  Year of Birth 12% = 10 ➜ Horse
 *  Year of Birth 12% = 11 ➜ Sheep
 */
public class test {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birthyear: ");
        int birthyear = input.nextInt();
        input.close();
        String animal = findZodiacSign(calculateModular(birthyear));
        System.out.println("Your Chinese Zodiac sign is \"" + animal + "\"\n");
    }

    private static int calculateModular(int birthyear) 
    {
        return birthyear % 12;
    }
    private static String findZodiacSign(int calculateModular) 
    {   
        String animal = "";
        switch (calculateModular) 
        {
            case 0:
                animal = "Monkey"; 
                break;
            case 1:
                animal = "Rooster"; 
                break;
            case 2:
                animal = "Dog"; 
                break;
            case 3:
                animal = "Pig"; 
                break;
            case 4:
                animal = "Rat"; 
                break;
            case 5:
                animal = "Ox"; 
                break;
            case 6:
                animal = "Tiger"; 
                break;
            case 7:
                animal = "Rabbit"; 
                break;
            case 8:
                animal = "Dragon"; 
                break;
            case 9:
                animal = "Snake"; 
                break;
            case 10:
                animal = "Horse"; 
                break;
            case 11:
                animal = "Sheep"; 
                break;
        
            default:
                break;
        }
        return animal;
    }
}
