package com.github.hongkaiwen.kotlinplay.l16

data class Student(var teacherId : String, var name: String)

var teachers = mapOf("1" to "Mr. Fang", "2" to "Mrs. Xi")

/**
 * https://kotlinexpertise.com/coping-with-kotlins-scope-functions/
 */
fun main(args: Array<String>) {
    var s = Student("10", "zhangsan")
    var teacher = s.let {
        teachers[it.teacherId] ?: "teacher not found"
    }
    println("student ${s.name}'s teacher is $teacher")
}