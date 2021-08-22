package salaryCalculator;

/**
 * @author Fatih ARI - 23.08.2021 A class named "Employee" is designed that
 *         represents factory workers and calculates employee salaries with its
 *         methods.
 */
public class Main {
    public static void main(String[] args) {
        clearScreen();
        Employee e1 = new Employee("Kazım Usta", 2000.00f, 45, 1985);
        System.out.println(e1);
    }

    // It is used for console screen cleaning in Java.
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
