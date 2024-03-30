package com.hung.homework4
/*Viết chương trình tìm tất cả các số chia hết cho 5 nhưng không phải bội số của 3, nằm trong đoạn 5 và 100 (tính cả 5 và 100).
 Các số thu được sẽ được in thành chuỗi trên một dòng, cách nhau bằng dấu phẩy.
*/
fun main() {
    val result = findNumbers(5, 100)
    println("Các số chia hết cho 5 nhưng không phải bội số của 3 từ 5 đến 100 là:")
    println(result.joinToString(", "))
}

fun findNumbers(start: Int, end: Int): List<Int> {
    val numbers = mutableListOf<Int>()
    for (i in start..end) {
        if (i % 5 == 0 && i % 3 != 0) {
            numbers.add(i)
        }
    }
    return numbers
}
