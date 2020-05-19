package com.hoyoung.study.leetcode_0005_longest_palindromic_substring

class Solution {
    fun isPalindrome(s: String, startIndex: Int, endIndex: Int): Boolean {
        var sIndex = startIndex
        var eIndex = endIndex
        while (sIndex < eIndex) {
            if (s[sIndex] != s[eIndex]) {
                return false;
            }

            sIndex++
            eIndex--
        }
        return true
    }

    fun longestPalindrome(s: String): String {
        if (s.length <= 1) return s

        var longestPalindromeStartIndex = 0;
        var longestPalindromeEndIndex = 1;
        for (i in 0 until s.length - 1) {
            for (j in s.length - 1 downTo i + 1 step 1) {
                if (s[i] != s[j]) {
                    continue
                } else {
                    if (isPalindrome(s, i, j)) {
                        if (longestPalindromeEndIndex - longestPalindromeStartIndex < j + 1 - i) {
                            longestPalindromeEndIndex = j + 1
                            longestPalindromeStartIndex = i
                        }
                        break
                    } else {
                        continue
                    }
                }
            }
        }

        return s.substring(longestPalindromeStartIndex, longestPalindromeEndIndex)
    }
}