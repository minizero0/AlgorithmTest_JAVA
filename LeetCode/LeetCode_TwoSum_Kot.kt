package LeetCode

class LeetCode_TwoSum_Kot {
    fun toSum(nums: IntArray, target: Int): IntArray {
        val numsMap: MutableMap<Int, Int> = mutableMapOf()

        for ((i, num) in nums.withIndex()) {
            if (numsMap.containsKey(target - num)) {
                return intArrayOf(numsMap[target - num]!!, i)
            }
            numsMap[num] = i
        }
        return intArrayOf(0, 0)

    }
}