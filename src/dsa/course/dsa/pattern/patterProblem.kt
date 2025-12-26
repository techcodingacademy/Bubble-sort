package dsa.course.dsa.pattern

import java.util.Arrays


fun main(){
    //print(squarePattern(5))
//    println(rightTriangle(5))
    println( pyramid())
    //println(levelUp())
    val newMultiDimensionArray = arrayOf(
        arrayOf(1,2,3,4),
        arrayOf(6,7,8,0),
       arrayOf(4,5,6,6)
    )
    val newMultiDimensionArray1 = arrayOf(
        arrayOf(1,2,3,4),
        arrayOf(6,7,8,0),
        arrayOf(4,5,6,6)
    )
    println(diamondPattern(5))
    invertedTriangle(5)
    newTriangle(5)
    //processMatrix(newMultiDimensionArray,newMultiDimensionArray1)
    processMatrixAdd(newMultiDimensionArray,newMultiDimensionArray1)
    findMaxAndMin()

}

fun squarePattern(numbers: Int){

    for (i in 0 until numbers){

        for (j in 0 until numbers){
            print("*")
        }
        println()
    }
}

// row is 5 column
fun  rightTriangle(num: Int){
    for (i in 0 until num){
        for (j in 0 until num -i){
            print("${ j + 1} ")
        }
        println()
    }
}

// row 0 ->

//row [0,1,2,3,4]
//start[4,3,2,1]

fun pyramid() {
    val n = 5

    for (i in 1..n) {

        for (space in 1..(n - i)) {
            print(" ")
        }
        for (star in 1..i) {
            print("* ")
        }
        println()
    }
}
fun okay() {
    val n = 5

    for (i in 0 until n) {

        // print spaces
        for (space in 0 until (n - i - 1)) {
            print(" ")
        }

        // print stars
        for (star in 0 until (2 * i + 1)) {
            print("*")
        }

        println()
    }
}
fun levelUp(){
    val n = 5
    for (i in 0 until n ){

        for (j in 0 until (2 * i) + 1){
            print("*")
        }
       println()
    }
}

fun diamondPattern(n:Int){
    for (i in 0 until n){
        for (space in 0..<n-i-1){
            print(" ")
        }
        for (j in 0 until (2 * i) + 1){
            print(j + 1)
        }
        println()
    }

}
//
//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//You may assume the two numbers do not contain any leading zeros, except the number 0 itself.

//Input: Two linked lists of integers
//out: sum as a linked list
// own word: I am giving two non-negative or empty linked lists, the digits are stored in reverse order,
// I need to iterate over the two lists, each number, adding each number together.Finally, return sum as a linkedlist

//0,1,2,3,4
//

fun invertedTriangle(n: Int){
    for (i in 0 until n){

        for (j in 0 until i + 1){
            print(j+1)
        }
        println()
    }
}

fun newTriangle(n: Int){
    for (i in 0 until n){ // n = 5
        for (space in 0 until (n-1)-i){
            print(" ")
        }
        for (j in 0 until (2 * i) + 1){
            print("*")
        }
        println()
    }
}
fun processMatrix(matrix: Array<Array<Int>>, matrix2: Array<Array<Int>>) {
    // out for loop need to handle the row
    for (i in matrix.indices){ //i = 0,
        for (j in matrix[i].indices){
            print("${intArrayOf(i) + intArrayOf(j)}" +  " ")
        }
        println()
    }
}
data class Node(var data: Int, var left: Node?=null, var right: Node?=null)

fun mirrorImageOfTree(root: Node?) {
    if (root == null) {
        return
    } else {
        mirrorImageOfTree(root.left)
        mirrorImageOfTree(root.right)
        swapNode(root)
    }

}

fun swapNode(root: Node?) {
    if (root == null) {
        return
    } else {
        val tempNode = root.left
        root.left = root.right
        root.right = tempNode
    }
}

fun processMatrixAdd(matrix1: Array<Array<Int>>, matrix2: Array<Array<Int>>) {
    // out for loop needs to handle the row
    val row1 = matrix1.size-1
    val column1 = matrix1[0].size-1
    val row2 = matrix2.size -1
    val column2 = matrix2[0].size -1
    if (row1!=row2 || column1 != column2){
        return
    }else{
        val result = Array(row1){ IntArray(column1) }
        println(result.contentDeepToString())
        for (i in 0 until row1){
            for (j in 0 until column1){
                result[i][j] = matrix1[row1][column1] + matrix2[row2][column2]
            }
        }
        println(result.contentDeepToString())
    }

}
 //(2 * 4) and (4 * 2)


fun matrixMultiplication(matrixA: Array<IntArray>,matrixB: Array<IntArray>){
    val rowA = matrixA.size-1
    val columnA = matrixA[0].size-1
    val rowB = matrixB.size-1
    val columnB = matrixB[0].size-1

    if (columnA != rowB){
        return
    }else{
        val bothResult = Array(rowA){ IntArray(columnB) }
        //Here we start our matrix multiplication

    }

}

fun findMaxAndMin(){
    print("Enter the size of the array: ")
    val numbers = List(readLine()!!.toInt()) { i ->
        print("Enter number ${i + 1}: ")
        readLine()!!.toInt()
    }

    println("Maximum value: ${numbers.maxOrNull()}")
    println("Minimum value: ${numbers.minOrNull()}")
}

fun findMaxUsingForLoop(){
    print("Enter the size of the array: ")
    val n = readln().toInt()
    val numbers = IntArray(n)

    for (i in 0 until n) {
        print("Enter element ${i + 1}: ")
        numbers[i] = readln().toInt()
    }

    var maxValue = numbers[0]
    var minValue = numbers[0]

    for (num in numbers) {
        if (num > maxValue) maxValue = num
        if (num < minValue) minValue = num
    }

    println("Maximum value: $maxValue")
    println("Minimum value: $minValue")
}



