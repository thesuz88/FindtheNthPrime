import java.util.Scanner;

/**
 * Created by Steve on 7/27/2017.
 */
public class Validate {
    Scanner scan = new Scanner(System.in);
    int userInt;

    //Validates the user inputs a positive integer
    public int numberIsPositiveInteger(int i) {
        boolean validInt = false;
        do {

            if (scan.hasNextInt()) {
                userInt = scan.nextInt();
                validInt = true;
                if (userInt < i) {
                    System.out.println("Not a positive integer. Please enter valid choice: ");
                    validInt = false;
                }
            } else {
                System.out.println("Not an integer. Please enter valid choice: ");
            }
            scan.nextLine();
        } while (!validInt);
        return userInt;
    }

    //Asks the user if they want to continue or quit
    public boolean validateContinue() {
        boolean isValid = false;

        do {
            System.out.println("Would you like to find another nth prime? (y/n)");
            String choice = scan.nextLine();

            if (choice.equalsIgnoreCase("y")) {
                isValid = true;
            } else if (choice.equalsIgnoreCase("n")) {
                return isValid;
            } else {
                System.out.println("Invalid entry, please type 'y' to continue or 'n' to quit.");
            }

        } while (!isValid);

        return isValid;
    }


}

