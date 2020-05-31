package com.hoyoung.study.leetcode_0015_3sum

class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val result = mutableSetOf<List<Int>>()
        for (i in 0 until nums.size - 2) {
            for (j in i + 1 until nums.size - 1) {
                for (z in j + 1 until nums.size) {
                    if (nums[i] + nums[j] + nums[z] == 0) {
                        val insert = listOf(nums[i], nums[j], nums[z])
                        if (!result.contains(insert)) {
                            result += insert
                        }
                    }
                }
            }
        }
        return result.toList()
    }
}