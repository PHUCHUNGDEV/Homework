package com.hung.homework2.forloop

// tinh tong day so tu 1 den n-1

fun main() {

    println("nhap n: ")
    var n = readln().toInt()
    var sum = 0
    if (n<1) {
        println("n phai > 1, nhap lai")
        return
    }
    for (i in 1 until n ){
        sum += i
    }
    println("tong day so = $sum")

}