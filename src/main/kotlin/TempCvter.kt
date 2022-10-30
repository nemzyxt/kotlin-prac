// Author : Nemuel Wainaina

/*
    Convert temperature from degrees celsius to fahrenheit and vice versa
*/

import java.util.Scanner

fun banner() {
    println("TEMPERATURE CVTER")
    println("=================")
}

fun cvtTemp(flag: Int, temp: Float): Double {
    /*
        flag == 1 : degrees celsius -> fahrenheit
        flag == 2 : fahrenheit -> degrees celsius
    */
    val result: Double = if(flag == 1) {
        (temp * 1.8) + 32
    } else {
        (temp - 32) / 1.8
    }
    return result
}

fun displayTemp(flag: Int, result: Double) {
    if(flag == 1) {
        println("The temperature in Fahrenheit : $result")
    } else {
        // degrees celsius
        println("The temperature in Degrees Celsius : $result")
    }
}

fun main() {
    banner()

    val reader = Scanner(System.`in`)

    while(true) {
        println("1. Degrees Celsius to Fahrenheit")
        println("2. Fahrenheit to Degrees Celsius")
        print("Enter your choice : ")
        val flag = reader.nextInt()
        if(flag !in 1..2) {
            println("Choose either 1 or 2 :(")
            println()
            continue
        }
        print("Enter the temperature to convert : ")
        val temp = reader.nextFloat()

        // now do the conversion
        val result = cvtTemp(flag, temp)
        displayTemp(flag, result)
        println()
    }
}