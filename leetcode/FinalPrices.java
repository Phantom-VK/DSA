package leetcode;
//https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/description/?envType=daily-question&envId=2024-12-26
public class FinalPrices {

    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] result = prices.clone();
        int top = -1;

        int[] stack = new int[n];

        for (int i = 0; i < n; i++) {
            while (top >= 0 && prices[stack[top]] >= prices[i]) {
                result[stack[top--]] -= prices[i];
            }
            stack[++top] = i;
        }

        return result;
    }
}
