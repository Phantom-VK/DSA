package leetcode

//https://leetcode.com/problems/combination-sum-ii/description/
class Solution {
    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        candidates.sort()
        val result = mutableListOf<List<Int>>()

        fun backTrack(currSum: Int, currList: MutableList<Int>, startIdx: Int) {
            if (currSum == target) {
                result.add(ArrayList(currList))
                return
            }

            if (currSum > target) return

            for (i in startIdx until candidates.size) {
                if (i > startIdx && candidates[i] == candidates[i - 1]) continue

                currList.add(candidates[i])
                backTrack(currSum + candidates[i], currList, i + 1)
                currList.removeAt(currList.size - 1)
            }
        }

        backTrack(0, mutableListOf(), 0)
        return result
    }
}
