fun main() {
    val newArrayInstance = arrayOf(25, 13, 9, 3, 4, 10)
    val newInstance = QuickSort()
    newInstance.quickSort(newArrayInstance)
    println("Sorted Array ${newArrayInstance.contentToString()}")
}

class QuickSort {
    fun quickSort(newArrayInstance: Array<Int>) {
        val lastIndex = newArrayInstance.size-1
        var firstIndex = 0
        for (i in newArrayInstance.indices) {
            if (newArrayInstance[i] < newArrayInstance[lastIndex]) {
                val temp = newArrayInstance[firstIndex]


            }
            firstIndex++
        }
    }

}