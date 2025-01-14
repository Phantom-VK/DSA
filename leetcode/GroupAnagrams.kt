package leetcode

//https://leetcode.com/problems/group-anagrams/description/?envType=problem-list-v2&envId=sorting
class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val anagramMap = mutableMapOf<String, MutableList<String>>()

        for (s in strs) {
            val key = s.toCharArray().sorted().joinToString("")

            if (key !in anagramMap) {
                anagramMap[key] = mutableListOf()
            }
            anagramMap[key]!!.add(s)
        }

        return anagramMap.values.toList()
    }
}
