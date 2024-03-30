package com.hung.homework6.ex2

class personManagement {
    private val personList = mutableListOf<person>()

    fun addPerson(){
        println("Nhap loai can bo theo quy uoc: 1 - Cong nhan, 2 - Ky su, 3 - Nhan vien")
        val type = readln().toIntOrNull() ?: return

        // nhap tung thanh phan
        println("Nhap ho ten: ")
        val fullname = readln()
        println("Nhap tuoi: ")
        val age: Int = readln().toInt()
        println("Nhap gioi tinh: ")
        val gender = readln()
        println("Nhap dia chi: ")
        val address = readln()

        //

        when(type){
            1 -> {
                println("Nhap bac cong nhan: ")
                val rank = readln()
                personList.add(worker(fullname, age, gender, address, rank))
            }
            2 -> {
                println("Nhap chuyen nganh dao tao: ")
                val specialized = readln()
                personList.add(engineer(fullname, age, gender, address, specialized))
            }
            3 -> {
                println("Nhap chi tiet cong viec nhan vien: ")
                val jobDetail = readln()
                personList.add(employee(fullname, age, gender, address,jobDetail))
            }
        }

    }
    fun search(){
        println("Nhap ten can tim: ")
        val searchName = readln()
        val searchList = personList.filter { it.name == searchName }
        if (searchList.isEmpty()){
            println("Thong tin can tim: $searchList")
            searchList.forEach { it.exportInf() }
        }
        else{
            println("Khong tim thay!")
        }
    }
    fun listOfPerson(){
        println("Danh sach can bo: ")
        personList.forEachIndexed { index, person ->
            println("So thu tu: ${index+1}")
            person.exportInf()
            println()
        }
    }
}