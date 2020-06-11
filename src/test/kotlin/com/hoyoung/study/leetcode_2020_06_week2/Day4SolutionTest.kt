package com.hoyoung.study.leetcode_2020_06_week2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Day4SolutionTest {

    @Test
    fun sortColors() {
        val s = Day4Solution()
        val input = intArrayOf(2, 0, 2, 1, 1, 0)
        s.sortColors(input)
        assertArrayEquals(input, intArrayOf(0, 0, 1, 1, 2, 2))
    }
}