package com.hung.homework1.bai1

// chuyển số thành dạng chữ: 1 --> Một, 2 --> Hai,....
// sử dụng map

fun docSo(n: Int): String {
    // Tạo một map chứa cách đọc số từ 0 đến 9
    val docSoMap = mapOf(
        0 to "Không",
        1 to "Một",
        2 to "Hai",
        3 to "Ba",
        4 to "Bốn",
        5 to "Năm",
        6 to "Sáu",
        7 to "Bảy",
        8 to "Tám",
        9 to "Chín"
    )

    // Kiểm tra xem số có nằm trong khoảng từ 0 đến 9 không
    return if (n in 0..9) {
        docSoMap[n] ?: "Số không hợp lệ"
    } else {
        "Số không hợp lệ"
    }
}

fun main() {
    while (true) {
        try {
            // Nhập số từ người dùng
            print("Nhập số nguyên từ 0 đến 9: ")
            val so = readLine()?.toInt() ?: 0
            // Chuyển đổi số thành chữ
            val chuoiChu = docSo(so)
            println("Số $so được viết là: $chuoiChu")
            break
        } catch (e: NumberFormatException) {
            println("Vui lòng chỉ nhập số nguyên từ 0 đến 9.")
        }
    }
}
