package learning;

public class Solution {
    public static void main(String[] args) {
        new Solution().numPrimeArrangements(15);
    }

    public int numPrimeArrangements(int n) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int primeCount = n >= 97 ? primes.length : 0;

        for (int i = 0; i < primes.length; ++i) {
            if (primes[i] >= n) {
                primeCount = primes[i] > n ? i : i + 1;
                break;
            }
        }

        return (int) (fact(primeCount) * fact(n - primeCount) % 1000000007);
    }

    public long fact(int num) {
        if (num <= 1) return 1;
        return (num * fact(num - 1)) % 1000000007;
    }
}