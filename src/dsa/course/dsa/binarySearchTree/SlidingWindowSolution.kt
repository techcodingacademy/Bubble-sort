package dsa.course.dsa.binarySearchTree


fun main(){
    val slidingWindow = SlidingWindowSolution()
    val newArray = arrayOf(5,10,15,20,25,30,35,40,45)
    println(slidingWindow.slidingWindowProblem(newArray,3))
}
class SlidingWindowSolution {
    //Find the minimum total expenses in any 10 consecutive days.

    fun slidingWindowProblem(workingArray: Array<Int>,windowSize: Int): Int{
        // 0 to 2
        // len is 0 to 8
        var currentSum = 0

        for (i in  0 until windowSize){
            currentSum += workingArray[i]
        }
       var minSum = currentSum
       for (i in windowSize until workingArray.size-1){

           currentSum = currentSum- workingArray[i-windowSize] + workingArray[windowSize]
            minSum = minOf(minSum,currentSum)
       }

        return  minSum
    }

}