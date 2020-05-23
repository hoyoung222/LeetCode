package com.hoyoung.study.leetcode_0004_median_of_two_sorted_arrays

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    @Test
    fun findMedianSortedArrays() {
        val s = Solution()
        assertEquals(s.findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2)), 2.0)
        assertEquals(s.findMedianSortedArrays(intArrayOf(1, 2), intArrayOf(3, 4)), 2.5)
        assertEquals(s.findMedianSortedArrays(intArrayOf(1, 4, 10), intArrayOf(2, 12, 20)), 7.0)
        assertEquals(s.findMedianSortedArrays(intArrayOf(1, 10), intArrayOf(2, 12, 20)), 10.0)
        assertEquals(s.findMedianSortedArrays(intArrayOf(1), intArrayOf(3)), 2.0)
        assertEquals(s.findMedianSortedArrays(intArrayOf(1), intArrayOf()), 1.0)
        assertEquals(s.findMedianSortedArrays(intArrayOf(), intArrayOf()), 0.0)
        assertEquals(s.findMedianSortedArrays(intArrayOf(3), intArrayOf(1, 2)), 2.0)
        assertEquals(s.findMedianSortedArrays(intArrayOf(3), intArrayOf(-2, -1)), -1.0)
    }
}