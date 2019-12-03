package com.github.hongkaiwen.kotlinplay.l10

class StringUtils {
    companion object {
        fun isEmpty(str: String) : Boolean {
            return "" == str
        }
    }
}

object XXUtils {
    @JvmStatic
    fun isBlank(str: String) : Boolean {
        return "" == str
    }
}

fun main(args: Array<String>) {
    println(StringUtils.isEmpty(""))
    println(XXUtils.isBlank("abc"))
}