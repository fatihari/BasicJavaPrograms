package palindromicWordChecker;

import java.util.Scanner;

/** 
 * @author Fatih ARI - 25.08.2021
 * 
 *         A program is designed to find out whether the word entered by the user is "palindromic".
 *
 */

public class Main {
    public static void main(String[] args) {
        clearScreen();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = input.nextLine();
        boolean flag = false;
        if(checkPalindrom(str, flag))
            System.out.println("YES! The word \"" + str + "\" is a palindrome word.");
        else
            System.out.println("NO! The word \"" + str + "\" is NOT a palindrome word.");
        input.close();
    }

    private static boolean checkPalindrom(String str, boolean flag) 
    {
        for (int i = 0; i < str.length(); i++) 
        {
            if(str.charAt(i)==str.charAt(str.length()-i-1))
               flag = true;
            else
            {
                flag=false;
                break;
            }
        }
        return flag;
    }

    // It is used for console screen cleaning in Java.
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
