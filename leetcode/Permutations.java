package leetcode;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/permutations/description/?envType=problem-list-v2&envId=backtracking
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(result, nums, 0);
        return result;
    }

    private void backTrack(List<List<Integer>> result, int[] nums, int start) {
        int n = nums.length;
        if (start == n) {
            List<Integer> currentPermutation = new ArrayList<>();
            for (int num : nums) {
                currentPermutation.add(num);
            }
            result.add(currentPermutation);
            return;
        }

        for (int i = start; i < n; i++) {
            swap(nums, start, i);
            backTrack(result, nums, start + 1);
            swap(nums, start, i);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
