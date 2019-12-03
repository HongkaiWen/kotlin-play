package com.github.hongkaiwen.kotlinplay.l16

fun main(args: Array<String>) {
    var r = with(StringBuilder("hello")) {
        append(" teacher!")
        toString()
    }
    println(r)
}