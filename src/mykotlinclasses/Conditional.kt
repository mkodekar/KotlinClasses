package mykotlinclasses

import java.util.*

/**
 * Created by rkodekar on 10/31/16.
 */
class Conditional {

    val intVal: Int = 6
    val intVal2: String = "Value"
    var exampleArray: ArrayList <Int> = ArrayList()


    fun main(args: Array<String>) {
        exampleArray.add(2)
        exampleArray.add(4)
        exampleArray.add(5)
        exampleArray.add(6)
        exampleArray.add(8)
        exampleArray.add(10)

        var pos: Int = 0
        for (example in exampleArray) {
            println("This is from example loop $example")
            val whenValue = when(example) {

                5 -> {
                    println("The value you passed is : $example")
                    println("Lets change it ")
                    8
                }
                is Int -> {
                    println("The passed value is an Integer")
                    7
                }
                else -> {
                    println("The integer you passed did not work")
                    6
                }
            }
            println(whenValue)
            pos =example
        }
        do {
            print("This is position $pos \n")
        }while (pos > 1 && pos < 10)



        val whenValue2 = when(intVal2) {

            "Value" -> {
                println("The value of intval2 is $intVal2" )
                println("Let change it")
                "Returning from the first when case"
            }
            is String -> {
                println("Yes $intVal2 is a String")
                "Remove that"
            }
            else -> {
                println("It came to this?")
                "This warning is now gone"
            }
        }
        println(whenValue2)
    }
}