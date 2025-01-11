package leetcode

//https://leetcode.com/problems/construct-k-palindrome-strings/description/?envType=daily-question&envId=2025-01-11
fun canConstruct(s: String, k: Int): Boolean {
    if (k > s.length) {
        return false
    }

    val freq = IntArray(26)
    for (c in s) {
        freq[c - 'a']++
    }

    val oddCount = freq.count { it % 2 != 0 }

    return oddCount <= k
}