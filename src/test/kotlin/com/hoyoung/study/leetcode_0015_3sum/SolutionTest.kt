package com.hoyoung.study.leetcode_0015_3sum

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    @Test
    fun threeSum() {
        val s = Solution()
        assertEquals(s.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)), listOf(listOf(-1, 0, 1), listOf(-1, -1, 2)))
    }
}