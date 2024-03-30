package com.hung.homework6.ex2

open class person {
    constructor()
    constructor(name: String?, age: Int?, gender: String?, address: String?)

    var name: String? = null
    var age: Int? = null
    var gender: String? = null
    var address: String? = null



    open fun exportInf(){
        println("Ten: $name")
        println("Gioi tinh: $gender")
        println("Dia chi: $address")
        println("Tuoi: $age")
    }
}