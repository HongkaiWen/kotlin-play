package com.github.hongkaiwen.kotlinplay.l5

import com.github.hongkaiwen.kotlinplay.step2.Student
import java.io.File

fun main(args: Array<String>) {
    var ts = TeacherService(Student())
    ts.sHello()

    var r = ts.getStudentName()
    println(r)

    var f = File("pom.xml")
    println(f.readText())
    println(ts.fuza())
    println("haha".s)

    println(listOf("a", "b", "c").joinToString(prefix = "[", postfix = "]"))

}

public fun TeacherService.getStudentName():String  = "hello"

public fun TeacherService.fuza(name: String = "haha"):String {
    return name
}


var String.s: Int
    get() = this.length
    set(value){
        //set方法并没有field可以用来存储value，
        //其实际作用是使用通过value来操作调用者，即this
        println(this.plus(value))
    }

fun <T> Collection<T>.joinToString(
        separator: String = ",",
        prefix: String = "",
        postfix: String = ""
): String{
    val result = StringBuilder(prefix)
    for ((index, value) in this.withIndex()) {
        if (index > 0) {
            result.append(separator)
        }
        result.append(value)
    }
    result.append(postfix)
    return result.toString()
}