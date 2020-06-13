package com.hoyoung.study.leetcode_0006_zigzag_conversion

class Solution {
    fun getNumCols(len: Int, numRows: Int): Int {
        val group = 2 * numRows - 2
        val numGroups = len / group
        val remain = len % group

        return numGroups * (numRows - 1) + if (remain > numRows) 1 + remain - numRows else 1
    }

    fun convert(s: String, numRows: Int): String {
        if (s.length <= 1 || numRows <= 1) {
            return s
        }

        val numCols = getNumCols(s.length, numRows)
        var result = StringBuilder()
        for (row in 0 until numRows) {
            val max = (numCols - 1) * 2 + row

            var nextIdx = row
            while (nextIdx <= max) {
                if (nextIdx < s.length) {
                    result.append(s[nextIdx])

                    if (row in 1 until numRows - 1) {
                        val betweenIdx = nextIdx + ((numRows - 1 - row) * 2)
                        if (betweenIdx < s.length) {
                            result.append(s[betweenIdx])
                        }
                    }
                }

                nextIdx += (numRows - 1) * 2
            }
        }

        return result.toString()
    }
}