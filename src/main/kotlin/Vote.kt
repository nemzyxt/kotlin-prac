// Author : Nemuel Wainaina

/*
    Check whether or not user is eligible to vote
*/

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    while(true) {
        print("Enter your age : ")
        val age = reader.nextInt()
        if(age >= 18) {
            println("You are eligible to vote !")
        } else {
            println("You are illegible to vote !")
        }
    }
}