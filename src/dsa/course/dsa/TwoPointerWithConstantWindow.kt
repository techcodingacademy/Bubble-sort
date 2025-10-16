package dsa.course.dsa

fun main() {
    //val arr20 = arrayOf(-1, 2, 3, 3, 4, 5, -1)
    val arr20 = arrayOf(3, 1, 2, 1, 1)
    val createNewInstance = TwoPointerWithConstantWindow()
    println("MaxSum ${createNewInstance.sumOfConstantWindow(arr20, k = 5)}")
    println("==================================================")
    println("Numbers of valid windows ${createNewInstance.numberOfValidWindows(arr20, k = 4)}")
    println("==================================================")
    println("Longest windows ${createNewInstance.longestLengths(arr20,4)}")

}

class TwoPointerWithConstantWindow {
    fun sumOfConstantWindow(arr20: Array<Int>, k: Int):Int {
        //(-1,2,3,3,4,5,-1)
        var currentSum = 0
        for (i in 0 until k) currentSum += arr20[i]
        var maxSun = currentSum
        var left = 0
        for (right in k until  arr20.size) { // 4 to 5
            currentSum+= arr20[right] - arr20[left]
            left++
            maxSun = maxOf(maxSun, currentSum)
        }
        return maxSun
    }

    fun numberOfValidWindows(arr: Array<Int>, k: Int):Int {
        //(1,2,3,3,4) k <= 6
        var currentSum = 0 //1
        var longestLength = 0//3
        var left = 0
        for (right in arr.indices) {
            currentSum += arr[right]
            if (currentSum <= k) {
                longestLength++
            } else {
                currentSum -= arr[left]
                left++
            }
        }
        return longestLength
    }

    fun longestLengths(arr: Array<Int>, k: Int): Int {
        //(1,2,3,3,4) k <= 6
        var currentSum = 0 //1
        var longestLength = 0//3
        var left = 0
        for (right in arr.indices) {
            currentSum += arr[right]
            while (currentSum > k) {
                currentSum -= arr[left]
                left++
            }
            val windoLenght = right - left + 1
            longestLength = maxOf(longestLength, windoLenght)
        }
        return longestLength
    }

}