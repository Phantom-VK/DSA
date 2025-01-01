package leetcode

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/?envType=problem-list-v2&envId=backtracking
class Solution {
    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) return emptyList()

        val map = hashMapOf(
            '2' to listOf("a", "b", "c"),
            '3' to listOf("d", "e", "f"),
            '4' to listOf("g", "h", "i"),
            '5' to listOf("j", "k", "l"),
            '6' to listOf("m", "n", "o"),
            '7' to listOf("p", "q", "r", "s"),
            '8' to listOf("t", "u", "v"),
            '9' to listOf("w", "x", "y", "z")
        )

        val n = digits.length
        val result = mutableListOf<String>()

        fun backTrack(index: Int, combination: String) {
            if (combination.length == n) {
                result.add(combination)
                return
            }

            val charList = map[digits[index]]

            charList?.forEach{ char ->
                backTrack(index + 1, combination + char)
            }
        }

        backTrack(0, "")
        return result
    }
}
