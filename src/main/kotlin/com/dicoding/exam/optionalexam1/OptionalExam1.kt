package com.dicoding.exam.optionalexam1

// TODO
fun sumOfBigThree(vararg numbers: Int): Int {
    val lister = numbers.toList()
    /*
    sorting
    filter 3 angka terbesar
    jumlahkan 3 angka terbesar
     */
    return lister.sorted().takeLast(3).sum()
}
