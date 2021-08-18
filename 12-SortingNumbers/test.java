package SortingNumbers;

import java.util.Scanner;

/**
 *  @author Fatih ARI - 18.08.2021
 *  A program has been designed that sorts the 3 different numbers received from the user, 
 *  according to the user's request, from largest to smallest or from smallest to largest.
 * 
 *  It is expected to entered 1 for the smallest to the largest and 2 for the largest to the smallest.
 * 
 */

public class test {
    
    static short a, b, c, key, max=0, min=10000, median;
    static char maxLetter, minLetter, medianLetter;
    public static void gettingInput()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number \"a\": ");
        a = input.nextShort();
        System.out.print("Enter the number \"b\": ");
        b = input.nextShort();
        System.out.print("Enter the number \"c\": ");
        c = input.nextShort();
        System.out.print("\nEnter 1 for ascending order and 2 for descending order: ");
        key = input.nextShort();
        input.close();
    }
    public static void controlNumbers()
    {
        if(a > max){
            max = a;
            maxLetter = 'a';}
        if(b > max){
            max = b;
            maxLetter = 'b';}
        if(c > max){
            max = c;
            maxLetter = 'c';}
        if(a < min){
            min = a;
            minLetter = 'a';}
        if(b < min){
            min = b;
            minLetter = 'b';}
        if(c < min){
            min = c;
            minLetter = 'c';}
        if(max!=a && min!=a){
            median = a;
            medianLetter = 'a';}
        else if(max!=b && min!=b){
            median = b;
            medianLetter = 'b';}
        else if(max!=c && min!=c){
            median = c;
            medianLetter = 'c';}
    }
    public static void ascendingSort()
    {
        System.out.println("\n"+minLetter + " < " + medianLetter + " < " + maxLetter);
        System.out.println(min + " < " + median + " < " + max  + "\n");
    } 
    public static void descendingSort()
    {
        System.out.println("\n"+maxLetter + " > " + medianLetter + " > " + minLetter );
        System.out.println(max + " > " + median + " > " + min + "\n");
    } 

    public static void main(String[] args) 
    {
        gettingInput();
        controlNumbers();
        
        switch (key) {
            case 1:
                ascendingSort();
                break;
            case 2:
                descendingSort();
                break;
        
            default:
                System.out.println("You made the wrong choice.");
        }
    }

}