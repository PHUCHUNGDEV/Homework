package com.hung.homework1.bai2

fun main() {
    // Nhập số nguyên từ người dùng
    print("Nhập số nguyên: ")
    val input = readlnOrNull()
    val n = input?.toIntOrNull()
    // Kiểm tra số nguyên và hiển thị thông điệp tương ứng
    if (input != null) {
        if (input >= 0.toString()) {
            println("Đây là số nguyên dương.")
        } else {
            println("Đây là số nguyên âm.")
        }
    }
}