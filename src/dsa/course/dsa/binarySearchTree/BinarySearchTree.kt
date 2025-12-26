package dsa.course.dsa.binarySearchTree

import java.util.Arrays
import java.util.LinkedList
import java.util.Stack


fun main(){
    val message = listOf(
        "H   H  AAAAA  PPPP  PPPP  Y   Y",
        "H   H  A   A  P   P P   P  Y Y ",
        "HHHHH  AAAAA  PPPP  PPPP    Y  ",
        "H   H  A   A  P     P       Y  ",
        "H   H  A   A  P     P       Y  ",
        "",
        "BBBB   III  RRRR  TTTTT H   H DDDD  AAAAA Y   Y",
        "B   B   I   R   R   T   H   H D   D A   A  Y Y ",
        "BBBB    I   RRRR    T   HHHHH D   D AAAAA   Y  ",
        "B   B   I   R  R    T   H   H D   D A   A   Y  ",
        "BBBB   III  R   R   T   H   H DDDD  A   A   Y  "
    )

    // Animation: type out each character and add "jump" effect
    for (line in message) {
        // Typing effect
        for (char in line) {
            print(char)
            Thread.sleep(30) // smaller delay = faster typing
        }
        println()
        Thread.sleep(100) // short pause at end of line for bounce effect
    }

    // Animate "🎉 Happy Birthday! 🎉" with bouncing effect
    val greeting = "🎉 Happy Birthday! 🎉"
    for (i in 0..3) { // repeat bouncing 3 times
        print("\r") // return cursor to start of line
        repeat(i) { print(" ") } // shift text right to simulate jump
        print(greeting)
        Thread.sleep(300)
    }
    println()

//    Array (sorted): [2, 5, 8, 12, 16, 23, 38]
//    Target: 16
    121

//    val workingArray = arrayOf(
//        arrayOf(15,8,3,14),
//        arrayOf(21,25,5,19)
//
//
//    )
//
//    val newBinary = BinarySearchTree()
//    //val result = newBinary.leftViewOfaTree(root = arr2,)
//   // println(result)
//    println(newBinary.completeBracket("{[(]})"))
//    println(newBinary.diagonalSum(workingArray))
//    println(newBinary.palidrom(121))
//    newBinary.mergeLinklist()
//   //println(newBinary.p(121))
//    newBinary.findLcm(arrayOf(2,6,10,7,5))
//    val quickKvMap = arrayOf(2,6,10,7,5).associateWith { it * 2 }
//    println("Woew ${quickKvMap.keys}")
}


data class Node(val data: Int, val left: Node? = null, val right: Node? = null)
class BinarySearchTree {

    fun maxValue(root: Node?): Int {
        if (root != null){
            maxValue(root.right)
        }
        return root?.data ?: 0
    }
    fun maxValue2(root: Node?): Int {
        var current = root
        while (root != null) {
            current = root.right!!
        }
        return 0
    }

    fun binarySearch(arr1: Array<Int>,target: Int,low: Int,high: Int): Int{
          var l = low
          var h = high
        while (l <= h){
            val middle = l + (h-l)/ 2
            if (arr1[middle] == target){
                return middle
            }else if (arr1[middle] < target){
               l = middle + 1
            }else{
               h = middle - 1
            }
        }
        return - 1
    }
    fun leftViewOfaTree(root: Node?, arr2: ArrayList<Int>, level: Int) {
        if (root == null) return
        if (level == arr2.size) {
            arr2.add(root.data)
        }
        leftViewOfaTree(root.left, arr2, level + 1)
        leftViewOfaTree(root.right, arr2, level + 1)
    }

    fun checkCloseBracket(str: String){
        val stack = ArrayDeque<Int>()
        for (char in str){
            if (char ==  ']' || char == '}' || char == ')'){
               println("Yes  $char")
               //stack.addLast()
            }
        }
    }
    fun diagonalSum(mat: Array<Array<Int>>){
        var sum = 0
        for (i in 0 until mat.size){

            for (j in 0 until mat.size){

                if (i == j || i + j == mat.size-1){
                    sum += mat[i][j]
                }
            }

        }
        println("Sum of the diagonal $sum")
    }
    fun palidrom(x:Int): Boolean{

       when {
           x.toString() == x.toString().reversed() -> return true
       }
        return false
    }
    fun completeBracket(str: String): Boolean{
        val stack = ArrayDeque<Char>()
        val charArray = str.toCharArray()
        for (i in charArray.indices){
            if (charArray[i] == '{' || charArray[i] == '[' || charArray[i] == '('){
                stack.add(charArray[i])
            }else{
               if (stack.removeLast()!= '[' || stack.removeLast() != '{' || stack.removeLast() != '(')  return false
            }
        }
        return stack.isEmpty()
    }
    fun mergeLinklist(){
        val lists = LinkedList<Int>()
        println("Empty LinkedList ${lists.isEmpty()}")
        val stack = Stack<Int>() //LIFO last in first out FILO first in last out

    }

    fun findLcm(arrNew: Array<Int>){
        //2,6,10,7,5
        val divisor = 2

    }

    fun pangram(sentence: String): Boolean {
        val letters = mutableSetOf<Char>()

        for (ch in sentence) {
            letters.add(ch)
        }

        return letters.size == 26
    }
    //sum  11 // [2,7,9] find minimum
    fun coinChange(arr: Array<Int>,sum: Int){
        val minimum = 0
        
    }


}
// 11 - 9 = 2
// 2 - 2 = 0
// 11 -












