package leetcode

//https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/description/
class Solution {
    class Node {
        val children = mutableMapOf<Pair<Char, Char>, Node>()
        var cnt = 0
    }

    fun countPrefixSuffixPairs(words: Array<String>): Int {
        var ans = 0
        val trie = Node()

        for (word in words) {
            var node = trie
            for (i in word.indices) {
                val pair = word[i] to word[word.length - 1 - i]
                node = node.children.getOrPut(pair) { Node() }
                ans += node.cnt
            }
            node.cnt++
        }

        return ans
    }
}
