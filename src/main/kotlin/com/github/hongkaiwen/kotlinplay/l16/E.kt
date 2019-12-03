package com.github.hongkaiwen.kotlinplay.l16

data class E(var name: String)

/**
 * l 16 scope functions
 */
fun main(args: Array<String>) {
    var e = E("zhangsan")
    e.apply(initE).let{println(it)}
    e.apply(initE).run{println(this)}

    e.apply{this.name = "zhangsan"}.takeIf { it.name == "zhangsan" }?.also{println(it)} ?: println("is not zhangsan")
    e.apply{this.name = "Lisi"}.takeIf { it.name == "zhangsan" }?.also{println(it)} ?: println("is not zhangsan")
    println(e)
    e.also {
        println(it)
    }
    e.apply{
        println(this)
    }
}

var initE = {e: E -> e.name = "E"}