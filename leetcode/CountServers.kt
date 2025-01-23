package leetcode

//https://leetcode.com/problems/count-servers-that-communicate/description/?envType=daily-question&envId=2025-01-23
class Solution {
    fun countServers(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        val rowCount = IntArray(m)
        val colCount = IntArray(n)
        var totalServers = 0

        for (i in 0 until m) {
            for (j in 0 until n) {
                if (grid[i][j] == 1) {
                    rowCount[i]++
                    colCount[j]++
                    totalServers++
                }
            }
        }

        var isolatedServers = 0
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (grid[i][j] == 1 && rowCount[i] == 1 && colCount[j] == 1) {
                    isolatedServers++
                }
            }
        }

        return totalServers - isolatedServers
    }
}
