package com.hung.homework1.bai5

import kotlin.math.sqrt
// giai phuong trinh bac 2 co dang ax^2 + bx + c = 0
// kiem tra xem phuong trinh co vo nghiem khong?

fun main(){
//   nhap a,b,c vao tu ban phim

    println("bieu thuc ax^2+bx+c=0")
    println("nhap a: ")
    val a1 = readln()
    println("nhap b: ")
    val b1 = readln()
    println("nhap c: ")
    val c1 = readln()
    val a = a1.toDouble()
    val b = b1.toDouble()
    val c = c1.toDouble()
    val delta = b*b - 4*a*c

    if (a == 0.toDouble()){
        println("phuong trinh bac nhat")
        return
    }
    if (delta < 0){
        println("phuong trinh vo nghiem")
    }
    if (delta ==0.0){
        val x = -b/(2*a)
        println("phuong trinh co nghiem kep la: $x")
    }
    if (delta > 0){
        val x1 = (-b + sqrt(delta)) / (2 * a)
        val x2 = (-b - sqrt(delta)) / (2 * a)
        println("phuong trinh co 2 nghiem rieng biet la: $x1,$x2")
    }
}