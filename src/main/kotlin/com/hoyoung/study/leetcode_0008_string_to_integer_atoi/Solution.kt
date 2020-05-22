package com.hoyoung.study.leetcode_0008_string_to_integer_atoi

class Solution {
    fun myAtoi(str: String): Int {
        val checkValue = Int.MAX_VALUE / 10

        var ret = 0;
        var sign = 0
        loop@ for (i in str.indices) {
            when (str[i]) {
                ' ' -> if (sign == 0) {
                    continue@loop
                } else {
                    break@loop;
                }
                '-' -> if (sign == 0) {
                    sign = -1
                } else {
                    break@loop;
                }
                '+' -> if (sign == 0) {
                    sign = 1
                } else {
                    break@loop;
                }
                '0', '1', '2', '3', '4',
                '5', '6', '7', '8', '9' -> {
                    if (sign == 0) {
                        sign = 1
                    }

                    val addValue = str[i].toInt() - '0'.toInt()
                    if (ret > checkValue) {
                        ret = if (sign >= 0) {
                            Int.MAX_VALUE
                        } else {
                            Int.MIN_VALUE
                        }
                        break@loop
                    } else if (ret == checkValue) {
                        if (addValue > 7) {
                            ret = if (sign >= 0) {
                                Int.MAX_VALUE
                            } else {
                                Int.MIN_VALUE
                            }
                            break@loop;
                        }
                    }

                    ret = ret * 10 + addValue
                }
                else -> break@loop
            }
        }

        return ret * sign
    }
}