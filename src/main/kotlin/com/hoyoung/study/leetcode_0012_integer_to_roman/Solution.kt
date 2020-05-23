package com.hoyoung.study.leetcode_0012_integer_to_roman

class Solution {
    private fun getNextCalc(calc: Int, value: Int) = value * (calc / value - 1) + calc % value

    fun intToRoman(num: Int): String {
        var roman = ""
        var calc = num

        while (calc > 0) {
            when {
                calc / 1000 > 0 -> {
                    roman += "M"
                    calc = getNextCalc(calc, 1000)
                }
                calc / 900 > 0 -> {
                    roman += "CM"
                    calc = getNextCalc(calc, 900)
                }
                calc / 500 > 0 -> {
                    roman += "D"
                    calc = getNextCalc(calc, 500)
                }
                calc / 400 > 0 -> {
                    roman += "CD"
                    calc = getNextCalc(calc, 400)
                }
                calc / 100 > 0 -> {
                    roman += "C"
                    calc = getNextCalc(calc, 100)
                }
                calc / 90 > 0 -> {
                    roman += "XC"
                    calc = getNextCalc(calc, 90)
                }
                calc / 50 > 0 -> {
                    roman += "L"
                    calc = getNextCalc(calc, 50)
                }
                calc / 40 > 0 -> {
                    roman += "XL"
                    calc = getNextCalc(calc, 40)
                }
                calc / 10 > 0 -> {
                    roman += "X"
                    calc = getNextCalc(calc, 10)
                }
                calc / 9 > 0 -> {
                    roman += "IX"
                    calc = getNextCalc(calc, 9)
                }
                calc / 5 > 0 -> {
                    roman += "V"
                    calc = getNextCalc(calc, 5)
                }
                calc / 4 > 0 -> {
                    roman += "IV"
                    calc = getNextCalc(calc, 4)
                }
                calc / 1 > 0 -> {
                    for (i in 0 until calc) {
                        roman += "I"
                    }
                    calc = 0
                }
            }
        }
        return roman
    }
}