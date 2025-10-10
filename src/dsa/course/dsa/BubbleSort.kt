package dsa.course.dsa

import java.util.*

fun main() {
    val arr1 = arrayOf(5, 3, 6, 15, 9, 1)
    val newInstanceBubbleSort = BubbleSort()
    newInstanceBubbleSort.bubbleSort(arr1)
    println(Arrays.toString(arr1))
}

class BubbleSort {
    // What is sort + bubble : Allow sorting from low or high part also we can achieved
    // this by comparing adjacent number and place the smallest number in the smallest index once we found big number in small index.
    fun bubbleSort(arr1: Array<Int>) {
        // inner for loop is to compare /outer for loop is iteration
        for (i in arr1.indices) {
            for (j in  0 until arr1.size-1) {
                if (arr1[j] > arr1[j + 1])  swapLogic(arr1, j)
            }
        }
    }

    private fun swapLogic(arr1: Array<Int>, j: Int) {
        val swap = arr1[j] // 5
        arr1[j] = arr1[j + 1]  //
        arr1[j + 1] = swap
    }

}