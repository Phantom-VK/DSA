class Solution1 {
    fun hammingWeight(n: Int): Int {
        return n.countOneBits()
    }

    fun hammingWeight2(n: Int): Int {
        var count = 0
        var num = n
        while (num != 0) {
            count++
            num = num and (num - 1)
        }
        return count
    }
}
