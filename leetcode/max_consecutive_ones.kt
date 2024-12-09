///https://leetcode.com/problems/max-consecutive-ones/
class Solution2 {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var curr_max = 0 ; var max = 0
        for(num in nums){
            if(num == 1){
                curr_max++
                max = if(curr_max>max)curr_max else max
            }else{
                curr_max = 0
            }
        }
        return max
    }
}