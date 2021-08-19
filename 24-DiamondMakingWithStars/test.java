package DiamondMakingWithStars;
/**
 *  @author Fatih ARI - 19.08.2021
 * 
 * A diamond shape with stars is designed using for loops.
 
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    * 

 */

public class test {
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 5; i++) 
        {            
            for (int j = 5-i; j >= 0 ; j--) 
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 4; i >= 1; i--) 
        {            
            for (int j = 0; j <= 5-i ; j++) 
            {
                System.out.print(" ");
            }
            for (int j = (2*i-1); j >= 1 ; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
