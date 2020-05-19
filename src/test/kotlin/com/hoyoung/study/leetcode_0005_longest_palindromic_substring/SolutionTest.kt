package com.hoyoung.study.leetcode_0005_longest_palindromic_substring

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    @Test
    fun isPalindrome(){
        val s = Solution()

        val input1 = "babad"
        assertEquals(s.isPalindrome(input1, 0, 2), true)
        assertEquals(s.isPalindrome(input1, 0, 1), false)
        assertEquals(s.isPalindrome(input1, 1, 3), true)
        assertEquals(s.isPalindrome(input1, 1, 2), false)
        assertEquals(s.isPalindrome(input1, 2, 4), false)

        val input2 = "cbbd"
        assertEquals(s.isPalindrome(input2, 0, 2), false)
        assertEquals(s.isPalindrome(input2, 0, 1), false)
        assertEquals(s.isPalindrome(input2, 1, 3), false)
        assertEquals(s.isPalindrome(input2, 1, 2), true)
        assertEquals(s.isPalindrome(input2, 2, 3), false)
    }

    @Test
    fun longestPalindrome() {
        val s = Solution()

        assertEquals(s.longestPalindrome("babad"), "bab")
        assertEquals(s.longestPalindrome("cbbd"), "bb")
        assertEquals(s.longestPalindrome("a"), "a")
        assertEquals(s.longestPalindrome("ac"), "a")

    }
}