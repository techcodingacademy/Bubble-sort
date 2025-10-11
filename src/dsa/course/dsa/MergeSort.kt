package dsa.course.dsa

import java.util.Arrays
// To perform merge sort, we need to follow a few steps.
// First, we divide the array repeatedly until each subarray contains a single element.
// Once we reach single elements, they are considered sorted.
// Then, we proceed to merge these subarrays using the two-way merging process,
// which is based on the principle of merging sorted arrays.

fun main() {
    val newMergeSort = MergeSort()
    val testedArray = arrayOf(13,5,9,21,2,16)
    newMergeSort.divideLogic(testedArray, low = 0, high = testedArray.size - 1)
    println(Arrays.toString(testedArray))
    //val checkThis = arrayOf(13,5,9,21,2,16)
    println(testedArray.sliceArray(0..4).contentToString())
    println(testedArray.sliceArray(0..1).contentToString())
    println(testedArray.sliceArray(0..0).contentToString())
    println(testedArray.sliceArray(1..1).contentToString())
    println( testedArray.sliceArray(1..2).contentToString())
    println( testedArray.sliceArray(2..3).contentToString())
    println( testedArray.sliceArray(3..4).contentToString())


}

class MergeSort {
    fun divideLogic(testedArray: Array<Int>, low: Int, high: Int) {
        if (low < high) {
            val middle = (low + high) / 2 //[13, 5, 9, 21, 2, 1]  ==> [13,5,9] and [21,2,1]

            println("Divide by ${testedArray.sliceArray(low..high).contentToString()}")
            println("Left division ${testedArray.sliceArray(low..middle).contentToString()}")
            println("Right division ${testedArray.sliceArray(middle + 1 .. high).contentToString()}")
            println("-----------------------------------------------------------------------------------")
            divideLogic(testedArray, low, middle) // 0 and 2
            divideLogic(testedArray, middle + 1, high)
        }
    }
    fun twoWaysMerge(){

    }
}
