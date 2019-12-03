package com.github.hongkaiwen.kotlinplay.l17

fun Any.println() = println(this)

data class Foo(var x: Int, var y:Int)

operator fun Foo.plus(other: Foo): Foo = Foo(x + other.x, y + other.y)

fun main(args: Array<String>) {
    var f1 = Foo(1, 2)
    var f2 = Foo(3, 4)
    var f3 = f1 + f2
    f3.println()
}