package leetcode

//https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/description/?envType=problem-list-v2&envId=hash-table
class Solution {
    fun areOccurrencesEqual(s: String): Boolean {

        val charCountMap = mutableMapOf<Char, Int>()

        for (c in s) {
            charCountMap[c] = charCountMap.getOrDefault(c, 0) + 1
        }

        val firstCount = charCountMap.values.firstOrNull() ?: return true
        return charCountMap.values.all { it == firstCount }
    }
}
