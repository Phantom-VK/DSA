import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/combination-sum/?envType=problem-list-v2&envId=backtracking
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(result, new ArrayList<>(), candidates, target, 0, 0);
        return result;
    }

    private void backTrack(List<List<Integer>> result, List<Integer> currList, int[] candidates, int target, int idx, int total) {
        if (total == target) {
            result.add(new ArrayList<>(currList));
            return;
        }

        if (total > target) {
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            currList.add(candidates[i]);
            backTrack(result, currList, candidates, target, i, total + candidates[i]);
            currList.remove(currList.size() - 1);
        }
    }
}
