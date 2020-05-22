package com.hoyoung.study.leetcode_0011_container_with_most_water

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    @Test
    fun maxArea() {
        val s = Solution();
        assertEquals(s.maxArea(intArrayOf(1,8,6,2,5,4,8,3,7)), 49)
    }
}