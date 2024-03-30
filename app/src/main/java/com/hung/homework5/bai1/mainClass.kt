package com.hung.homework5.bai1

/*Tạo class có tên là SoHoc gồm có các thuộc tính và phương thức sau:
    - Thuộc tính : numberOne , numberTwo
    - Phương thức: Các hàm tạo không tham số, đầy đủ tham số
    Yêu cầu:
    1- Nhập 2 số từ bàn phím
    2- Viết hàm tính tổng, hiệu , tích , thương 2 số
*/

fun main() {
    println("Nhập số thứ nhất:")
    val num1 = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    println("Nhập số thứ hai:")
    val num2 = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    // Truyền num1 và num2 vào constructor của SoHoc
    val ketqua = SoHoc(num1, num2)

    println("Tổng: ${ketqua.cong()}")
    println("Hiệu: ${ketqua.tru()}")
    println("Tích: ${ketqua.nhan()}")
    println("Thương: ${ketqua.chia()}")
}
