package leetcode

//https://leetcode.com/problems/design-hashmap/?envType=problem-list-v2&envId=array
class MyHashMap {

    private val kSize = 10000
    private val lists: Array<MutableList<Pair<Int, Int>>> = Array(kSize) { mutableListOf() }

    fun put(key: Int, value: Int) {
        val bucketIndex = key % kSize
        val bucket = lists[bucketIndex]
        for (i in bucket.indices) {
            if (bucket[i].first == key) {
                bucket[i] = Pair(key, value)
                return
            }
        }
        bucket.add(Pair(key, value))
    }

    fun get(key: Int): Int {
        val bucketIndex = key % kSize
        val bucket = lists[bucketIndex]
        for ((k, v) in bucket) {
            if (k == key) return v
        }
        return -1
    }

    fun remove(key: Int) {
        val bucketIndex = key % kSize
        val bucket = lists[bucketIndex]
        bucket.removeIf { it.first == key }
    }
}