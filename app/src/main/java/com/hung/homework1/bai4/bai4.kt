package com.hung.homework1.bai4
// mssv dinh dang kieu Bxxxxxxx
// bat buoc phai là B + 7 chu so
fun main() {
    val regex = Regex("B[1-9]\\d{7}")

    // Nhập mã số sinh viên từ người dùng
    print("Nhập mã số sinh viên: ")
    val studentID = readLine()

    // Kiểm tra xem mã số sinh viên có đúng định dạng không
    if (studentID != null && regex.matches(studentID)) {
        println("Mã số sinh viên hợp lệ.")
    } else {
        println("Mã số sinh viên không hợp lệ.")
    }
}
