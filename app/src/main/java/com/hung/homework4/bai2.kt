package com.hung.homework4
/*Viết chương trình nhập vào một mảng gồm n số nguyên và thực hiện các công việc sau:

- Xuất các giá trị của mảng ra
- Tìm min, max
- Đếm các phần tử là số chẵn
- Tìm các số nguyên tố có trong mảng
- Sắp xếp mảng theo thứ tự tăng dần
*/

fun main() {
    // Nhập vào số phần tử của mảng
    print("Nhập số phần tử của mảng: ")
    val n = readln().toInt()

    // Khởi tạo mảng và nhập giá trị cho từng phần tử
    val arr = IntArray(n)
    println("Nhập các phần tử của mảng:")
    for (i in 0 until n) {
        print("Phần tử thứ $i: ")
        arr[i] = readLine()?.toIntOrNull() ?: 0
    }

    // Xuất các giá trị của mảng ra
    println("Các giá trị của mảng là: ${arr.joinToString()}")

    // Tìm min, max
    val min = arr.minOrNull()
    val max = arr.maxOrNull()
    println("Giá trị nhỏ nhất trong mảng là: $min")
    println("Giá trị lớn nhất trong mảng là: $max")

    // Đếm số phần tử là số chẵn
    val countEven = arr.count { it % 2 == 0 }
    println("Số lượng phần tử là số chẵn trong mảng là: $countEven")

    // Tìm các số nguyên tố có trong mảng
    val primes = arr.filter { it.isPrime() }
    println("Các số nguyên tố trong mảng là: ${primes.joinToString()}")

    // Sắp xếp mảng theo thứ tự tăng dần
    arr.sort()
    println("Mảng sau khi sắp xếp là: ${arr.joinToString()}")
}

// Hàm kiểm tra số nguyên tố
fun Int.isPrime(): Boolean {
    if (this <= 1) return false
    for (i in 2 until this) {
        if (this % i == 0) return false
    }
    return true
}
