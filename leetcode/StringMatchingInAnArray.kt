package leetcode


//https://leetcode.com/problems/string-matching-in-an-array/?envType=daily-question&envId=2025-01-07
class Solution {
    fun stringMatching(words: Array<String>): List<String> {
        val result = mutableListOf<String>()
        for (word in words) {
            for (word2 in words) {
                if (word != word2 && word.length < word2.length && word2.contains(word)) {
                    result.add(word)
                    break
                }
            }
        }
        return result
    }
}
