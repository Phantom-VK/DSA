package leetcode

//https://leetcode.com/problems/count-and-say/description/?envType=problem-list-v2&envId=string
class Solution {
    fun countAndSay(n: Int): String {
        if (n == 1) {
            return "1"
        }

        val prev = countAndSay(n - 1)
        val result = StringBuilder()

        var count = 1

        for (i in 1 until prev.length) {
            if (prev[i] == prev[i - 1]) {
                count++
            } else {
                result.append(count).append(prev[i - 1])
                count = 1
            }
        }

        result.append(count).append(prev[prev.length - 1])

        return result.toString()
    }
}
