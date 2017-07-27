/**
 * Created by Steve on 7/27/2017.
 */
public class LocatePrimes {

    //determines if the number in the locatePrime function is in fact prime.
    private static boolean isPrime(int n) {
        for (int i = 2; i < n; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int locatePrime(int userNum) {


        //iterates through all numbers starting at 2 (first prime) then counts the number of primes it has found.
        //once the number of primes is found (at i) is equal to user number for loop is done.
        int numOfPrimes = 0;
        int i;
        for (i = 2; numOfPrimes < userNum; i++) {
            if (isPrime(i)) {
                numOfPrimes++;
            }
        }
        //need to subtract 1 because of iterations.(Testing helped discover this)
        return i-1;
    }
}
