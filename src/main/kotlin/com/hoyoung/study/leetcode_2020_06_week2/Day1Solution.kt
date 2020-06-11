package com.hoyoung.study.leetcode_2020_06_week2

class Day1Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        if (n <= 0) return false

        var value = n
        var remain = 0

        while (value > 1 && remain == 0) {
            remain = value % 2
            value /= 2
        }

        return remain == 0
    }
}