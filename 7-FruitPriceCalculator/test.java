package FruitPriceCalculator;

import java.util.Scanner;

/**
 *  @author Fatih ARI - 17.08.2021
 *  A program that prints the total price on the screen according to the kilogram values of the products purchased by the users from the grocery store has been designed.
 *
 *  Kilogram prices of fruits: 
 * 
 *  Pear: 2.14 $
 *  Apple: 3.67 $
 *  Tomatoes: 1.11 $
 *  Banana: 0.95 $
 *  Eggplant: 5.00 $
 *
 */

public class test {

    static short kgPear, kgApple, kgTomatoes, kgBanana, kgEggplant;
    static float pricePear, priceApple, priceTomatoes, priceBanana, priceEggplant;
    static float totalPrice;

    public static void gettingInputs()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("How many kilograms of pears will you buy?");
        kgPear = input.nextShort();

        System.out.println("\nHow many kilograms of apples will you buy?");
        kgApple = input.nextShort();

        System.out.println("\nHow many kilograms of tomatoes will you buy?");
        kgTomatoes = input.nextShort();

        System.out.println("\nHow many kilograms of bananas will you buy?");
        kgBanana = input.nextShort();

        System.out.println("\nHow many kilograms of eggplant will you buy?");
        kgEggplant = input.nextShort();

        input.close();
    }

    public static void calculateTotalPrice()
    {
        pricePear = 2.14f;
        priceApple = 3.67f;
        priceTomatoes = 1.11f;
        priceBanana = 0.95f;
        priceEggplant = 5.00f;

        totalPrice = pricePear*kgPear + priceApple*kgApple + priceTomatoes*kgTomatoes + priceBanana*kgBanana + priceEggplant*kgEggplant;
        System.out.println("Total fee is " + totalPrice);
    }

    public static void main(String[] args) {
        gettingInputs();
        calculateTotalPrice();
    }

}
