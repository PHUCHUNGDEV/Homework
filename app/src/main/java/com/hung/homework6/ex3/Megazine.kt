package com.hung.homework6.ex3

class Megazine(
    documentID: String,
    publisher: String,
    quantity: Int,
    private var issueNumber: Int,
    private var releaseMonth: Int
): Document(documentID, publisher, quantity) {
    override fun showInf() {
        println("Mã tài liệu: $documentID")
        println("Tên nhà xuất bản: $publisher")
        println("Số bản phát hành: $quantity")
        println("Số phát hành: $issueNumber")
        println("Tháng phát hành: $releaseMonth")
    }
}