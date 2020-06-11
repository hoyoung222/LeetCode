package com.hoyoung.study.leetcode_2020_06_week2

class Day2Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var i = 0
        var preIdx = 0

        while (i < s.length) {
            if (preIdx >= t.length) return false
            var j = preIdx
            while (j < t.length) {
                if (s[i] == t[j]) {
                    preIdx = j + 1
                    break
                }
                j++
            }
            if (j >= t.length) return false
            i++
        }

        return true
    }
}