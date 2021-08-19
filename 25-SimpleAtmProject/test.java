package SimpleAtmProject;
import java.util.Scanner;
/**
 *  @author Fatih ARI - 19.08.2021
 * 
 * An ATM project is designed with loops, where the user can manage their bank account. 
 * 
 * General Rules:
 * The user has an initial balance of $1500.
 * The default username is "test" and the password is "123". 
 * User will be able to login to the system with username and password,
 * Every time you enter your password incorrectly, it will show the remaining rights on the screen. If user enters incorrectly three times, user's account will be blocked,
 * User able to deposit money,
 * able to withdraw money,
 * can inquire about the balance,
 * be able to log out of the system,
 * The system will leave a message when logging out. 
 */
public class test {
    static Scanner input = new Scanner (System.in);
    static int balance = 1500; //changeable variable
    static int amountOfMoney;
    static boolean flagMenu = false;
    public static void main(String[] args) {
        String username = "test", password = "123";
        String inputUsername="", inputPassword="";
        byte remainingRight = 3; 
        
        do 
        {   
            System.out.print("\nEnter your username: ");
            inputUsername = input.nextLine();
            System.out.print("Enter your password: ");
            inputPassword = input.nextLine();

            if(inputUsername.equals(username) && inputPassword.equals(password))
            {
                System.out.println("\nHello \" "+ inputUsername + "\"! You have successfully logged into the system. ");
                flagMenu = true;
                break;
            }
            else
            {
                remainingRight--;
                System.out.println("\nWrong username or password. Your remaining right is \""+ remainingRight + "\"");
                if(remainingRight==0)
                    System.out.println("Your account has been blocked.");
            }
        }
        while (remainingRight>0);

        while(flagMenu)
        {
            mainMenu();
        }
    }

    private static void mainMenu() 
    {
        Scanner inputMenu = new Scanner(System.in);
        System.out.println("This is main menu.");
        System.out.println("1-Deposit\n" +
                             "2-Withdraw\n" +
                             "3-Balance Query \n" +
                             "4-Log Out");
        System.out.print("Please select the action you want to take: ");
        String key = inputMenu.nextLine();
        
        switch (key) {
            case "1":
                deposit();
                break;
            case "2":
                withdraw();
                break;
            case "3":
                balanceQuery();
                break;
            case "4":
                System.out.println("\nSee you again.\n");
                flagMenu = false;
                break;
        
            default:
                break;
        }
    }

    private static void deposit() 
    {
        System.out.print("Enter the amount of money to deposit: ");
        amountOfMoney = input.nextInt();
        balance += amountOfMoney;
        System.out.println("\nThe deposit was successful. \n");
    }

    private static void withdraw() 
    {
        System.out.print("Enter the amount of money to withdraw: ");
        amountOfMoney = input.nextInt();
        
        if(balance - amountOfMoney >= 0){
            balance -= amountOfMoney;
            System.out.println("\nThe withdraw was successful. \n");
        }
        else
            System.out.println("\nThe withdrawal could not be made because you do not have enough balance. \n");
    }
    
    private static void balanceQuery() 
    {
        System.out.println("\nYour balance is: " + balance +"\n");
    }
   
}
