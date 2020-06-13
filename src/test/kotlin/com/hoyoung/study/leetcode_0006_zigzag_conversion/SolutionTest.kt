package com.hoyoung.study.leetcode_0006_zigzag_conversion

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    @Test
    fun getNumCols() {
        val s = Solution()

        assertEquals(s.getNumCols(14, 3), 7)
        assertEquals(s.getNumCols(14, 4), 7)
        assertEquals(s.getNumCols(14, 5), 6)
        assertEquals(s.getNumCols(14, 6), 6)
        assertEquals(s.getNumCols(5, 4), 2)
    }

    @Test
    fun convert() {
        val s = Solution()
        val input1 = "PAYPALISHIRING"
        assertEquals(s.convert(input1, 3), "PAHNAPLSIIGYIR")
        assertEquals(s.convert(input1, 4), "PINALSIGYAHRPI")

        val input2 = "ABCDE"
        assertEquals(s.convert(input2, 4), "ABCED")
    }
}