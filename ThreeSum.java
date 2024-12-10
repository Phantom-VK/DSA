import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/3sum/
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arr = new ArrayList<>();
        int n = nums.length;

        if(n == 0){
            return arr;
        }

        for(int i = 0; i < n-2; i++){

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int j = i + 1, k = n-1;
            while(j < k){

                int current_sum = nums[i] + nums[j] + nums[k];
                if(current_sum == 0){

                    arr.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;

                    j++;
                    k--;
                }else if(current_sum < 0){
                    j++;
                }else{
                    k--;
                }
            }

        }

        return arr;


    }
}
