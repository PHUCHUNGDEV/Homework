package com.hung.homework6.ex3

class BookManager {
    private var documentList: MutableList<Document> = mutableListOf()

    fun addDocument(document: Document){
        documentList.add(document)
    }

    fun removeDocument(documentID: String){
        val iterator = documentList.iterator()
        while (iterator.hasNext()){
            val document = iterator.next()
            if (document.documentID == documentID){
                iterator.remove()
                println("Đã xoá tài liệu có mã $documentID")
                return
            }
        }
        println("Không tìm thấy tài liệu cần xóa")
    }

    fun showDocumentInf(){
        for (document in documentList){
            document.showInf()
            println()
        }
    }

    fun searchInType(type: String){
        val searchList = documentList.filter {it:: class.simpleName == type}
        if (documentList.isNotEmpty()){
            println("Danh sách: ")
            for (document in documentList){
                document.showInf()
                println()
            }
        }
        else{
            println("Không tìm thấy!")
        }
    }
    fun removeByID(){
        println("Nhập mã tài liệu cần xóa: ")
        val documentID: String = readln()
        removeDocument(documentID)
    }
}