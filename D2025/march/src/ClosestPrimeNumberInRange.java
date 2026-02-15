// 7-March
import java.util.ArrayList;
import java.util.List;

public class ClosestPrimeNumberInRange {
    public int[] closestPrimes(int left, int right) {
        List<Integer> primes = new ArrayList<> ();

        // Step 1: Find all primes in range [left, right]
        for (int i = left; i <= right; i++) {
            if (isPrime ( i )) {
                primes.add ( i );
            }
        }

        // Step 2: If less than 2 primes exist, return [-1, -1]
        if (primes.size () < 2) {
            return new int[]{-1, -1};
        }

        // Step 3: Find the closest prime pair
        int minDiff = Integer.MAX_VALUE;
        int[] result = new int[2];

        for (int i = 0; i < primes.size () - 1; i++) {
            int diff = primes.get ( i + 1 ) - primes.get ( i );
            if (diff < minDiff) {
                minDiff = diff;
                result[0] = primes.get ( i );
                result[1] = primes.get ( i + 1 );
            }
        }

        return result;
    }

    // Optimized O(√N) prime check
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {  // Check only up to sqrt(num)
            if (num % i == 0) return false;
        }
        return true;
    }
}