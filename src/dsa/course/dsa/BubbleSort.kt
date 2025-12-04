package dsa.course.dsa

import java.util.*

fun main() {
//    val arr1 = arrayOf(5, 3, 6, 15, 9, 1)
//    val newInstanceBubbleSort = BubbleSort()
//    newInstanceBubbleSort.bubbleSort(arr1)
//    println(Arrays.toString(arr1))
//    solidSquarePattern(4)
//    rightAngledTriangle(4)
//    invertedRightAngled(5)
    starPyramid(5)
    println(bruteForceApproach(arrayOf(1, 2, 4, 6, 8, 9, 14, 15),13))
    println("Enter numbers")
    val grabNum = readln().toInt()
   println(checkEvenOrOdd(grabNum))
    println(checkIfIsLeapYear(grabNum))
    println(checkPositiveOrNot(grabNum))
}

class BubbleSort {
    // What is sort + bubble: Allow sorting from the low or high part, also, we can achieve
    //This is achieved by comparing adjacent numbers and placing the smallest number in the smallest index once a large number is found in a small index.
    fun bubbleSort(arr1: Array<Int>) {
        // inner for loop is to compare /outer for loop is iteration
        for (i in arr1.indices) { // n + 1
            for (j in  0 until arr1.size-1) { //n (n + 1)
                if (arr1[j] > arr1[j + 1])  swapLogic(arr1, j) // n(n)        n (n + 1) + n + 1 + n(n) ==> n^2 + n + n + 1 +  n^2
            }                                                                                               // 2n^2 + 2n + 1 = O(n^2)
        }
    }

    private fun swapLogic(arr1: Array<Int>, j: Int) {
        val swap = arr1[j] // 5
        arr1[j] = arr1[j + 1]  //
        arr1[j + 1] = swap
    }
}


fun solidSquarePattern(n: Int){
    for (i in 0 until n){

        for (j in 0 until n ){
            print("*")
        }
        println()
    }
}

fun rightAngledTriangle(n:Int){
    for (i in 0 until n){
        for (j in 0 until i +1){
            print(j + 1)
        }
        println()
    }

}

fun invertedRightAngled(n: Int){
    for (i in 0 until n){
        for (j in 0 until n-i){ // 0..5-0 ==> 0...5
            print("*")
        }
        println()
    }
}

fun starPyramid(n:Int){
    for (i in 0 until n){
        for (space in 0 until n-i -1){
            print(" ")
        }
       for (j in 0 until i + 1){
           print("* ")
       }
        println()
    }
}

//Example 2: Given a sorted array of unique integers and a target integer, return true if there exists a pair of numbers that sum to target, false otherwise. This problem is similar to Two Sum. (In Two Sum, the input is not sorted).
//
//For example, given nums = [1, 2, 4, 6, 8, 9, 14, 15] and target = 13, return true because 4 + 9 = 13.


fun something(arr: Array<Int>, target: Int): Boolean {
    var left = 0
    var right = arr.size - 1
    while (left <= right) {
        val sum = arr[left] + arr[right]
        if (sum == target) {
            return true
        }
        left++
        right--
    }
    return false
}

fun bruteForceApproach(arr: Array<Int>, target: Int): Boolean{

    for (i in arr.indices){
        for (j in i + 1 until arr.size){
            val sum = arr[i] + arr[j]
            if (sum == target){
                return true
            }
        }
    }
    return false
}


//1.	Check whether the given number N is even or odd. Return true if it is even, else false.
//Input 1: N = 4
//Output 1: true
//Explanation 1: 4 is an even number.
//
//Input 2: N = 7
//Output 2: false


//fun checkEvenOrOdd(num: Int?): Boolean{
//    for (i in 0 until (num?.plus(2) ?: 0)){
//        if (num?.rem(2) == 0)  return true
//    }
//    return false
//}
//
//fun checkIfIsLeapYear(year: Int): Boolean{
//    if (year % 4 == 0 && year % 400 == 0 ) return true
//    return false
//}
//
//fun checkPositiveOrNot(number: Int): Boolean {
//    if (number >= 0) {
//        return true
//    } else {
//        return false
//    }
//}


fun checkEvenOrOdd(num: Int?): Boolean {
    return num != null && num % 2 == 0
}

fun checkIfIsLeapYear(year: Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
}

fun checkPositiveOrNot(number: Int): Boolean = number >= 0


fun isMultipleOf3(num: Int): Boolean {
    return num % 3 == 0
}

















