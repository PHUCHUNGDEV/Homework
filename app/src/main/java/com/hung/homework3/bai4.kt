package com.hung.homework3

/*
Kiểm tra 1 số có phải là số nguyên tố hay không.
- Nếu là số nguyên tố thì tính giá trị biểu thức
S = 1!+2!+3!+...+n! trong đó n là số nguyên tố được nhập từ bàn phím.
- Nếu không phải là số nguyên tố yêu cầu nhập lại.
**/


// lap ham kiem tra nguyen to

fun soNguyenTo(n: Int): Boolean{
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

// funtion tinh giai thua
fun giaithua(n: Int): Long{
    var result = 1L
    for (i in 2..n) {
        result *= i
    }
    return result
}
fun main() {
    println("nhap n: ")
    var n = readln().toInt()
    var sum: Long = 0L

    do {
//        check case n=1
        if (n == 1)
        {
            println("1 la so nguyen to dac biet")
            return
        }
//        other case
        if (n > 0){
            val nguyento = soNguyenTo(n)
            if (nguyento){
                println("So $n la so nguyen to")
                for (i in 1..n){
                    sum += giaithua(i)
                }
                println("gia tri bieu thuc S = 1!+2!+3!+...+n! la: $sum")
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