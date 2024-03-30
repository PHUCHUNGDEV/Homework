package com.hung.homework6.ex1
/*Tạo một lớp Student kế thừa từ lớp person lưu trữ các thông tin như dưới đây:
 - Mã sinh viên,điểm trung bình, email (email phải chứa kí tự @ và không tồn tại khoảng trắng)
 - Viết một phương thức nhập thông tin của student
 - Viết một phương thức hiện thị thông tin của student
 - Viết phương trình xem xét có sinh viên nào được học bổng không? điểm trung bình hơn 8.0 sẽ được học bổng
*/
class Student: Person {
    constructor()
    constructor(name: String?, gioitinh: String?, address: String?, dob: String): super(name, address, gioitinh, dob)

    var studentID: Int? = null
    var gpa: Double? = null
    var email: String? = null
    var diemToan: Double? = null
    var diemLy: Double? = null
    var diemHoa: Double? = null


    override fun importInf() {
        super.importInf()
        println("Nhap diem toan:")
        diemToan = readln().toDouble()
        println("Nhap diem ly: ")
        diemLy = readln().toDouble()
        println("Nhap diem Hoa: ")
        diemHoa = readln().toDouble()

        //    check mail
        var validEmail = false
        while (!validEmail) {
            println("Nhập email: ")
            email = readLine().toString()
            if (email!!.contains("@") && !email!!.contains(" ")) {
                validEmail = true
            } else {
                println("Email không hợp lệ. Email phải chứa ký tự '@' và không có khoảng trắng.")
            }
        }
        println("Nhap MSSV: ")
        studentID = readln().toInt()
    }

    override fun exportInf() {
        super.exportInf()
        println("Ma so sinh vien: $studentID")
        println("Email: $email")
        println("diem trung binh: ${handleGPA(diemToan, diemLy, diemHoa)}")
        if (handleGPA(diemToan, diemLy, diemHoa)>8.0){
            println("Sinh vien nay duoc hoc bong")
        }
        else{
            println("Sinh vien nay khong duoc hoc bong")
        }
    }

    private fun handleGPA(diemToan: Double?, diemLy: Double?, diemHoa: Double?): Double {
        return ((diemToan ?: 0.0) + (diemLy ?: 0.0) + (diemHoa ?: 0.0)) / 3.0
    }

}