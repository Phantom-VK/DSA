package leetcode;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/combinations/?envType=problem-list-v2&envId=backtracking
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(result, new ArrayList<>(),n, k, 1 );
        return result;
    }

    private void backTrack(List<List<Integer>> result, List<Integer> combination, int n, int k, int start) {
        if (combination.size() == k) {
            result.add(new ArrayList<>(combination));
            return;
        }

        for (int i = start; i <= n; i++) {
            combination.add(i);
            backTrack(result, combination, n, k, i + 1);
            combination.remove(combination.size() - 1);
        }
    }
}
