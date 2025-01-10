package leetcode

//https://leetcode.com/problems/word-subsets/description/
class Solution {
    fun wordSubsets(words1: Array<String>, words2: Array<String>): List<String> {
        val maxFreq = IntArray(26)
        for (b in words2) {
            val bFreq = IntArray(26)
            for (c in b) {
                bFreq[c - 'a']++
                maxFreq[c - 'a'] = maxOf(maxFreq[c - 'a'], bFreq[c - 'a'])
            }
        }

        val result = mutableListOf<String>()
        for (a in words1) {
            val aFreq = IntArray(26)
            for (c in a) {
                aFreq[c - 'a']++
            }
            if (isUniversal(aFreq, maxFreq)) {
                result.add(a)
            }
        }
        return result
    }

    private fun isUniversal(aFreq: IntArray, maxFreq: IntArray): Boolean {
        for (i in 0..25) {
            if (aFreq[i] < maxFreq[i]) {
                return false
            }
        }
        return true
    }
}
