package com.github.hongkaiwen.kotlinplay.l17

/**
https://www.jianshu.com/p/d445209091f0
*/
fun main(args: Array<String>) {
    var name : String? = null
    name ifNullAlert "姓名不能为空"

}

infix fun <T> T.ifNullAlert(x: String){
    if (this == null) {
        throw RuntimeException(x)
    }
}

//println("我" append "爱你")
infix fun String.append(x: String): String{
    return "$this - $x"
}