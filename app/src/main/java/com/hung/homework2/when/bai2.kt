package com.hung.homework2.`when`

import android.annotation.SuppressLint

// nhap a, b, c vao tu ban phim
// kiem tra xem 3 canh do co phai la 3 canh tam giac khong

// lap ham kiem tra tam giac
fun isTriangle(a: Double, b: Double, c: Double): Boolean{
    return (a+b > c && a + c > b && b +c > a)  // boolean tra ve true khi thoa man dk trong bieu thuc, false khi sai
}
// ham xac dinh loai tam giac
fun triangleType(a: Double, b: Double, c: Double): String{
    return when{
        a == b && b == c -> "Tam giac deu"
        a == b || b == c || a == c -> "Tam giac can"
        a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a -> "Tam giac vuong"
        else -> "Tam giac thuong"
    }
}
@SuppressLint("SuspiciousIndentation")
fun main() {
//    nhap vao tu ban phim a,b,c
    println("nhap a: ")
    val a = readln().toDouble()  // Double vi canh tam giac co the la so thap phan
    println("nhap b: ")
    val b = readln().toDouble()
    println("nhap c: ")
    val c = readln().toDouble()
//canh tam giac >0
    if (a < 0 || b < 0 || c <0){
        println("canh cua tam giac phai > 0")
        return
    }
//    goi ham kiem tra tam giac isTriangle
    if (isTriangle(a,b,c)){
    val type = triangleType(a,b,c)
        println("3 so da cho la canh cua tam giac $type")
    }
    else{
        println("ba so khong phai la 3 canh tam giac")
    }
}
