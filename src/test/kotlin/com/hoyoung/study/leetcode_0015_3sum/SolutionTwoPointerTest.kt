package com.hoyoung.study.leetcode_0015_3sum

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTwoPointerTest {

    @Test
    fun threeSum() {
        val s = SolutionTwoPointer()
        assertEquals(s.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)), listOf(listOf(-1, -1, 2), listOf(-1, 0, 1)))
    }
}