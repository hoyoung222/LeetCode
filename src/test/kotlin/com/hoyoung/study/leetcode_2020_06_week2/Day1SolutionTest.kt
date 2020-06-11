package com.hoyoung.study.leetcode_2020_06_week2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Day1SolutionTest {
    @Test
    fun isPowerOfTwo() {
        val s = Day1Solution()

        assertEquals(s.isPowerOfTwo(1), true)
        assertEquals(s.isPowerOfTwo(16), true)
        assertEquals(s.isPowerOfTwo(218), false)
    }
}