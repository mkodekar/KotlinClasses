package mykotlinclasses

import mykotlinclasses.dataclasses.People

/**
 * Created by rkodekar on 10/22/16.
 */
fun main(args: Array<String>) {
    // lets  say i have declared the data class here ,  -- > if you are refering to this class first , read the people.kt class in dataclass folder and then read this.
    // twice because of comparing it, see the next commit for what actually happens
    // refer the output for this , named as without_annotation
    val people: People = People(1, "Rehan Kodekar", "mkodekar@zoho.com")
    val people1: People = People(1, "Rehan Kodekar", "mkodekar@zoho.com")

    println(people)

    if (people == people1) {
        println("The same")
    } else {
        println("different")
    }
}