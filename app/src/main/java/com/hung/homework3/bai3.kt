package com.hung.homework3

// tim n so fibonacci dau tien

// funtion check fibonacci
fun printFibonacci(n: Int) {
    var n1 = 0
    var n2 = 1
    var count = 0

    do {
        print("$n1 ")
        val sum = n1 + n2
        n1 = n2
        n2 = sum
        count++
    } while (count < n)
}

fun main() {
    println("Nhập số nguyên dương n:")
    var n = readLine()?.toIntOrNull()

    while (n == null || n <= 0) {
        println("Vui lòng nhập một số nguyên dương lớn hơn 0.")
        n = readLine()?.toIntOrNull()
    }

    println("Các số Fibonacci đầu tiên là:")
    printFibonacci(n)
}

