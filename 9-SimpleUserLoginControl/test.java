package SimpleUserLoginControl;

import java.util.Scanner;

/**
 *  @author Fatih ARI - 17.08.2021
 *  Login control and password reset processes of a user whose user name is "test" by default and "123" as password is designed.
 *
 */

public class test {
    
    static String username="test", password="123";
    static String inputUsername, inputPassword, newPassword, key;
    static Scanner input = new Scanner(System.in);
    public static void gettingInputs()
    {
        
        System.out.print("Enter username: ");
        inputUsername = input.nextLine();
        System.out.print("Enter password: ");
        inputPassword = input.nextLine();
       // input.close();
    }

    public static void controlInformation()
    {
        
        if(inputUsername.equals(username)  && inputPassword.equals(password))
        {
            System.out.println("You have successfully logged in. ");
        }
        else if(!inputUsername.equals(username))
        {
            System.out.println("There is no username named "+ inputUsername  + " in the system. ");
        }
        else if(inputUsername.equals(username) && !inputPassword.equals(password))
        {  
            System.out.print("Your password is incorrect. Enter 1 to re-enter, 2 to renew: ");
            key = input.nextLine();

            switch (key) {
                case "1":
                    System.out.print("Your password is: ");
                    inputPassword = input.nextLine();
                    if(inputPassword.equals(password))
                    {
                        System.out.println("You have successfully logged in. ");
                        break;
                    } //If not equal, the password will be reset. So it will switch to case 2.  
                    System.out.println("You entered your password incorrectly twice in a row.\nYour password will be reset. ");

                case "2":
                    System.out.print("Your new password is: ");
                    newPassword = input.nextLine();
                    
                    if(!newPassword.equals(inputPassword) && !newPassword.equals(password))
                    {
                        System.out.println("Your new password is " + newPassword);
                        break;
                    }
                    else
                    {
                        System.out.println("Your password cannot be the same as an incorrectly entered or old password. Please enter a different password. ");
                        System.out.print("Your new password is: ");
                        newPassword = input.nextLine();
                        if(!newPassword.equals(inputPassword) && !newPassword.equals(password))
                        {
                            System.out.println("Your password has been updated to " + newPassword + ".");
                            break;
                        }
                        else
                        {
                            System.out.println("Your password cannot be the same as an incorrectly entered or old password.\nSo your password reset has expired. Have a good day.");
                            break;
                        }
                    }

                default:
                    System.out.println("You made an incorrect entry.");
                    break;
            }
            
        }
        input.close();
    }
    
    public static void main(String[] args) {
        gettingInputs();
        controlInformation();
    }

}
