package dsa.course.dsa

import java.util.Scanner


fun main() {
    val binarySearchImp = BinarySearchImplementation()
    binarySearchImp.toAddData(10)
    binarySearchImp.toAddData(12)
    binarySearchImp.toAddData(50)
    binarySearchImp.toAddData(20)
    binarySearchImp.toAddData(30)
    binarySearchImp.toAddData(40)
    binarySearchImp.toAddData(60)
    binarySearchImp.toAddData(90)
    binarySearchImp.printInOrder()
    println("Inorder Traversal: ")
    println("Found: ${binarySearchImp.search(10)}")


}

class BinarySearchImplementation {
    data class Node(val data: Int, var left: Node? = null, var right: Node? = null)

    var root: Node? = null
    fun toAddData(data: Int) {
        val newNodeCreated = Node(data)
        if (root == null) {
            root = newNodeCreated
            return
        } else {
            var current = root
            while (true) {
                if (data < current?.data!!) {
                    if (current.left == null) {
                        current.left = newNodeCreated
                        return
                    } else {
                        current = current.left
                    }

                } else {
                    if (current.right == null) {
                        current.right = newNodeCreated
                        return
                    } else {
                        current = current.right
                    }
                }
            }
        }
    }

    fun search(value: Int): Boolean {
        var current = root
        while (current != null) {
            if (value == current.data) {
                return true
            } else if (value < current.data) {
                current = current.left
            } else {
                current = current.right
            }
        }
        return false
    }

    fun printInOrder(node: Node? = root) {
        if (node == null) return
        printInOrder(node.left)
        print("${node.data} ")
        printInOrder(node.right)
    }
}
