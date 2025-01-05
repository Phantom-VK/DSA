package leetcode;

//https://leetcode.com/problems/climbing-stairs/
public class ClimbingStairs {
    public int climbStairs(int n) {

        int prev1 = 1;
        int prev2 = 1;

        String str = "dasdasd";


        for (int i = 2; i <= n; ++i) {
            final int dp = prev1 + prev2;
            prev2 = prev1;
            prev1 = dp;
        }

        return prev1;
    }
}
