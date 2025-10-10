package dsa.course.dsa

import java.util.Arrays
import java.util.Comparator

fun main() {
    val newInstanceClass = TwoWayMerge()
    val arr1 = arrayOf(10, 20, 50, 70, 60).sortedArray()
    val arr2 = arrayOf(30, 50, 6, 3, 5).sortedArray()
    val newArray = arrayOfNulls<Int>(arr1.size + arr2.size)

    newInstanceClass.twoWayMerging(arr1, arr2,newArray)
    println(Arrays.toString(arr1))
    println(Arrays.toString(arr2))
    println("New Merge Array: ${Arrays.toString(newArray)}")

}

class TwoWayMerge {
    fun twoWayMerging(arr1: Array<Int>, arr2: Array<Int>,newArray:Array<Int?>) {
        var i = 0
        var j = 0
        var k = 0

        while (i < arr1.size && j < arr2.size) {
            if (arr1[i] < arr2[j]) {
                newArray[k] = arr1[i]
                i++
            } else {
                newArray[k] = arr2[j]
                j++
            }
            k++
        }
        while (i < arr1.size) {
            newArray[k] = arr1[i]
            i++
            k++
        }

        while (j < arr2.size) {
            newArray[k] = arr2[j]
            j++
            k++
        }
    }
     fun <T:Comparator<T>> Array<T>.needSorted():Array<T>{
         if (this.isEmpty()) return this
         return this.copyOf().apply { sort() }
    }

}