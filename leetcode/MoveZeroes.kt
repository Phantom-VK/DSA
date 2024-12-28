package leetcode

//https://leetcode.com/problems/move-zeroes/
class Solution {
    fun moveZeroes(nums: IntArray) {
        val n = nums.size
        var nonZeroIndex = 0

        for (i in 0 until n) {
            if (nums[i] != 0) {
                val temp = nums[nonZeroIndex]
                nums[nonZeroIndex] = nums[i]
                nums[i] = temp
                nonZeroIndex++
            }
        }
    }
}
