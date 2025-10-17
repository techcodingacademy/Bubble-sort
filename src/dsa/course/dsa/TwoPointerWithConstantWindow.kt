package dsa.course.dsa

fun main() {
    //val arr20 = arrayOf(-1, 2, 3, 3, 4, 5, -1)
    val arr20 = arrayOf(3, 1, 2, 1, 1)
    val newArray = arrayOf(6,2,3,4,7,2,1,7,1)
    val createNewInstance = TwoPointerWithConstantWindow()
    println("MaxSum ${createNewInstance.sumOfConstantWindow(arr20, k = 5)}")
    println("==================================================")
    println("Numbers of valid windows ${createNewInstance.numberOfValidWindows(arr20, k = 4)}")
    println("==================================================")
    println("Longest windows ${createNewInstance.longestLengths(arr20,4)}")
    println("New pointer card ${createNewInstance.maxPointFromCard(newArray, k = 4)}")

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
            //expand window size
            currentSum += arr[right]
            //Shrink window size
            while (currentSum > k) {
                currentSum -= arr[left]
                left++
            }
            //Check for the valid length of the window
            val windoLenght = right - left + 1
            //Check for the valid length of the window
            longestLength = maxOf(longestLength, windoLenght)
        }
        return longestLength
    }

    fun maxPointFromCard(arr10: Array<Int>, k: Int):Int{
        //(6,2,3,4,7,2,1,7,1)
        var leftSum = 0 // 15
        var rightSum = 0
        for (i in 0 until k) { // i = 0,1,2,3
            leftSum += arr10[i] // 6 + 2 + 3 + 4

        }
        var totalSumSeen = leftSum

        for (j in 0 until k){
            // 0 to 3
            //So the k-1-j shows the movement from right to left adding and reducing base on k value
            leftSum -= arr10[k - 1 - j]
            rightSum += arr10[arr10.size - 1 - j]
            totalSumSeen = maxOf(totalSumSeen,leftSum + rightSum)
        }
        return totalSumSeen
    }

}






















