package leetcode

//https://leetcode.com/problems/ransom-note/description/
class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val count = IntArray(26)

        for (c in magazine) {
            count[c - 'a']++
        }

        for (c in ransomNote) {
            if (count[c - 'a'] == 0) {
                return false
            }
            count[c - 'a']--
        }

        return true
    }
}
