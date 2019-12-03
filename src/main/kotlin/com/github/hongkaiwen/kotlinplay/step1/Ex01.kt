package com.github.hongkaiwen.kotlinplay.step1

fun main(args: Array<String>) {
    var age = 18
//    var name = "zs"
    var name: String = "zhangsan"
    println("%d %s")
}

object Utils {

    @JvmStatic
    fun hei(str: String?){
        println("$str")
    }
}