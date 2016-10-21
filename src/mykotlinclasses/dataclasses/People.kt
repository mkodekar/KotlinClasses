package mykotlinclasses.dataclasses

/**
 * Created by rkodekar on 10/22/16.
 */
// this is a normal data clas in kotlin which is exactly
// what plain old java or pojo class is which has various getters
// and setters in java, in kotlin its just one line

/*
 * part 2 , data annotation.
 */
// lets just annotate this with data annotation to see the effect
data class People (var id: Int, var name: String, var email: String)