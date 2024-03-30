package com.hung.homework5.bai1

/*Tạo class có tên là SoHoc gồm có các thuộc tính và phương thức sau:
    - Thuộc tính : numberOne , numberTwo
    - Phương thức: Các hàm tạo không tham số, đầy đủ tham số
    Yêu cầu:
    1- Nhập 2 số từ bàn phím
    2- Viết hàm tính tổng, hiệu , tích , thương 2 số
*/
class SoHoc() {

    private var numberOne: Double = 0.0
    private var numberTwo: Double = 0.0
    constructor(num1: Double, num2: Double): this(){
        numberOne = num1
        numberTwo = num2
    }

    fun cong(): Double {
        return numberOne + numberTwo
    }

    fun tru(): Double {
        return numberOne - numberTwo
    }

    fun nhan(): Double {
        return numberOne * numberTwo
    }

    fun chia(): Double {
        return if (numberTwo.toInt() != 0) {
            numberOne / numberTwo
        } else {
            println("khong the thuc hien phep chia, yeu cau Number2 != 0")
            Double.NaN
        }
    }
}