package com.github.hongkaiwen.kotlinplay.l11

interface Animal {
 fun bark()
}

class Dog : Animal {
    override fun bark(){
        println("wang")
    }
}

class Zoo(animal: Animal): Animal by animal {

    override fun bark(){
        println("before")
//        animal.bark()  编译错误
        println("after")
    }

}

fun main(args: Array<String>) {
    Dog().bark()
    Zoo(Dog()).bark()
}