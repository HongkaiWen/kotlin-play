package com.github.hongkaiwen.kotlinplay.l6


var hello = {s: String -> println(s)}

var h = {name: String, age: Int -> println("$name $age")}



fun main(args: Array<String>) {
    hello("hah")
    h("zhangsan", 13)

    var t = Thread{
        print("d")
    }

    t = Thread(){
        print("ddd")
    }



    t.start()
}

