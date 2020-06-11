package com.hoyoung.study.leetcode_2020_06_week2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Day3SolutionTest {

    @Test
    fun searchInsert() {
        val s = Day3Solution()
        val nums = intArrayOf(1, 3, 5, 6)
        assertEquals(s.searchInsert(nums, 5), 2)
        assertEquals(s.searchInsert(nums, 2), 1)
        assertEquals(s.searchInsert(nums, 7), 4)
        assertEquals(s.searchInsert(nums, 0), 0)
    }
}