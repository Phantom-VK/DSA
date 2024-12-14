package leetcode;
//https://leetcode.com/problems/maximum-score-after-splitting-a-string/description/
public class max_score_after_splitting_string {

    public int maxScore(String s) {
        int n = s.length();
        int[] zeros = new int[n];
        int[] ones = new int[n];

        for (int i = 0; i < n; i++) {
            zeros[i] = (i > 0 ? zeros[i - 1] : 0) + (s.charAt(i) == '0' ? 1 : 0);
        }

        for (int i = n - 1; i >= 0; i--) {
            ones[i] = (i + 1 < n ? ones[i + 1] : 0) + (s.charAt(i) == '1' ? 1 : 0);
        }

        int maxScore = 0;
        for (int i = 1; i < n; i++) {
            maxScore = Math.max(maxScore, zeros[i - 1] + ones[i]);
        }

        return maxScore;
    }
}
