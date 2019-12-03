package com.github.hongkaiwen.kotlinplay.step1

var age: Int = 18
var size = 3

var name: String = "hello"

fun main(args: Array<String>) {
    var r = printPlay(name)
    println(r)
    println(sayHello("xiaoming"))
}

fun printPlay(str: String): String{
    println("我的名字是： ${name}")
    return str
}

fun sayHello(name: String): String {
    return "hello $name"
}