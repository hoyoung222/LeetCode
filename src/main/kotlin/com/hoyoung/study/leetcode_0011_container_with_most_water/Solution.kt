package com.hoyoung.study.leetcode_0011_container_with_most_water

class Solution {
    fun maxArea(height: IntArray): Int {
        var maxArea = 0
        for (i in height.indices) {
            for (j in (i + 1)..height.lastIndex) {
                val min = if (height[i] > height[j]) {
                    height[j]
                } else {
                    height[i]
                }

                ((j - i) * min).run {
                    if (this > maxArea) {
                        maxArea = this
                    }
                }
            }
        }
        return maxArea
    }
}