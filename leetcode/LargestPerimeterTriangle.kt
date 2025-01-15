package leetcode

//https://leetcode.com/problems/largest-perimeter-triangle/description/?envType=problem-list-v2&envId=greedy
class Solution {
    fun largestPerimeter(nums: IntArray): Int {
        nums.sort()

        for (i in nums.size - 3 downTo 0) {
            if (nums[i] + nums[i + 1] > nums[i + 2]) {
                return nums[i] + nums[i + 1] + nums[i + 2]
            }
        }

        return 0
    }
}
