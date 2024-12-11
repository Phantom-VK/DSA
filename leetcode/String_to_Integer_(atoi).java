package leetcode;

//https://leetcode.com/problems/string-to-integer-atoi/
class String_to_Integer {
    public int myAtoi(String s) {
        int result = 0;
        boolean isNegative = false;
        int i = 0;
        s = s.trim();
        int n = s.length();

        if (s.isEmpty()) {
            return 0;
        }

        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            isNegative = (s.charAt(i) == '-');
            i++;
        }

        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return isNegative ? -result : result;
    }
}
