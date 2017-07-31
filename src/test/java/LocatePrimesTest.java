import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Steve on 7/27/2017.
 */
public class LocatePrimesTest {
    @Test
    public void locate1stPrime() throws Exception {

        LocatePrimes lp = new LocatePrimes();
        int expected = 2;
        int actual = lp.locatePrime(1);
        assertEquals("Did not work", expected, actual);
    }

    @Test
    public void locate2ndPrime() throws Exception {

        LocatePrimes lp = new LocatePrimes();
        int expected = 3;
        int actual = lp.locatePrime(2);
        assertEquals("Did not work", expected, actual);
    }

    @Test
    public void locateNthPrime() throws Exception {

        LocatePrimes lp = new LocatePrimes();
        int expected = 29;
        int actual = lp.locatePrime(10);
        assertEquals("Did not work", expected, actual);
    }
    
    @Test
    public void locateInvalidPrime() throws Exception {
        LocatePrimes lp = new LocatePrimes();
        String expected = "Not a positive integer. Please enter valid choice: ";
        int actual = lp.locatePrime(-1);
        assertEquals("Did not work", expected,actual);
    }
}