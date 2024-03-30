package com.hung.homework6.ex2

class employee:person {
    constructor()
    constructor(name: String, age: Int, gender: String, address: String): super(name, age, gender, address)
    constructor(fullname: String, age: Int, gender: String, address: String, jobDetail: String)

    var jobDetail: String? = null

    override fun exportInf() {
        super.exportInf()
        println("Chi tiet cong viec cua nhan vien $name la: $jobDetail ")
    }
}
