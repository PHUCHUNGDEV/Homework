package com.hung.homework3

// so hoan hao trong khoang {1..1000}

// funtion check so hoan hao

fun isPerfect(n: Int): Boolean{
    var sum = 0
    var divisor = 1 // uoc so

    while (divisor < n){
        if (n % divisor==0 ){
            sum += divisor
        }
        divisor ++
    }
    return sum == n
}
fun main() {
    var n = 1
    println("Các số hoàn hảo trong khoảng từ 1 đến 1000 là:")
    do {
        if (isPerfect(n)) {
            println(n)
        }
        n++
    } while (n <= 1000)
}