package com.hung.homework2.`when`

// nhap vao a,b
// nhap vao 1 trong 4 phep toan +, -, *, /
// show ket qua

fun main() {
    // nhap 2 so a,b
    println("nhap a: ")
    val a1 = readln()
    println("nhap b: ")
    val b1 = readln()
    // luu a,b vao de su dung
    val a = a1.toDouble()
    val b = b1.toDouble()
    // nhap phep tinh
    println("nhap vao cac phep tinh")
    val pheptinh = readln()
    when(pheptinh){
        "+" -> println("ket qua phep tinh a+b la: ${a+b}")
        "-" -> println("ket qua phep tinh a-b la: ${a+b}")
        "*" -> println("ket qua phep tinh a*b la: ${a+b}")
        "/" -> println("ket qua phep tinh a/b la: ${a/b}")
        else -> println("phep tinh khong hop le")
    }

}