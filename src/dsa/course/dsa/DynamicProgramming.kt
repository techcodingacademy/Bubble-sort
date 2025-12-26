package dsa.course.dsa

import java.util.TreeMap


fun main(){
    //val newHashmap:HashMap<String, Int> = hashMapOf()
    val newCache: HashMap<String, Int> = hashMapOf()
    val dp = DynamicProgramming()
   val resultDp =  dp.fib(25,newCache)
    println(resultDp)
    println(newCache)
   println(TreeMap(newCache))

//{fib5=5, fib4=3, fib3=2, fib2=1, fib1=1, fib0=0}
}
class DynamicProgramming {
    val newCache: HashMap<String, Int> = hashMapOf()
    fun fib(n: Int, newHashmap: HashMap<String, Int>): Int {
        if (newCache.containsKey("fib$n")) {
            return newCache.getValue("fib$n")
        }

        if (n == 1 || n == 0) {
            newCache.put("fib$n",n)
            return n
        } else {
            val sum = fib(n - 1, newHashmap) + fib(n - 2, newHashmap)
            newCache.put("fib$n",sum)
            return sum
        }
    }
}































