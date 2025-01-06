package leetcode

//https://leetcode.com/problems/counting-bits/description/?envType=problem-list-v2&envId=dynamic-programming
class Solution {
    fun countBits(n: Int): IntArray {
        val result = IntArray(n + 1)
        for (i in 0..n) {
            result[i] = i.countOneBits()
        }
        return result
    }
}
