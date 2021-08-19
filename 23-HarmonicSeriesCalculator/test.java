package HarmonicSeriesCalculator;
import java.util.Scanner;
/**
 *  @author Fatih ARI - 19.08.2021
 * 
 *  The program is designed to find the sum of the harmonic series for the number "n" entered by the user. 
 * 
 */
public class test {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for the \"n\" value: ");
        int n = input.nextInt();
        float sumOfHarmonic = 0.0f;
        input.close();
        for (int i = 1; i <= n; i++) {
            sumOfHarmonic += 1.0/i;
        }
        System.out.println("\nThe harmonic series partial sum of the entered n = " + n + " number is \"" + sumOfHarmonic + "\".\n");
    }
}
