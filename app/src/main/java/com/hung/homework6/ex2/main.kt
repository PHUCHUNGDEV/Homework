package com.hung.homework6.ex2

/*Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên. Mỗi cán bộ cần quản lý các dữ liệu:
Họ tên, tuổi, giới tính(name, nữ, khác), địa chỉ.

Cấp công nhân sẽ có thêm các thuộc tính riêng: Bậc (1 đến 10).
Cấp kỹ sư có thuộc tính riêng: Nghành đào tạo.
Các nhân viên có thuộc tính riêng: công việc.
Yêu cầu 1: Xây dựng các lớp CongNhan, KySu, NhanVien kế thừa từ lớp CanBo.

Yêu cầu 2: Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực hiện các chức năng sau:

- Thêm mới cán bộ.
- Tìm kiếm theo họ tên.
- Hiện thị thông tin về danh sách các cán bộ.
- Thoát khỏi chương trình.

*/
fun main() {
    val management = personManagement()

    var selection: Int
    do {
        println("===== MENU =====")
        println("1. Thêm mới cán bộ")
        println("2. Tìm kiếm theo họ tên")
        println("3. Hiển thị thông tin danh sách cán bộ")
        println("4. Thoát khỏi chương trình")
        print("Nhập lựa chọn của bạn: ")
        selection = readln().toIntOrNull()!!

        // check lua chon

        when(selection){
            1 -> management.addPerson()
            2 -> management.search()
            3 -> management.listOfPerson()
            4 -> println("Da thoat")
            else -> println("Lua chon khong hop le, moi nhap lai: ")
        }
    }while (selection != 4)
}