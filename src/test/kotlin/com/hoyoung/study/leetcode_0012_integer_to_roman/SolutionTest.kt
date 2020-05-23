package com.hoyoung.study.leetcode_0012_integer_to_roman

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    @Test
    fun intToRoman() {
        val s = Solution()
        assertEquals(s.intToRoman(27), "XXVII")
        assertEquals(s.intToRoman(3), "III")
        assertEquals(s.intToRoman(4), "IV")
        assertEquals(s.intToRoman(9), "IX")
        assertEquals(s.intToRoman(58), "LVIII")
        assertEquals(s.intToRoman(1994), "MCMXCIV")
    }
}