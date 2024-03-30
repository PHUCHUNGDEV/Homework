package com.hung.homework6.ex2


class worker: person {
    constructor()
    constructor(name: String, age: Int, gender: String, address: String): super(name, age, gender, address)
    constructor(fullname: String, age: Int, gender: String, address: String, rank: String)

    private var rank: String? = null

    override fun exportInf() {
        super.exportInf()
        println("Bac cong nhan: $rank")
    }
}