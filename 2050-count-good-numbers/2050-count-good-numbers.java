class Solution {
    private static final int MOD = 1000000007;

    public static int countGoodNumbers(long n) {
        // Helper recursive function for modular exponentiation
        return (int) ((modularExponentiation(5, (n + 1) / 2) * modularExponentiation(4, n / 2)) % MOD);
    }

    private static long modularExponentiation(long base, long exponent) {
        if (exponent == 0) {
            return 1; // Base case: any number to the power of 0 is 1
        }

        long half = modularExponentiation(base, exponent / 2);
        long halfSquared = (half * half) % MOD;

        if (exponent % 2 == 0) {
            return halfSquared; // If exponent is even
        } else {
            return (halfSquared * base) % MOD; // If exponent is odd
        }
    }
}