package com.github.hongkaiwen.kotlinplay.l15

fun main(args: Array<String>) {
    var ages = arrayListOf(1, 2, 3, 4, 5, 6)
    ages.map { it - 1 }
            .filter { it > 0 }
            .reduce{i1, i2 -> i1 + i2}
            .also { println(it) }
    ages.convert { it + 1 }.forEach{println(it)}

}

inline fun <T, E> Iterable<T>.convert(action: (T) -> E): MutableList<E> {
    val result = mutableListOf<E>()
    for(i in this){
        result.add(action(i))
    }
    return result
}