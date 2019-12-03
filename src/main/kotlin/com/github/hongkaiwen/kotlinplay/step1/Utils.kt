package com.github.hongkaiwen.kotlinplay.step1

import kotlin.reflect.KClass

fun add(a: Int, b: Int): Int{
    return a + b
}

object Student {

    fun hello(name: String){
        println("你好啊 $name")
    }
}

fun main(args: Array<String>) {
    Student.hello("zhangsan")
    testClass(Entry::class.java)
    println(Entry.`in`)
    testKClass(com.github.hongkaiwen.kotlinplay.step1.KClass::class)
    A.a.putNumber(1)
}

fun testClass(clazz: Class<Entry>){
    println(clazz.simpleName)
}

fun testKClass(clazz: KClass<com.github.hongkaiwen.kotlinplay.step1.KClass>){
    println(clazz.simpleName)
}