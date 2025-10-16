package dsa.course.dsa


fun main() {
    val newArrays = arrayOf(13, 5, 9, 21, 2, 16)
    println("Original Array ${newArrays.contentToString()}")
    val newInstanceSelectionSort = SelectionSort()
    newInstanceSelectionSort.selectionSort(newArrays)
    println("Sorted Selection ${newArrays.contentToString()}")
}

class SelectionSort {
    fun selectionSort(newArrays: Array<Int>) {
        val minIndex = 0

        if (newArrays[minIndex] > newArrays[1]) {


        }

    }

}


// first iteration i is 0 ==> indexOfMinValue = 0  13 > 5 yes indexOfMinValue = 1
//second iteration i is 1 ==> indexOfMinValue = 1  5 > 9 No indexOfMinValue = 1
// thirs iteration i is 2 ===> indexOfMinValue = 1 5 > 21 No indexOfMinValue = 1
// fouth iteration i is 3 ====> indexOfMinValue = 1  5 > 2 yes indexOfMinValue = 4
// fith  iteration i is 4 ======> indexOfMinValue = 4 2 > 16 No indexOfMinValue = 4