package boxingMatch;

/**
 * @author Fatih ARI - 22.08.2021
 * 
 *         A program that simulates a boxing match with classes has been
 *         designed.
 * 
 */

public class Main {
    public static void main(String[] args) {
        clearScreen();
        Fighter marc = new Fighter("Marc", 15, 100, 90, 20);
        Fighter alex = new Fighter("Alex", 10, 80, 100, 40);
        Ring r = new Ring(marc, alex, 90, 100);
        r.run();
    }

    // It is used for console screen cleaning in Java.
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
