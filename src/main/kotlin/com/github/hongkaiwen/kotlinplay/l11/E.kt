package com.github.hongkaiwen.kotlinplay.l11

data class Student(var age: Int, var name: String)

fun main(args: Array<String>) {
    var s = Student(12, "zhangsan")
    println(s.toString())
    println(s.age)
    println(s.name)
    s.age = 14
    s.name = "lisi"
    println(s.age)
    println(s.name)

    exec(Action.UP)
}

sealed class Action{
    object UP: Action()
    object DOWN: Action()
}

fun exec(action: Action) = when(action){
    Action.UP -> {
        println("up")
    }
    Action.DOWN -> {
        println("down")
    }
}