package leetcode;
//https://leetcode.com/problems/divide-two-integers/description/
public class divide_two_ints {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        int output = 0;

        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        while (absDividend >= absDivisor) {
            long tempDivisor = absDivisor;
            int count = 1;

            while (absDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                count <<= 1;
            }

            absDividend -= tempDivisor;
            output += count;
        }

        return sign * output;

    }
}
