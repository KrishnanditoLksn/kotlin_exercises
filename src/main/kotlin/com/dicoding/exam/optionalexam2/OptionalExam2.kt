package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    val numberList = number.toString().map { it.toString().toInt() }
    val maxNumberList = numberList.maxOrNull() ?: 0
    val minNumberList = numberList.minOrNull() ?: 0
    return maxNumberList + minNumberList
}
