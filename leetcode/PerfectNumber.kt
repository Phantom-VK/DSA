package leetcode

//https://leetcode.com/problems/perfect-number/description/
class PerfectNumber {
    fun checkPerfectNumber(num: Int): Boolean {
        if (num == 1) return false

        var sum = 1

        for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
            if (num % i == 0) {
                sum += i + (num / i)
            }
        }

        return sum == num
    }
}
