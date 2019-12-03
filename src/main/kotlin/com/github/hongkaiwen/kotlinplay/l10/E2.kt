package com.github.hongkaiwen.kotlinplay.l10

class Student private constructor() {

    companion object {
        fun get() :Student {
            return Holder.instance
        }
    }

    private object Holder {
        var instance: Student = Student()
    }

}

fun main(args: Array<String>) {
    println(Student.get())
    println(Student.get())
}