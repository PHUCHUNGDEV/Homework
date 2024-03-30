package com.hung.homework6.ex2

class engineer: person {
    constructor()
    constructor(name: String, age: Int, gender: String, address: String): super(name, age, gender, address)
    constructor(fullname: String, age: Int, gender: String, address: String, specialized: String)

    private var specialized: String? = null

    override fun exportInf() {
        super.exportInf()
        println("Chuyen nganh dao tao: $specialized")
    }
}