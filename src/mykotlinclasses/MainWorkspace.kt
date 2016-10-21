package mykotlinclasses

import mykotlinclasses.dataclasses.People

/**
 * Created by rkodekar on 10/22/16.
 */
fun main(args: Array<String>) {
    val people: People = People(1, "Rehan Kodekar", "mkodekar@zoho.com")
    val people1: People = People(1, "Rehan Kodekar", "mkodekar@zoho.com")

    println(people)

    if (people == people1) {
        println("The same")
    } else {
        println("different")
    }
}