// Author : Nemuel Wainaina

/*
    Tell the day of the week given the day number
*/

import java.util.Scanner

fun resolveDay(dayNum: Int): String {
    val day = when(dayNum) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day number :("
    }
    return day
}

fun main() {
    val reader = Scanner(System.`in`)

    while(true) {
        print("Enter the day number : ")
        val dayNum = reader.nextInt()
        println(resolveDay(dayNum))
    }
}
