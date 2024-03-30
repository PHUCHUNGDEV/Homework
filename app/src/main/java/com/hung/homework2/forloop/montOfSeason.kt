package com.hung.homework2.forloop

// nhap vao 1 so tu 1->12
/* Nếu là mùa Xuân thì tính giá trị biểu thức
       S = 1+2+3+...+n (n>0)
     - Nếu là mùa Hạ tính giá trị biếu thức
       Q = 0 + 1/2 + 2 + 9/2 + ... + n^2/2  */

fun main() {
    println("nhap n: ")
    var n = readln().toInt()

    if (n < 0 || n > 12) {
        println("thang nhap vao khong hop le!")
        return
    }
    val mua = when (n) {
        in 1..3 -> "Xuan"
        in 4..6 -> "Ha"
        in 7..9 -> "Thu"
        else -> "Dong"
    }
    println("day la mua: $mua")
    var sum: Double = 0.0
    when (mua) {
        "Xuan" -> {
            for (i in 1..n) {
                sum += i
            }
            println("tong cua day so tu 1-n la: $sum")
        }

        "Ha" -> {
            for (i in 0..n) {
                sum += (i * i).toDouble() / 2
            }
            println("ket qua bieu thuc Q = 0 + 1/2 + 2 + 9/2 + ... + n^2/2 la: $sum")
        }
    }

}