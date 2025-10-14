package dsa.course.dsa

import java.util.Arrays

// To perform merge sort, we need to follow a few steps.
// First, we divide the array repeatedly until each subarray contains a single element.
// Once we reach single elements, they are considered sorted.
// Then, we proceed to merge these subarrays using the two-way merging process,
// which is based on the principle of merging sorted arrays.

fun main() {
    val testedArray = arrayOf(13, 5, 9, 21, 2, 16)
    val sorter = MergeSort()
    sorter.divideLogic(testedArray, 0, testedArray.size - 1)
    println("Sorted array: ${testedArray.contentToString()}")
    val checkThis = arrayOf(13,5,9,21,2,16)
    println(testedArray.sliceArray(0..4).contentToString())
    println(testedArray.sliceArray(0..1).contentToString())
    println(testedArray.sliceArray(0..0).contentToString())
    println(testedArray.sliceArray(1..1).contentToString())
    println(testedArray.sliceArray(1..2).contentToString())
    println(testedArray.sliceArray(2..3).contentToString())
    println(testedArray.sliceArray(3..4).contentToString())


}

class MergeSort {
    fun divideLogic(testedArray: Array<Int>, low: Int, high: Int) {
        if (low < high) { // 0 < 5
            val middle = (low + high) / 2
            divideLogic(testedArray, low, middle)
            divideLogic(testedArray, middle + 1, high)
            merge(testedArray, low, middle, high)
        }
    }

    fun merge(testedArray: Array<Int>, low: Int, middle: Int, high: Int) {
        val leftArray = arrayOfNulls<Int>(middle - low + 1)
        val rightArray = arrayOfNulls<Int>(high - middle)
        var i = 0
        var j = 0
        var k = low

        for (i in leftArray.indices) {
            leftArray[i] = testedArray[low + i]
        }

        for (j in rightArray.indices) {
           rightArray[j] = testedArray[middle + 1 + j]
        }
        println(leftArray.contentToString())
        println(rightArray.contentToString())
        println(testedArray.contentToString())

        while (i < leftArray.size && j < rightArray.size) {
            if (leftArray[i]!! < rightArray[j]!!) {
                testedArray[k] = leftArray[i]!!
                i++
            } else {
                testedArray[k] = rightArray[j]!!
                j++
            }
            k++
        }

        while (i < leftArray.size) {
            testedArray[k] = leftArray[i]!!
            i++
            k++
        }

        while (i < rightArray.size) {
            testedArray[k] = rightArray[j]!!
            j++
            k++
        }
    }

}
