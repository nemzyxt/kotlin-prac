// Author : Nemuel Wainaina

/*
    Check and tell whether a number is even or odd
*/

import java.util.Scanner

fun evenOrOdd(n: Int) {
    if(n % 2 == 0) {
        println("$n is an even number")
    } else {
        // odd number
        println("$n is an odd number")
    }
}

fun main() {
    val reader = Scanner(System.`in`)

    while(true) {
        print("Enter a number : ")
        val n = reader.nextInt()
        evenOrOdd(n)
        println()
    }
}