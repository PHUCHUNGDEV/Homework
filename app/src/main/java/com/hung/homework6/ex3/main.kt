package com.hung.homework6.ex3



fun main() {
    val bookManager = BookManager()
    println("---------------MENU--------------")
    println("Chọn thao tác cần thực hiện: ")
    println("1: Them moi tai lieu")
    println("2: Quan li tai lieu")
    println("3: Thoát")
    var selection: Int
    do {
        selection = readln().toInt()

        when(selection){
            1 -> {
                println("Chọn loại tài liệu cần thêm mới:")
                println("1: Sách")
                println("2: Tạp chí")
                println("3: Báo")
                println("4: Thoát")

                var choice: Int

                do {
                    choice = readln().toInt()

                    when(choice){
                        1 -> {
                            print("Nhập mã tài liệu: ")
                            val documentID = readln()
                            print("Nhập tên nhà xuất bản: ")
                            val publisher = readln()
                            print("Nhập số bản phát hành: ")
                            val quantity = readln().toInt()
                            print("Nhập tên tác giả: ")
                            val authorName = readln()
                            print("Nhập số trang: ")
                            val numberOfPage = readln().toInt()
                            val sach = Book(documentID, publisher, quantity, authorName, numberOfPage)
                            bookManager.addDocument(sach)
                        }
                        2 -> {
                            print("Nhập mã tài liệu: ")
                            val documentID = readln()
                            print("Nhập tên nhà xuất bản: ")
                            val publisher = readln()
                            print("Nhập số bản phát hành: ")
                            val quantity = readln().toInt()
                            print("Nhập số phát hành: ")
                            val issueNumber = readln().toInt()
                            print("Nhập tháng phát hành: ")
                            val releaseMonth = readln().toInt()
                            val megazine = Megazine(documentID, publisher, quantity, issueNumber, releaseMonth)
                            bookManager.addDocument(megazine)
                        }
                        3 -> {
                            print("Nhập mã tài liệu: ")
                            val documentID = readln()
                            print("Nhập tên nhà xuất bản: ")
                            val publisher = readln()
                            print("Nhập số bản phát hành: ")
                            val quantity = readln().toInt()
                            print("Nhập ngày phát hành (dd/MM/yyyy): ")
                            val releaseDate = readln()
                            val newspaper = Newspaper(documentID, publisher, quantity, releaseDate)
                            bookManager.addDocument(newspaper)
                        }
                        4 -> println("Đã thoát thêm tài liệu")
                        else -> println("Lựa chọn không hợp lệ")
                    }

                }while (choice != 4)

            }
            2 -> {
                println("Chọn thao tác quản lí cần thực hiện: ")
                println("1: Xóa tài liệu")
                println("2: Hiển thị thông tin tài liệu")
                println("3: Tìm kiếm tài liệu theo loại")
                println("4: Thoát")

                var choice: Int

                do {
                    choice = readln().toInt()
                    when(choice){
                        1 -> {
                            bookManager.removeByID()
                        }
                        2 -> {
                            bookManager.showDocumentInf()
                        }
                        3 -> {
                            println("Nhập loại tài liệu cần tìm: ")
                            val type: String = readln()
                            bookManager.searchInType(type)
                        }
                        4 -> println("Đã thoát quản lí tài liệu")
                        else -> println("Lựa chọn không hợp lệ")
                    }

                }while (choice != 4)
            }
            3 -> println(" Đã thoát chương trình")
        }
    }while (selection != 3)

}