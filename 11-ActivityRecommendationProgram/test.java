package ActivityRecommendationProgram;
import java.util.Scanner;

/**
 *  @author Fatih ARI - 18.08.2021
 *  An activity recommendation program was designed according to the air temperature.
 *  The user must enter a temperature value.
 * 
 *  Conditions:
 *  Suggest to "Ski" if the temperature is less than 5.
 *  Suggest the "Cinema" event if the temperature is between 5 and 15.
 *  Suggest the "Picnic" event if the temperature is between 15 and 25.
 *  Suggest the "Swimming" event if the temperature is greater than 25. 
 */

public class test {
    
    static short temperature;
    
    public static void gettingInput()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature degree: ");
        temperature = input.nextShort();
        input.close();
    }

    public static void recommendEvent()
    {
        if(temperature < 5)
            System.out.print("The weather is "+ temperature + " degree. It's too cold.\nYou can start preparing for \"skiing.\" ");

        else if(temperature >= 5 && temperature < 15)
            System.out.print("The weather is "+ temperature + " degree. It's cold.\nYou can go to \"cinema.\" ");
        
        else if(temperature == 15)
            System.out.print("The weather is "+ temperature + " degree. It's warm.\nYou can go to \"cinema.\" or You can have a \"picnic.\" ");

        else if(temperature > 15 && temperature <= 25)
            System.out.print("The weather is "+ temperature + " degree. It's warm.\nYou can have a \"picnic.\" ");

        else if(temperature > 25 )
            System.out.print("The weather is "+ temperature + " degree. It's hot.\nYou can \"swim.\" ");

    }

    public static void main(String[] args) 
    {
        gettingInput();
        recommendEvent();
    }

}
