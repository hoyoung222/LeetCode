package com.hoyoung.study.leetcode_0001_two_sum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices) {
            val searchValue = target - nums[i]
            for (j in (i + 1) until nums.size) {
                if (nums[j] == searchValue) {
                    return intArrayOf(i, j)
                }
            }
        }

        throw IllegalArgumentException("Invalid argument.")
    }
}