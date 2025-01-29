package leetcode

//https://leetcode.com/problems/reverse-string/description/
class ReverseStringInPlace {
    fun reverseString(s: CharArray): Unit {
        var i = 0
        var j = s.size - 1
        var temp:Char

        while(i<j){
            temp = s[i]
            s[i] = s[j]
            s[j] = temp

            i++
            j--
        }
    }
}