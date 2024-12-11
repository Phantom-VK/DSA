package leetcode;

// https://leetcode.com/problems/max-consecutive-ones/submissions/1453273006/
class max_consecutive_ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curr_max = 0 , max = 0;

        for(int i : nums){
            if(i == 1){
                curr_max++;
                if(curr_max > max){max =  curr_max;}
            }else{
                curr_max = 0;
            }
        }
        return max;
    }
}