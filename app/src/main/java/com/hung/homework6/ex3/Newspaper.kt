package com.hung.homework6.ex3

class Newspaper(
    documentID: String,
    publisher: String,
    quantity: Int,
    private var releaseDate: String
): Document(documentID, publisher, quantity) {
    override fun showInf() {
        println("Mã tài liệu: $documentID")
        println("Tên nhà xuất bản: $publisher")
        println("Số bản phát hành: $quantity")
        println("Ngày phát hành: $releaseDate")
    }

}