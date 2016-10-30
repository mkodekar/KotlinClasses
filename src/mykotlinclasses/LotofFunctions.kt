package mykotlinclasses

/**
 * Created by rkodekar on 10/30/16.
 */
fun doSomthing(name: String, age: Int = 0, toUpperCase: Boolean = false) {
    if (toUpperCase) {
        name.toUpperCase()
        println("your name is : ${name.toUpperCase()} and your age is : $age")
    } else {
        println("your name is : $name and your age is : $age")
    }
}

fun main(args: Array<String>) {
    val conditionals : Conditional = Conditional()
    doSomthing("Rehan", 26, true)
    conditionals.main(args)
}