import java.util.Scanner;

/**
 * Created by Steve on 7/27/2017.
 */
public class LocatePrimeDriver {
    public static void main(String[] args) {

        LocateNthPrime();

    }

    private static void LocateNthPrime() {
        Validate validate = new Validate();

        do {
            findNthPrime();
        } while (validate.validateContinue());

        System.out.println("Have a nice day!");
    }

    private static void findNthPrime() {
        Validate validate = new Validate();
        LocatePrimes lp = new LocatePrimes();

        System.out.println("Let's locate some primes!\nEnter a number 'n' to find the nth prime: ");
        int userNum = validate.numberIsPositiveInteger(0);

        int prime = lp.locatePrime(userNum);

        if (userNum == 1){
            System.out.println("The " + userNum + "st prime number is " + prime);
        }else if (userNum == 2){
            System.out.println("The " + userNum + "nd prime number is " + prime);
        }else if (userNum == 3) {
            System.out.println("The " + userNum + "rd prime number is " + prime);
        }else{
            System.out.println("The " + userNum + "th prime number is " + prime);
        }
    }

}
