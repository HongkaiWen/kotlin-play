package com.github.hongkaiwen.kotlinplay.l16

/**
 * https://kotlinexpertise.com/coping-with-kotlins-scope-functions/
 */
fun main(args: Array<String>) {
    val s = createString { //here we're in the context of a StringBuilder
        append(4)
        append("hello")
    }
    println(s)

    StringBuilder("abc").apply {
        append(toString().length)
    }.let { println(it) }  //既然：闭包如果只有一个参数，在闭包里可以用it引用这个参数 why cannot  .let { (ss: StringBuilder) -> println(ss) }
//    StringBuilder("abc").also { append(toString().length) }.let { println(it) }

    "hello".let({s: String -> println(s)})
    "hello".let { s: String -> println(s) }
    //如果lambda只有一个参数，参数可以省略，并用it代替
    "hello".let { println(it) }
}

inline fun createString(block: StringBuilder.() -> Unit): String {
    val sb = StringBuilder()
    sb.block()
    return sb.toString()
}