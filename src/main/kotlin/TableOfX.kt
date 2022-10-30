// Author : Nemuel Wainaina

/*
    Print out the table of number entered by the user
*/

import java.util.Scanner

fun printTable(x: Int) {
    for(n in 1..10) {
        println("$x x $n = ${x * n}")
    }
}

fun main() {
    val reader = Scanner(System.`in`)

    while(true) {
        print("Enter the number whose table you want : ")
        val x = reader.nextInt()
        printTable(x)
    }
}