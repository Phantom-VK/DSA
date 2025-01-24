package leetcode

//https://leetcode.com/problems/fizz-buzz/
class Solution {
    fun fizzBuzz(n: Int): List<String> {
        val result = ArrayList<String>(n)
        for (i in 1..n) {
            val sb = StringBuilder()
            if (i % 3 == 0) sb.append("Fizz")
            if (i % 5 == 0) sb.append("Buzz")
            result.add(if (sb.isEmpty()) i.toString() else sb.toString())
        }
        return result
    }
}
