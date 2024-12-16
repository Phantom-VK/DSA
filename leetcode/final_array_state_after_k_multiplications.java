package leetcode;



//https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i/description
public class final_array_state_after_k_multiplications {

        public int[] getFinalState(int[] nums, int k, int multiplier) {
            for (int i = 0; i < k; i++) {
                int minIndex = 0;
                for (int j = 1; j < nums.length; j++) {
                    if (nums[j] < nums[minIndex]) {
                        minIndex = j;
                    }
                }
                nums[minIndex] *= multiplier;
            }
            return nums;
        }


}
