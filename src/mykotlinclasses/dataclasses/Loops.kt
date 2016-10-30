package mykotlinclasses.dataclasses

/**
 * Created by rkodekar on 10/31/16.
 */
class Loops {

    fun work() {
        for (a in 1..100) {
            println(a)
        }

        val numbers = 1..100

        for (b in numbers) {
            print(b)
        }

        for (a in 100 downTo 1) {
            println(a)
        }

        for (a in 100..1) {
            println(a)
        }

        for (b in 100 downTo 1 step 10) {
            println(b)
        }

        val citiesInMah = listOf("Mumbai", "Kohlapur", "Nagpur")

        for (cities in citiesInMah) {
            println(cities)
        }

        var i = 100
        while (i > 4) {
            i--
        }
        println("Value of i with while loop now is $i")

        do {
            i--
        }while (i > 6)
        println("Value of i with do while loop now is $i")

        loop@ for (l in 1..100) {
            for (j in 1..100) {
                if (j % l == 0) {
                    println("value of j is $j")
                    continue
                }
            }
        }
     }
}