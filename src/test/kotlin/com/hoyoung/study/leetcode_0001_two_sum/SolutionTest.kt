package com.hoyoung.study.leetcode_0001_two_sum

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class SolutionTest {

    @Test
    fun twoSum() {
        val solution = Solution();

        val input = intArrayOf(2, 7, 11, 15)
        assertArrayEquals(solution.twoSum(input, 9), intArrayOf(0, 1))
        assertArrayEquals(solution.twoSum(input, 18), intArrayOf(1, 2))
        assertArrayEquals(solution.twoSum(input, 22), intArrayOf(1, 3))
        assertArrayEquals(solution.twoSum(input, 17), intArrayOf(0, 3))

        val error = assertThrows<IllegalArgumentException> {
            solution.twoSum(input, 11)
        }
        assertTrue(error.message == "Invalid argument.")
    }
}