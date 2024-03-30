package com.hung.homework1.bai3

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Vui lòng nhập đúng 3 số làm độ dài cạnh của tam giác.")
        return
    }

    // Lấy giá trị độ dài cạnh từ tham số dòng lệnh
    val side1 = args[0].toDouble()
    val side2 = args[1].toDouble()
    val side3 = args[2].toDouble()

    // Kiểm tra xem ba số có phải là ba cạnh của một tam giác hay không
    if (isTriangle(side1, side2, side3)) {
        // Xác định loại tam giác
        val triangleType = triangleType(side1, side2, side3)
        println("Ba số này là ba cạnh của một tam giác $triangleType.")
    } else {
        println("Ba số này không phải là ba cạnh của một tam giác.")
    }
}

// Hàm kiểm tra xem ba số có phải là ba cạnh của một tam giác hay không
fun isTriangle(side1: Double, side2: Double, side3: Double): Boolean {
    return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1) // boolean phải return lại
}

// Hàm xác định loại tam giác
fun triangleType(side1: Double, side2: Double, side3: Double): String {
    return when {
        (side1 == side2 && side2 == side3) -> "đều"
        (side1 == side2 || side1 == side3 || side2 == side3) -> "cân"
        (side1 * side1 + side2 * side2 == side3 * side3 ||
                side1 * side1 + side3 * side3 == side2 * side2 ||
                side2 * side2 + side3 * side3 == side1 * side1) -> "vuông"
        else -> "thường"
    }
}
