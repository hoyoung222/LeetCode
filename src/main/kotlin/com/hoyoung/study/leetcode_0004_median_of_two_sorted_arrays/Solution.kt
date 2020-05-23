package com.hoyoung.study.leetcode_0004_median_of_two_sorted_arrays

class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val arr = if (nums1.isEmpty() || nums2.isEmpty()) {
            when {
                nums1.isNotEmpty() -> nums1
                nums2.isNotEmpty() -> nums2
                else -> IntArray(0)
            }
        } else {
            IntArray(nums1.size + nums2.size)
                .apply {
                    var index = 0
                    var afp = 0
                    var bfp = 0

                    while (index < this.size) {
                        if (afp >= nums1.size) {
                            this[index++] = nums2[bfp++]
                        } else if (bfp >= nums2.size) {
                            this[index++] = nums1[afp++]
                        } else {
                            if (nums1[afp] < nums2[bfp]) {
                                this[index++] = nums1[afp++]
                            } else {
                                this[index++] = nums2[bfp++]
                            }
                        }
                    }
                }
        }

        return when {
            arr.isEmpty() -> {
                0.0
            }
            arr.lastIndex % 2 != 0 -> {
                (arr[arr.lastIndex / 2] + arr[arr.lastIndex / 2 + 1]) / 2.0
            }
            else -> {
                arr[arr.lastIndex / 2].toDouble()
            }
        }
    }
}