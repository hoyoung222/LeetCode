package com.hoyoung.study.leetcod_0008_string_to_integer_atoi

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    @Test
    fun myAtoi() {
        val s = Solution()

        assertEquals(s.myAtoi("42"), 42)
        assertEquals(s.myAtoi("    -42"), -42)
        assertEquals(s.myAtoi("4193 with words"), 4193)
        assertEquals(s.myAtoi("words and 987"), 0)
        assertEquals(s.myAtoi("-91283472332"), -2147483648)
        assertEquals(s.myAtoi("-2147483647"), -2147483647)
        assertEquals(s.myAtoi("-2147483648"), -2147483648)
        assertEquals(s.myAtoi("2147483648"), 2147483647)
    }
}