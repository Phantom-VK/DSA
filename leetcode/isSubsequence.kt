package leetcode

//https://leetcode.com/problems/is-subsequence/?envType=problem-list-v2&envId=dynamic-programming
class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var i = 0
        var j = 0
        while (i < s.length && j < t.length) {
            if (s[i] == t[j]) {
                i++
            }
            j++
        }
        return i == s.length
    }
}
