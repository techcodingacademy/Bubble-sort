package dsa.course.dsa

import java.util.Arrays

fun main(){
    val newInstance = BubbleSortLogic()
    val newArray = arrayOf(13, 5, 9, 21, 2, 16)
    newInstance.bubbleSortLogic(newArray)
    println("Sorted Array : ${newArray.contentToString()}")
}
class BubbleSortLogic {
    fun bubbleSortLogic(array1: Array<Int>) {
       repeat(array1.size){
           for (i in 0 until array1.size-1){
               if (array1[i] > array1[i+1]){
                   swapMethod(array1,i)
               }
           }
       }
    }

    fun swapMethod(array1: Array<Int>, i: Int) {
        val temp = array1[i]
        array1[i] = array1[i + 1]
        array1[i + 1] = temp
    }

}