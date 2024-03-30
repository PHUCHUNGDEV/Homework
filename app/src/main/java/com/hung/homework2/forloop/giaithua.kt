package com.hung.homework2.forloop

// nhap n, tinh giai thua

fun main() {
    println("nhap n: ")
    var n = readln().toInt()
    if (n<0){
        println("n phai la so nguyen duong")
        return
    }
    var s=1
    for (i in 1..n){
        s *= i
    }
    println("giai thua cuar $n la: $s")
}