package leetcode

//https://leetcode.com/problems/valid-mountain-array/
class Solution {
    fun validMountainArray(arr: IntArray): Boolean {
        if (arr.size < 3) return false

        var l = 0;
        var r = arr.size - 1;

        while (l + 1 < arr.size && arr[l] < arr[l + 1]){
            ++l
        }
        while (r > 0 && arr[r] < arr[r - 1]){
            --r
        }

        return l > 0 && r < arr.size - 1 && l == r
    }
}
