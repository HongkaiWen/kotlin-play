package com.github.hongkaiwen.kotlinplay.l16

fun main(args: Array<String>) {
    var s = Student("1", "zhangsan").also { it.name = "inited by also" }.also { println(it) }
    var s1 = Student("2", "lisi").apply { this.name = "inited by apply" }.apply { println(this) }
}