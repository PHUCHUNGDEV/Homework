package com.hung.homework1.bai1

// chuyển số thành dạng chữ: 1 --> Một, 2 --> Hai,....
// cách 2: dùng 2 mảng array, đối chiếu phần tử trong 2 mảng theo từng vị trí

fun docSo3(n: Int): String {
    val docSoArray = arrayOf("Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín")

    return if(n in 0..9) {   // khong co return se hien loi A 'return' expression required in a function with a block body ('{...}')
        docSoArray[n]
    } else {
        "Số không hợp lệ"
    }
}

fun main() {
    while (true) {
        try {
            print("Nhập số nguyên từ 0 đến 9: ")
            val so = readln().toInt()
            val chuoiChu = docSo(so)
            println("Số $so được viết là: $chuoiChu")
            break
        } catch (e: NumberFormatException) {
            println("Vui lòng chỉ nhập số nguyên từ 0 đến 9.")
        }
    }
}
