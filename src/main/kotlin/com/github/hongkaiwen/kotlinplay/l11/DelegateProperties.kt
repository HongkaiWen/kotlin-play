package com.github.hongkaiwen.kotlinplay.l11

class Foo {
    init {
        println("foo init")
    }
    fun isValid():Boolean = false
    fun doSomething(){
        println("do sth")
    }
}

fun example(computeFoo: () -> Foo) {
    val memoizedFoo by lazy(computeFoo)
    if (1 == 2) {
        memoizedFoo.doSomething()
    }
}

fun main(args: Array<String>) {
    example { Foo() }
}