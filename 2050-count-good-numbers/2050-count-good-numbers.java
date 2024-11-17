class Solution {
    private static final int MOD = 1000000007;

    public static int countGoodNumbers(long n) {
        return (int) ((modularExponentiation(5, (n + 1) / 2) * modularExponentiation(4, n / 2)) % MOD);
    }

    private static long modularExponentiation(long base, long exponent) {
        if (exponent == 0) {
            return 1;
        }

        long half = modularExponentiation(base, exponent / 2);
        long halfSquared = (half * half) % MOD;

        if (exponent % 2 == 0) {
            return halfSquared;
        } else {
            return (halfSquared * base) % MOD;
        }
    }
}