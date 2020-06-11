package com.hoyoung.study.leetcode_2020_06_week2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Day2SolutionTest {

    @Test
    fun isSubsequence() {
        val s = Day2Solution()

        assertEquals(s.isSubsequence("abc", "ahbgdc"), true)
        assertEquals(s.isSubsequence("axc", "ahbgdc"), false)
    }
}