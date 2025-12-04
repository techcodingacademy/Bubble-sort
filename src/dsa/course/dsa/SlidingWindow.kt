package dsa.course.dsa

fun main(){
    val array1 = arrayOf(2,9,31,-4,21,7)
    val instance = SlidingWindow()
    println(instance.maxSum(array1,3))
}
class SlidingWindow {

    fun maxSum(newArray:Array<Int>,windowLength:Int){
        var windowSum = 0 //42
        val maxSum = 0
        for (i in 0 until windowLength){
            windowSum += newArray[i]
        }
        for (i in windowLength until newArray.size){
            println(newArray.size)
        }

    }
}

