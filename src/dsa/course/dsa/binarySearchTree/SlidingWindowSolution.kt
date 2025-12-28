package dsa.course.dsa.binarySearchTree


fun main(){
    val slidingWindow = SlidingWindowSolution()
    val newArray = arrayOf(5,10,15,20,25,30,35,40,45)
    println(slidingWindow.slidingWindowProblem(newArray,4))
    println(slidingWindow.twoSumWithIndex(arrayOf(2, 7, 11, 15),9))
    //Array: [2, 7, 11, 15], target = 9
}
class SlidingWindowSolution {
    //Find the minimum total expenses in any 10 consecutive days.

    fun slidingWindowProblem(workingArray: Array<Int>,windowSize: Int): Int{
       var currentWindowSum = 0
        for (i in 0 until windowSize){ // 0 to 3
            currentWindowSum += workingArray[i]
        }
        var maxSum = currentWindowSum
        for (i in windowSize until workingArray.size){ // 4 to 8
            currentWindowSum = currentWindowSum - workingArray[i - windowSize] + workingArray[i]
            maxSum = maxOf(currentWindowSum,maxSum)
        }
       return maxSum
    }
    fun twoSumWithIndex(array4: Array<Int>, targetSum: Int): IntArray {
         if (array4.size < targetSum) return intArrayOf()
         val newHashMap = HashMap<Int, Int>()
        for (i in 0 until array4.size-1){
            val compliment = targetSum - array4[i]
            if (newHashMap.containsKey(compliment)){
                return intArrayOf(newHashMap[compliment]!!,i)
            }else{
                newHashMap[array4[i]] = i
            }

        }
        return intArrayOf()
    }

}