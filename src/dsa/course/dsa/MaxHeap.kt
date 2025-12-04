package dsa.course.dsa


fun main(){
    val newArray = arrayOf(20,30,50,60,70,90,100)
    val maxHeapImp = MaxHeap()
    maxHeapImp.maxHeapImp(newArray)
}
class MaxHeap {
    data class Node(val data:Int,val left:Node? = null,val right:Node? =null)

    fun maxHeapImp(newArray: Array<Int>) {
        val sizeOfArray = newArray.size
        val indexOflastParent = (sizeOfArray/2) -1


    }

}