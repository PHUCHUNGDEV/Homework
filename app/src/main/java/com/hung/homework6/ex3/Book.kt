package com.hung.homework6.ex3

class Book(
    documentID: String,
    publisher: String,
    quantity: Int,
    private var authorName: String,
    private var numberOfPage: Int
) : Document(documentID, publisher, quantity) {

    override fun showInf() {
        println("Mã tài liệu: $documentID")
        println("Tên nhà xuất bản: $publisher")
        println("Số bản phát hành: $quantity")
        println("Tên tác giả: $authorName")
        println("Số trang: $numberOfPage")
    }
}