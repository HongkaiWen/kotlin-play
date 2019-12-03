package com.github.hongkaiwen.kotlinplay.l13


class Student(var name: String, var age: Int) {
    operator fun component1() = name
    operator fun component2() = age

}

fun main(args: Array<String>) {
    var s = Student("zhangsan", 12)
    var (name, age) = s
    println("$name $age")

    var mapVal = mapOf<String, String>("name" to "zhangsan", "age" to "12")
    for ((k, v) in mapVal) {
        println("$k $v")
    }
}