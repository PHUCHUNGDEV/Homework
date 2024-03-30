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
class NhanVien(val ten: String, val tuoi: Int, val diaChi: String, var luong: Double, val tongSoGioLam: Int) {

    fun xuatThongTin() {
        println("Thông tin nhân viên:")
        println("Tên: $ten")
        println("Tuổi: $tuoi")
        println("Địa chỉ: $diaChi")
        println("Tổng số giờ làm: $tongSoGioLam giờ")
        println("Lương: $luong VNĐ")
    }

    fun tinhLuong() {
        luong = tongSoGioLam * 0.3
    }

    fun xuatTrangThaiLuong() {
        val trangThai = when (luong) {
            in 50000000.0..100000000.0 -> TrangThaiLuong.LUONG_CAO
            in 15000000.0..50000000.0 -> TrangThaiLuong.LUONG_KHA
            else -> TrangThaiLuong.LUONG_THAP
        }

        val thongBao = when (trangThai) {
            TrangThaiLuong.LUONG_CAO -> "Nhân viên xuất sắc"
            TrangThaiLuong.LUONG_KHA -> "Nhân viên đáp ứng công việc"
            TrangThaiLuong.LUONG_THAP -> "Nhân viên cần cải thiện"
        }

        println(thongBao)
    }
}
