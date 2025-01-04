package leetcode

//https://leetcode.com/problems/restore-ip-addresses/description/?envType=problem-list-v2&envId=string
class Solution {
    fun restoreIpAddresses(s: String): List<String> {
        val result = mutableListOf<String>()
        if (s.length < 4 || s.length > 12) return result
        fun isValid(part: String): Boolean {
            if (part.length > 1 && part.startsWith("0")) return false
            val value = part.toInt()
            return value in 0..255
        }
        fun backtrack(start: Int, current: String, segment: Int) {
            if (segment == 4 && start == s.length) {
                result.add(current.dropLast(1))
                return
            }
            if (segment == 4 || start == s.length) return

            for (len in 1..3) {
                if (start + len > s.length) break

                val part = s.substring(start, start + len)
                if (isValid(part)) {
                    backtrack(start + len, "$current$part.", segment + 1)
                }
            }
        }



        backtrack(0, "", 0)
        return result
    }
}
