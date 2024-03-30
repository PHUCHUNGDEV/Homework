package com.hung.homework6.ex1
/*Tạo một lớp Person lưu trữ các thông tin sau đây ( Tên, giới tính, địa chỉ,ngay sinh)
*/
open class Person {
    constructor()
    constructor(name: String?, gioitinh: String?, address: String?, dob: String)

    var name: String? = null
    var gioitinh: String? = null
    var address: String? = null
    var dob: String? = null

    open fun importInf(){
        println("Nhap ten: ")
        name = readln()
        println("Gioi tinh: ")
        gioitinh = readln()
        println("Dia chi: ")
        address = readln()
        println("Ngay sinh: ")
        dob = readln()
    }

    open fun exportInf(){
        println("Ten: $name")
        println("Gioi tinh: $gioitinh")
        println("Dia chi: $address")
        println("NNgay sinh: $dob")
    }
}