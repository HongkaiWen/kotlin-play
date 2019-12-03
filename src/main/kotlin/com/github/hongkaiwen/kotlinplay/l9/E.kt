package com.github.hongkaiwen.kotlinplay.l9

class Student(var name: String) : Person(), Runer {
    init {
        println(name)
    }

    var age: Int = 0

    /**
     * 次级构造函数必须直接或间接的继承主构造函数或父级构造函数
     */
    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    override fun sayHi() {
        println("hi I'm $name, I'm $age years old")
    }

    override fun run() {
//        TODO("not implemented")
        println("student run")
    }
}

class Teacher : Person() {

}

fun main(args: Array<String>) {
    var s = Student("zhangsan")
    println(s.name)
    s.sayHi()
    s.run()
    s = Student("lisi", 14)
    s.sayHi()
}

open class Person {

    open fun sayHi(){
        println("hello")
    }

}

interface Runer {
    fun run()
}