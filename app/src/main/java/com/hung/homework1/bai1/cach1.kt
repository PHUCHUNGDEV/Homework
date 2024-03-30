package com.hung.homework1.bai1

// chuyển số thành dạng chữ: 1 --> Một, 2 --> Hai,....

//cách 1: tạo biến, dùng lệnh if else để gán kiểu: nếu a==1 --> println 1 --> Một

fun main() {
    // nhập số n vào từ bàn phím
    println("Nhập vào số cần chuyển thành text: ")
    val input = readlnOrNull()  // ban đầu dùng readln nhưng warning báo nên đổi thành readlnOrNull, chưa hiểu lắm
    val n = input?.toIntOrNull()  // to Int or Null để tránh n dính null
//    chạy if, else if, else giải quyết bài toán
    if (n != null) {
        if (n == 0) {
            println("Không")
        } else if (n == 1) {
            println("Một")
        } else if (n == 2) {
            println("Hai")
        } else if (n == 3) {
            println("Ba")
        } else if (n == 4) {
            println("Bốn")
        } else if (n == 5) {
            println("Năm")
        } else if (n == 6) {
            println("Sáu")
        } else if (n == 7) {
            println("Bảy")
        } else if (n == 8) {
            println("Tám")
        } else if (n == 9) {
            println("Chín")
        } else {
            println("ngoài khoảng tham chiếu")
        }
    } else {
        println("Vui lòng nhập một số nguyên.")
    }
}