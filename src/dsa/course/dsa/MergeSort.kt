package dsa.course.dsa

import java.util.Arrays

fun main() {
    val newMergeSort = MergeSort()
    val testedArray = arrayOf(13, 5, 9, 21, 2, 16)
    newMergeSort.divideLogic(testedArray, low = 0, high = testedArray.size - 1)
    println(Arrays.toString(testedArray))
    val checkThis = arrayOf(60,70,50,30,40)
    println(checkThis.sliceArray(0..4).contentToString())
    println(checkThis.sliceArray(0..1).contentToString())
    println(checkThis.sliceArray(0..0).contentToString())
    println(checkThis.sliceArray(1..1).contentToString())
    println( checkThis.sliceArray(1..2).contentToString())
    println( checkThis.sliceArray(2..3).contentToString())
    println( checkThis.sliceArray(3..4).contentToString())


}

class MergeSort {
    fun divideLogic(testedArray: Array<Int>, low: Int, high: Int) {
        if (low < high) {
            val middle = (low + high) / 2
            println("Divide by ${testedArray.sliceArray(low..high).contentToString()}")
            println("Left division ${testedArray.sliceArray(low..middle).contentToString()}")
            println("Right division ${testedArray.sliceArray(middle + 1 .. high).contentToString()}")
            println("-----------------------------------------------------------------------------------")
            divideLogic(testedArray, low, middle) // 0 and 2
            divideLogic(testedArray, middle + 1, high)
        }
    }
}