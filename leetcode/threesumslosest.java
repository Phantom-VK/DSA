package leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/3sum-closest/description/
public class threesumslosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int minDistance = Integer.MAX_VALUE;
        int closest = 0;

        for (int i = 0; i < n - 2; i++) {
            int j = i + 1, k = n - 1;

            while (j < k) {
                int currSum = nums[i] + nums[j] + nums[k];

                if (currSum == target) {
                    return currSum;
                }

                int newDist = Math.abs(currSum - target);
                if (newDist < minDistance) {
                    minDistance = newDist;
                    closest = currSum;
                }

                if (currSum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return closest;
    }
}
