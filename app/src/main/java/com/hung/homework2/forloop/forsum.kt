package com.hung.homework2.forloop

// nhap n
// if n%2==0 --> tinh tong cac so chan tu 1-> n
// if n%2==1 --> k tinh

fun main() {
    println("nhap n: ")
    var n = readln().toInt()
    if (n%2==1){
        println("so le, khong tinh")
        return
    }
    var sum = 0
    for (i in 1..n){
        if (i%2==0){
            sum += i
        }
    }
    println("tong cac so chan tu 1 -> $n la: $sum")
}