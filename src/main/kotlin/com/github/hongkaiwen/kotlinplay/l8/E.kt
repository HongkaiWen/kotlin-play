package com.github.hongkaiwen.kotlinplay.l8

fun main(args: Array<String>) {
    onlyif(true) {
        println("ddd")
    }

    println(doSth()())
}

fun onlyif(isDebug: Boolean, block: () -> Unit){
    if(isDebug) block()
}

fun doSth(): () -> String {
    var name = "xiaoming"
    return {name}
}
