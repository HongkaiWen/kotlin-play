package com.github.hongkaiwen.kotlinplay.step2

fun main(args: Array<String>) {
    var s = Student()
    s.hello()
    fun Student.test() = this.apply {
        println("student test")
    }

    fun Student.test2() = println("student test2")

    s.test()
    s.test2()

    doFilter(object : XFilter {
        override fun filter(): Boolean {
            return false
        }
    })

    x(null)
    x(Student())
}

fun doFilter(f: XFilter){
    println(f.filter())
}

fun x(s: Student?){
    s?.let {
        it.hello()
    }
}