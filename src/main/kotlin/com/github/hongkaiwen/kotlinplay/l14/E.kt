package com.github.hongkaiwen.kotlinplay.l14

fun main(args: Array<String>) {
    for (i in 1..10) {
        println(i)
    }

    for (i in 1..10 step 2) {
        println(i)
    }

    for (i in 1 until 10) {
        println(i)
    }

    for(i in 10 downTo 0){
        println(i)
    }

    repeat(10){
        println(it)
    }

    var names = arrayListOf<String>("zhangsan", "lisi")

    for (name in names) {
        println(name)
    }

    for ((index, str2) in names.withIndex()) {
        println("$index    $str2")
    }
}