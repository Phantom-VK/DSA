package leetcode

//https://leetcode.com/problems/teemo-attacking/
class Solution {
    fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
        if (timeSeries.isEmpty()) return 0

        var totalTime = 0

        for (i in 0 until timeSeries.size - 1) {
            totalTime += minOf(timeSeries[i + 1] - timeSeries[i], duration)
        }

        totalTime += duration

        return totalTime
    }
}
