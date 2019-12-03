package com.github.hongkaiwen.kotlinplay.l17

fun main(args: Array<String>) {
    var name = "zhangsan"
    println("ang" in name)

    for (i in 1..10 step 4) {
        println(i)
    }

    //对string类型来讲
    //== --> java equal
    //=== --》 java ==
    var z1 = "abc"
    var z2 = String(z1.toByteArray())
    println("z1 $z1 z2 $z2")
    println(z1 == z2)
    println(z1 === z2)
}

