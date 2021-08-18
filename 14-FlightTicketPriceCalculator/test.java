package FlightTicketPriceCalculator;

import java.util.Scanner;

/**
 *  @author Fatih ARI - 18.08.2021
 *  A program that calculates the air ticket price according to the distance, age, round-trip information that the user enters has been designed.
 *
 *  The fare per distance is taken as $0.10/km.
 *  First, the total price of the flight is calculated, and then discounts are applied according to the following conditions.
 * 
 *  Additional Information:
 *  From the values received from the user,
 *  Distance and age values should be positive numbers, trip type should be 1 or 2. 
 *  Otherwise, a warning should be given to the user as "You entered incorrect data".
 *  If the person is younger than 12 years old, 50% discount is applied on the ticket price.
 *  If the person is between the ages of 12-24, a 10% discount is applied on the ticket price.
 *  If the person is over 65 years old, a 30% discount is applied on the ticket price.
 *  If the person has chosen the "Journey Type" round trip, 20% discount is applied on the ticket price and then the total amount is multiplied by 2.
 * 
 */

public class test {
    public static void main(String[] args)
    {
        float totalPrice = 0.0f;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer distance in KM: ");
        short distance = input.nextShort();
        totalPrice += normalFlightPrice(distance);

        System.out.print("Enter your age: ");
        byte age = input.nextByte();
        totalPrice = ageDiscount(age, totalPrice);
        
        System.out.print("Enter flight type (1 => One Way, 2 => Round Trip): ");
        byte flightType = input.nextByte(); 
        totalPrice = flightDiscount(flightType, totalPrice);
        input.close();
        if(totalPrice>0)
            System.out.println("Total Price is $" + totalPrice);
        else
            System.out.println("You entered incorrect data. Please re-enter.");
    }
    private static float normalFlightPrice(short distance) 
    {
        float pricePerDistance = 0.10f;
        float normalPrice=0.0f; // The total price is set to 0 to give an error message if distance is not positive. 
        if(distance>0)
           normalPrice = pricePerDistance*distance;
     
        return normalPrice;   
    }
    private static float ageDiscount(byte age, float totalPrice)
    {
        if(age < 12 && age > 0)
        {
           totalPrice -= totalPrice * 50 / 100;
        }
        else if(age <= 24 && age >= 12)
        {
           totalPrice -= totalPrice * 10 / 100;
        }
        else if(age > 65)
        {
           totalPrice -= totalPrice * 30 / 100;
        }
        else if(age<1)
        {
            totalPrice = 0.0f; // The total price is set to 0 to give an error message if age is not positive. 
        }
        return totalPrice;
    }
    private static float flightDiscount(byte flightType, float totalPrice) 
    {
        // if flightType=1, then it is one way. if flightType=2, then it is round trip.
        if(flightType == 2)
        {
            totalPrice -= totalPrice * 20 / 100;
            totalPrice *= 2;
        }
        else if(flightType != 1 && flightType != 2)
        {
            totalPrice = 0.0f; // The total price is set to 0 to give an error message if flight type is not 1 or 2. 
        }
        return totalPrice;
    }
}
