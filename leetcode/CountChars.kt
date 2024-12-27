package leetcode
//https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/description/
class Solution {
    fun countCharacters(words: Array<String>, chars: String): Int {
        var output = 0

        val charsCount = IntArray(26)
        for (c in chars) {
            charsCount[c - 'a']++
        }

        for (word in words) {
            val wordCount = IntArray(26)
            for (c in word) {
                wordCount[c - 'a']++
            }

            if (word.all { wordCount[it - 'a'] <= charsCount[it - 'a'] }) {
                output += word.length
            }
        }

        return output
    }
}
