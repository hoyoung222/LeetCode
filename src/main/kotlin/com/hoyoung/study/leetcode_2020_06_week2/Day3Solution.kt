package com.hoyoung.study.leetcode_2020_06_week2

class Day3Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        for (i in nums.indices) {
            if (nums[i] >= target) return i
        }

        return nums.size
    }
}