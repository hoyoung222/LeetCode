package com.hoyoung.study.leetcode_0015_3sum

class SolutionTwoPointer {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val result = mutableListOf<List<Int>>()

        val lastIndex = nums.size - 1
        for (i in nums.indices) {
            if (0 < i && nums[i] == nums[i - 1]) {
                continue
            }

            var l = i + 1
            var h = lastIndex

            while (l < h) {
                val sum = nums[i] + nums[l] + nums[h]
                when {
                    sum > 0 -> h--
                    sum < 0 -> l++
                    else -> {
                        result += listOf(nums[i], nums[l], nums[h])

                        while (l + 1 <= lastIndex && nums[l] == nums[l + 1]) l++
                        while (0 <= h - 1 && nums[h - 1] == nums[h]) h--

                        l++
                        h--
                    }
                }
            }
        }
        return result.toList()
    }
}