package com.hung.homework4
// Viết chương trình phân tích số nguyên n thành các thừa số nguyên tố . Ví dụ: 100 = 2x2x5x5
fun main() {
    // Nhập số nguyên n cần phân tích
    print("Nhập số nguyên n: ")
    val n = readLine()?.toIntOrNull() ?: return

    // Phân tích số nguyên n thành các thừa số nguyên tố
    val primeFactors = findPrimeFactors(n)

    // In kết quả
    println("Các thừa số nguyên tố của $n là: ${primeFactors.joinToString(" x ")}")
}

// Hàm tìm các thừa số nguyên tố của một số nguyên
fun findPrimeFactors(n: Int): List<Int> {
    var num = n
    val factors = mutableListOf<Int>()

    // Phân tích n thành các thừa số nguyên tố
    var divisor = 2
    while (num > 1) {
        while (num % divisor == 0) {
            factors.add(divisor)
            num /= divisor
        }
        divisor++
    }

    return factors
}
