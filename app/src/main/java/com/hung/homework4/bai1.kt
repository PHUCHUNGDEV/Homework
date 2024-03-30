package com.hung.homework4

/*Cho mảng số nguyen A = arrayOf(1,8,101,3,99.196)
- Tìm số lớn nhất trong một mảng số.
- Sắp xếp theo thứ tự tăng dần
- Tính tổng các số trong mảng
- Xuất ra các số trong mảng chia hết cho 2
*/
fun main() {
    val array: Array<Any> = arrayOf(1, 8, 101, 3, 99.196)

    // Tìm số lớn nhất trong mảng số
    var maxNumber: Int? = null
    for (element in array) {
        if (element is Int && (maxNumber == null || element > maxNumber)) {
            maxNumber = element
        }
    }
    println("Số lớn nhất trong mảng là: $maxNumber")

    // Sắp xếp theo thứ tự tăng dần
    val sortedArray = array.sort()
    println("Mảng sau khi sắp xếp là: $sortedArray")

    // Tính tổng các số trong mảng
    var sum = 0
    for (element in array) {
        if (element is Int) {
            sum += element
        }
    }
    println("Tổng các số trong mảng là: $sum")

    // Xuất ra các số trong mảng chia hết cho 2
    print("Các số trong mảng chia hết cho 2 là: ")
    for (element in array) {
        if (element is Int && element % 2 == 0) {
            print("$element ")
        }
    }
}
