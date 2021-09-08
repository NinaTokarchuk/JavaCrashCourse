package Loops;

import java.util.ArrayList;
import java.util.List;

public class GapInPrimes {

    // Function check whether a number
    // is prime or not
    public static boolean isPrime(Long n) {
        // Check if number is less than
        // equal to 1
        if (n <= 1)
            return false;

            // Check if number is 2
        else if (n == 2)
            return true;

            // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;

        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static long[] gap(int g, long m, long n) {
        List<Long> primes = new ArrayList<Long>();
        for (Long k = m; k < n; k++) {
            if (isPrime(k)) {
                if (!primes.isEmpty()) {
                    if (k - primes.get(primes.size() - 1) == g)
                        return new long[]{primes.get(primes.size() - 1), k};
                }
                primes.add(k);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        long[] res = gap(8, 300, 400);
        for (long n : res)
            System.out.print(n + "   ");
    }
}
