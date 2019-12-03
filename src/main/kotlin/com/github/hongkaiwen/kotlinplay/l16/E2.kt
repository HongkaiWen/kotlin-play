package com.github.hongkaiwen.kotlinplay.l16

fun main(args: Array<String>) {
    println(strLength(null))

    var c = Company("suzhou")
    var s = c.let { it.address ?: "not found" }
    println(s)

    var l = c.address ?: "not found"
    println(l)
}

fun strLength(input : String?) :Int {
    return input?.length ?: 0
}



class Company (val address: String?)

