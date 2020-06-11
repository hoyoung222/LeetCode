package com.hoyoung.study.leetcode_2020_06_week2

class Day4Solution {

    // Counting sort
    fun sortColors(nums: IntArray): Unit {
        val tmp = nums.copyOf()
        val counts = intArrayOf(0, 0, 0)

        for (i in nums.indices) {
            counts[nums[i]]++
        }

        for (i in 1 until counts.size) {
            counts[i] += counts[i - 1]
        }

        for (i in nums.size - 1 downTo 0 step 1) {
            nums[--counts[tmp[i]]] = tmp[i]
        }
    }
}