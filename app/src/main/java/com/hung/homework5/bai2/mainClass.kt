package com.hung.homework5.bai2

/*Tạo class NhanVien gồm các thuộc tính: Tên, tuổi, địa chỉ, tiền lương, tổng số giờ làm.
    yêu cầu:
    1- Xuất ra thông tin NhanVien
    2- Viết hàm tính lương của nhân viên theo công thức sau (Lương = tổng số giờ làm *  30%)
    3- Tạo enum class với 3 trạng thái : Lương cao, Lương khá, lương thấp
    - Nếu lương cao  xuất thông báo "Nhân viên xuất sắc"
    - Nếu lương khá  xuất thông báo "Nhân viên đáp ứng công việc"
    - Nếu lương thấp  xuất thông báo "Nhân viên cần cải thiện"
* Lưu ý : Lương cao dao động khoảng 50000000 VNĐ - 100000000 VNĐ
          Lương khá dao động khoảng 15000000 VNĐ - 50000000 VNĐ
          Lương thấp dao động khoảng 2000000 VNĐ - 8000000 VNĐ  

*/

fun main() {
    println("Nhập thông tin cho nhân viên:")
    print("Tên: ")
    val ten = readln()

    print("Tuổi: ")
    val tuoi = readln().toInt()

    print("Địa chỉ: ")
    val diaChi = readln()

    print("Tổng số giờ làm: ")
    val tongSoGioLam = readln().toInt()

    val nhanVien = NhanVien(ten, tuoi, diaChi, 0.0, tongSoGioLam)
    nhanVien.tinhLuong()
    nhanVien.xuatThongTin()
    nhanVien.xuatTrangThaiLuong()
}
