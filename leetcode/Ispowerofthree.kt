package leetcode

//https://leetcode.com/problems/power-of-three/description/?envType=problem-list-v2&envId=math
class Solution {
    fun isPowerOfThree(n: Int): Boolean {
        return n > 0 && 1162261467 % n == 0
    }
}
