package com.hung.homework3

// nhap n>0
// xac dinh xem n co phai so nguyen to khong
// hoi nguoi dung co muon tiep tuc chuong trinh khong?

// lap ham kiem tra nguyen to

fun isNguyenTo(n: Int): Boolean{
    if (n <= 1) {
        return false
    }
    for (i in 2 until n) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}
fun main() {
    println("nhap n: ")
    var n = readln().toInt()

    do {
//        check case n=1
        if (n == 1)
        {
            println("1 la so nguyen to dac biet")
            return
        }
//        other case
        if (n > 0){
        val nguyento = isNguyenTo(n)
            if (nguyento){
                println("So $n la so nguyen to")
            }
            else println("$n khong phai so nguyen to")
        }
        else{
            println("dieu kien: n>0")
        }
        println("ban co muon tiep tuc phan mem khong y/n?")
        val tieptuc = readln()
        var yes = tieptuc == "y"
    }
        while (yes)
}