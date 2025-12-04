package dsa.course.dsa.pattern


fun main(){
    //print(squarePattern(5))
//    println(rightTriangle(5))
    println( pyramid())
    //println(levelUp())
    println(diamondPattern(5))
}

fun squarePattern(numbers: Int){

    for (i in 0 until numbers){

        for (j in 0 until numbers){
            print("*")
        }
        println()
    }
}

// row is 5 column
fun  rightTriangle(num: Int){
    for (i in 0 until num){
        for (j in 0 until num -i){
            print("${ j + 1} ")
        }
        println()
    }
}

// row 0 ->

//row [0,1,2,3,4]
//start[4,3,2,1]

fun pyramid() {
    val n = 5

    for (i in 1..n) {

        for (space in 1..(n - i)) {
            print(" ")
        }
        for (star in 1..i) {
            print("* ")
        }
        println()
    }
}
fun okay() {
    val n = 5

    for (i in 0 until n) {

        // print spaces
        for (space in 0 until (n - i - 1)) {
            print(" ")
        }

        // print stars
        for (star in 0 until (2 * i + 1)) {
            print("*")
        }

        println()
    }
}
fun levelUp(){
    val n = 5
    for (i in 0 until n ){

        for (j in 0 until (2 * i) + 1){
            print("*")
        }
       println()
    }
}

fun diamondPattern(n:Int){
    for (i in 0 until n){
        for (space in 0..<n-i-1){
            print(" ")
        }
        for (j in 0 until (2 * i) + 1){
            print(j + 1)
        }
        println()
    }

}















